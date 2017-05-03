package com.zh.server;

import java.util.ResourceBundle;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.util.concurrent.DefaultEventExecutorGroup;
import io.netty.util.concurrent.EventExecutorGroup;

import org.apache.log4j.Logger;

import com.zh.monitor.Monitor;

/**
 *@author: zzh
 *@createtime: 2016-2-29下午1:50:16
 *@version: V1.0
 *@Description:
 */
public class MiddleWareServer {
	private static final Logger logger=Logger.getLogger(MiddleWareServer.class);
	private static final ResourceBundle bundle = ResourceBundle.getBundle("config");
	private static final EventExecutorGroup executor=new DefaultEventExecutorGroup(Integer.parseInt(bundle.getString("eventExecutorGroupNum")));
	private static final int so_backlog = Integer.parseInt(bundle.getString("so_backlog"));
//	private static final int readTimeOut = Integer.parseInt(bundle.getString("readTimeOut"));
	private static final int aggregator = Integer.parseInt(bundle.getString("aggregator"));
	private static final EventLoopGroup bossGroup = new NioEventLoopGroup();
	private static final EventLoopGroup workerGroup = new NioEventLoopGroup();
	public void bind(int port) {
		// 配置服务端的NIO线程组
		try {
		    ServerBootstrap b = new ServerBootstrap();
		    b.group(bossGroup, workerGroup)
			    .channel(NioServerSocketChannel.class)
			    .option(ChannelOption.SO_BACKLOG, so_backlog)
			    .childHandler(new ChannelInitializer<SocketChannel>() {
                                @Override
                                public void initChannel(SocketChannel ch) throws Exception {
                                    //设置读超时
//                                	ch.pipeline().addLast("readTimeOut",new ReadTimeoutHandler(readTimeOut));
                                	//设置写超时
//                                	ch.pipeline().addLast("writeTimeOut",new WriteTimeoutHandler(12));
                                	// server端发送的是httpResponse，所以要使用HttpResponseEncoder进行编码
                                    ch.pipeline().addLast("encoder",new HttpResponseEncoder());
                                    // server端接收到的是httpRequest，所以要使用HttpRequestDecoder进行解码
                                    ch.pipeline().addLast("decoder",new HttpRequestDecoder());
                                    //HttpObjectAggregator会把多个消息转换为一个单一的FullHttpRequest或是FullHttpResponse
                                    ch.pipeline().addLast("aggregator", new HttpObjectAggregator(aggregator));
                                    //Handdle添加事务处理组设置
                                    ch.pipeline().addLast(executor,"handdler",new MiddleWareServerHanddler());
                                }
                            }).childOption(ChannelOption.SO_KEEPALIVE, true)
                            //使socket的time-wait状态得以重用
                            .childOption(ChannelOption.SO_REUSEADDR, true);
		    // 绑定端口，同步等待成功
		    ChannelFuture f = b.bind(port).sync();
		    logger.info("Netty服务已启动，端口为"+port);
		    System.out.println("Netty服务已启动，端口为"+port);
		    // 等待服务端监听端口关闭
		    f.channel().closeFuture().sync();
		}catch(Exception e){
			logger.error("Netty服务端出现异常："+e);
			e.printStackTrace();
		}finally {
		    // 优雅退出，释放线程池资源
		    bossGroup.shutdownGracefully();
		    workerGroup.shutdownGracefully();
		}
	}
	
	//main函数用于测试
	public static void main(String[] args) {
		try {
			Monitor.getInstance().startAllMonitor();//启动监控
			int port = Integer.parseInt(bundle.getString("port"));
			new MiddleWareServer().bind(port);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

