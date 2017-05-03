package com.zh.server;

import static io.netty.handler.codec.http.HttpHeaders.Names.CONNECTION;
import static io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_LENGTH;
import static io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_TYPE;
import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import static io.netty.util.CharsetUtil.UTF_8;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpHeaders.Values;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.timeout.TimeoutException;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.apache.log4j.Logger;

import com.zh.config.CommunicatePojo;
import com.zh.config.ExceptionMes;
import com.zh.config.InterfaceCode;
import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserRQ2;
import com.zh.interfaceManager.client.dpdd.IctOrderInfoByUserRS2Pojo;
import com.zh.interfaceManager.client.dpdd.InsurancePojo;
import com.zh.interfaceManager.client.dpdd.InsuranceRRTPojo;
import com.zh.interfaceManager.client.dpdd.ListIctOrderInfoByUserBO2Pojo;
import com.zh.interfaceManager.client.dpdd.ListInsuranceRRTPojo;
import com.zh.interfaceManager.client.jpk.JpkResult;
import com.zh.interfaceManager.client.jpk.Ticket_entrance;
import com.zh.interfaceManager.client.postvm.PosTvmEntity;
import com.zh.interfaceManager.client.postvm.PosTvmResult;
import com.zh.interfaceManager.client.pym.ObjRsInfo;
import com.zh.interfaceManager.client.pym.PymTest;
import com.zh.interfaceManager.client.realname.POPhoneVerificationCode;
import com.zh.interfaceManager.client.realname.POQueryBundlingMobile;
import com.zh.interfaceManager.client.realname.POQueryUserInfo;
import com.zh.interfaceManager.client.realname.POSynchronizedUserByRegister;
import com.zh.interfaceManager.client.realname.POUnbundlMobile;
import com.zh.interfaceManager.client.realname.POVerifyRegisterUserStatus;
import com.zh.interfaceManager.client.realname.ReResponseEntityLogOutRegisterUser;
import com.zh.interfaceManager.client.realname.ReResponseEntityPassenger;
import com.zh.interfaceManager.client.realname.ReResponseEntityPhoneVerificationCode;
import com.zh.interfaceManager.client.realname.ReResponseEntityRegisterUser;
import com.zh.interfaceManager.client.realname.ReResponseEntityReisterUser;
import com.zh.interfaceManager.client.realname.ReResponseEntityVerifyMobile;
import com.zh.interfaceManager.service.dpdd.impl.DPDD;
import com.zh.interfaceManager.service.jpk.imp.JpkService;
import com.zh.interfaceManager.service.postvm.imp.PostTvmService;
import com.zh.interfaceManager.service.pym.PYM;
import com.zh.interfaceManager.service.realname.impl.RealName;
import com.zh.utils.ObjectUtil;
/**
 *@author: zzh
 *@createtime: 2016-2-29下午2:00:52
 *@version: V1.0
 *@Description:
 */
public class VeryImportantChangeMiddleWareServerHanddler extends SimpleChannelInboundHandler<FullHttpRequest>{
	private static final Logger logger=Logger.getLogger(VeryImportantChangeMiddleWareServerHanddler.class);
	private HttpRequest request;
	private FullHttpResponse response;
	@SuppressWarnings("rawtypes")
	private CommunicatePojo cp;
    @SuppressWarnings({ "rawtypes" })
	@Override
	public void channelRead(final ChannelHandlerContext ctx,  Object msg) throws Exception {
    	if (msg instanceof HttpRequest) {
            request = (HttpRequest) msg;
            System.out.println("uri为："+request.getUri());
        }
        if (msg instanceof HttpContent) {
            HttpContent content = (HttpContent) msg;
            ByteBuf buf = content.content();
            final CommunicatePojo object = (CommunicatePojo) ObjectUtil.unserialize(buf.toString(UTF_8));
//            String byteBufToString = ByteBufUtil.ByteBufToString(buf);
//            CommunicatePojo object = (CommunicatePojo) JsonUtil.json2Pojo(byteBufToString, RsInfo.class);
            buf.release();
            System.out.println("收到请求参数为："+object);
            logger.info("serverHanddle开始的--------"+Thread.currentThread().getName()+"..."+ctx.channel().id()+"-----------"+new Date()+".."+object);
            //对请求的信息回应相应的内容
            if(ctx.channel().isActive()&&ctx.channel().isWritable()){
//            	if(ctx.executor().inEventLoop()){
//            		doFlushCtx(ctx, object);
//            	}else{
//            		ctx.executor().execute(new Runnable() {
//						@Override
//						public void run() {
//							doFlushCtx(ctx, object);
//						}
//					});
//            	}
            	ctx.executor().execute(new Runnable() {
					@Override
					public void run() {
						doFlushCtx(ctx, object);
					}
				});
	            logger.info("serverHanddle结束的--------"+Thread.currentThread().getName()+"..."+ctx.channel().id()+"--------"+new Date()+"..."+cp);
            }
        }
    }
	@SuppressWarnings("rawtypes")
	private void doFlushCtx(ChannelHandlerContext ctx, CommunicatePojo object) {
		invokingInterface(object);
		response = responseMes(cp);
		setResponseHeaders(response);
		ctx.write(response);
		ctx.flush();
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void invokingInterface(CommunicatePojo object) {
		switch(object.getCode()){
		case InterfaceCode.queryStationNamesByPym:
			ObjRsInfo rsInfo = PYM.getpym().queryStationNamesByPym((PymTest)object.getO());
			System.out.println("拼音码接口返回数据："+rsInfo);
			cp=new CommunicatePojo(InterfaceCode.queryStationNamesByPym, rsInfo);
			break;

		case InterfaceCode.queryPOSTVMByPassengerAndTrade:
			PosTvmResult result = PostTvmService.getPosTvm().QuerypostTVM((PosTvmEntity)object.getO() );
			cp=new CommunicatePojo(InterfaceCode.queryPOSTVMByPassengerAndTrade, result);
			break;
		case InterfaceCode.jpkCode:
			System.out.println("jpkcode....");
			JpkResult jpkResult = JpkService.getJpkService().getCheckTicketWebService((Ticket_entrance) object.getO());
			cp=new CommunicatePojo(InterfaceCode.jpkCode, jpkResult);
			break;

		case InterfaceCode.getWWWZhcxFromWebService:
			ListIctOrderInfoByUserBO2Pojo wwwZhcxFromWebService = DPDD.getInstance().getWWWZhcxFromWebService((IctOrderInfoByUserRQ2) object.getO());
			System.out.println("订票订单接口返回数据："+wwwZhcxFromWebService);
			cp=new CommunicatePojo(InterfaceCode.getWWWZhcxFromWebService, wwwZhcxFromWebService);
			break;
		case InterfaceCode.getIctInsuranceRRT:
			InsuranceRRTPojo ictInsuranceRRT = DPDD.getInstance().getIctInsuranceRRT((InsurancePojo) object.getO());
			System.out.println("保险返回单个订单数据："+ictInsuranceRRT);
			cp=new CommunicatePojo(InterfaceCode.getIctInsuranceRRT, ictInsuranceRRT);
			break;
		case InterfaceCode.getInsuranceWebService:
			ListInsuranceRRTPojo insuranceWebService = DPDD.getInstance().getInsuranceWebService((InsurancePojo) object.getO());
			System.out.println("保险返回多个订单数据："+insuranceWebService);
			cp=new CommunicatePojo(InterfaceCode.getInsuranceWebService, insuranceWebService);
			break;
		case InterfaceCode.queryUserInfo:
			ReResponseEntityRegisterUser user = RealName.getInstance().ictQueryUserInfo((POQueryUserInfo) object.getO());
			System.out.println("实名制认证接口，获取注册信息："+user);
			cp=new CommunicatePojo(InterfaceCode.queryUserInfo,user);
			break;
		case InterfaceCode.passengerInfosFromWebService:
			ReResponseEntityPassenger reResponseEntityPassenger = RealName.getInstance().getPassengerInfosFromWebService((POQueryUserInfo) object.getO());
			System.out.println("实名制认证接口，获取常用联系人信息："+reResponseEntityPassenger);
			cp=new CommunicatePojo(InterfaceCode.passengerInfosFromWebService,reResponseEntityPassenger);
			break;
		case InterfaceCode.logOutRegisterUser:
			ReResponseEntityLogOutRegisterUser responseEntityLogOutRegisterUser = RealName.getInstance().logOutRegisterUser((POQueryUserInfo) object.getO());
			System.out.println("实名制认证接口，注销用户："+responseEntityLogOutRegisterUser);
			cp=new CommunicatePojo(InterfaceCode.logOutRegisterUser,responseEntityLogOutRegisterUser);
			break;
		case InterfaceCode.getVerifyRegisterUserStatus:
			ReResponseEntityReisterUser user1 = RealName.getInstance().getVerifyRegisterUserStatus((POVerifyRegisterUserStatus) object.getO());
			System.out.println("实名制认证接口，提交验证用户信息："+user1);
			cp=new CommunicatePojo(InterfaceCode.getVerifyRegisterUserStatus,user1);
			break;	
		case InterfaceCode.getSynchronizedUserByRegister:
			ReResponseEntityReisterUser user2 = RealName.getInstance().getSynchronizedUserByRegister((POSynchronizedUserByRegister) object.getO());
			System.out.println("实名制认证接口，同步常用联系人信息："+user2);
			cp=new CommunicatePojo(InterfaceCode.getSynchronizedUserByRegister,user2);
			break;
		case InterfaceCode.getPhoneVerificationCode:
			ReResponseEntityPhoneVerificationCode user3 = RealName.getInstance().getPhoneVerificationCode((POPhoneVerificationCode) object.getO());
			System.out.println("实名制认证接口，获取验证码："+user3);
			cp=new CommunicatePojo(InterfaceCode.getPhoneVerificationCode,user3);
			break;	
		case InterfaceCode.queryBundlingMobile:
			ReResponseEntityRegisterUser user4 = RealName.getInstance().ictQueryBundlingMobile((POQueryBundlingMobile) object.getO());
			System.out.println("实名制认证接口，根据手机号获取注册信息："+user4);
			cp=new CommunicatePojo(InterfaceCode.queryBundlingMobile,user4);
			break;
		case InterfaceCode.unbundlMobile:
			ReResponseEntityVerifyMobile user5 = RealName.getInstance().ictUnbundlMobile((POUnbundlMobile) object.getO());
			System.out.println("实名制认证接口，手机号解绑："+user5);
			cp=new CommunicatePojo(InterfaceCode.unbundlMobile,user5);
			break;	
		case InterfaceCode.getDealInfoWebService:
			 IctOrderInfoByUserRS2Pojo dealInfoWebService = DPDD.getInstance().getDealInfoWebService((IctOrderInfoByUserRQ2) object.getO());
			System.out.println("保险返回多个订单数据："+dealInfoWebService);
			cp=new CommunicatePojo(InterfaceCode.getDealInfoWebService, dealInfoWebService);
			break;
		default:
			System.out.println("暂时不能转换");
			cp=new CommunicatePojo(InterfaceCode.exceptionCode,new ExceptionMes("类暂时不能转换！！"));	
		}
	}
    /*
     * 设置请求头
     * */
	private void setResponseHeaders(FullHttpResponse response) {
		response.headers().set(CONTENT_TYPE, "text/plain");
		response.headers().set(CONTENT_LENGTH,response.content().readableBytes());
		if (HttpHeaders.isKeepAlive(request)) {
		    response.headers().set(CONNECTION, Values.KEEP_ALIVE);
		}
	}
	
	/*
	 * 把数据序列化后放入响应体中
	 * */
	@SuppressWarnings("rawtypes")
	private FullHttpResponse responseMes(CommunicatePojo rp){
		String res = ObjectUtil.serialize(rp);
		FullHttpResponse response=null;
		try {
			response = new DefaultFullHttpResponse(HTTP_1_1,OK, Unpooled.wrappedBuffer(res.getBytes("UTF-8")));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return response;
	} 
	
	 @Override
	    public void channelActive(ChannelHandlerContext ctx) throws Exception {
		 logger.info("channelActive--------"+Thread.currentThread().getName()+"..."+ctx.channel().id()+"-----------"+new Date());
	 }
	 @Override
	    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
	 }
    
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
    	ctx.flush();
    }

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
    	cause.printStackTrace();
		logger.error(cause);
    	if(cause instanceof TimeoutException){
    		cp=new CommunicatePojo(InterfaceCode.exceptionCode,new ExceptionMes("netty服务端超时异常"));
    	}else{
    		
    		cp=new CommunicatePojo(InterfaceCode.exceptionCode,new ExceptionMes("netty服务端出现异常，异常信息："+cause.getMessage()));
    	}
    	response=responseMes(cp);
		setResponseHeaders(response);
    	ctx.write(response);
        ctx.flush();
        ctx.close();
    }

	@Override
	protected void messageReceived(ChannelHandlerContext arg0,
			FullHttpRequest arg1) throws Exception {
		// TODO Auto-generated method stub
		
	}

}

