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
import com.zh.netty.test.TestNettyPojo;
import com.zh.utils.ObjectUtil;
/**
 *@author: zzh
 *@createtime: 2016-2-29下午2:00:52
 *@version: V1.0
 *@Description:
 */
public class MiddleWareServerHanddler extends SimpleChannelInboundHandler<FullHttpRequest>{
	private static final Logger logger=Logger.getLogger(MiddleWareServerHanddler.class);
	private HttpRequest request;
	private FullHttpResponse response;
	@SuppressWarnings("rawtypes")
	private CommunicatePojo cp;
    @SuppressWarnings({ "rawtypes" })
	@Override
	public void channelRead(ChannelHandlerContext ctx,  Object msg) throws Exception {
    	if (msg instanceof HttpRequest) {
            request = (HttpRequest) msg;
        }
        if (msg instanceof HttpContent) {
            HttpContent content = (HttpContent) msg;
            ByteBuf buf = content.content();
            CommunicatePojo object = (CommunicatePojo) ObjectUtil.unserialize(buf.toString(UTF_8));
//            String byteBufToString = ByteBufUtil.ByteBufToString(buf);
//            CommunicatePojo object = (CommunicatePojo) JsonUtil.json2Pojo(byteBufToString, RsInfo.class);
            buf.release();
            //对请求的信息回应相应的内容
            if(ctx.channel().isActive()&&ctx.channel().isWritable()){
		    	doFlushCtx(ctx, object);
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void invokingInterface(CommunicatePojo object) {
		switch(object.getCode()){
		case InterfaceCode.queryStationNamesByPym:
			PymTest pym=(PymTest)object.getO();
			logger.info("拼音码查询入参："+pym+"------入参哈希码为："+pym.hashCode());
			ObjRsInfo rsInfo = PYM.getpym().queryStationNamesByPym(pym);
			if(!rsInfo.getHeader().isStatus()){
				logger.info("拼音码查询返回结果："+rsInfo+"------哈希码为："+pym.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.queryStationNamesByPym, rsInfo);
			break;

		case InterfaceCode.queryPOSTVMByPassengerAndTrade:
			PosTvmEntity pt=(PosTvmEntity)object.getO();
			logger.info("POSTvm查询入参:"+pt+"------入参哈希码为："+pt.hashCode());
			PosTvmResult result = PostTvmService.getPosTvm().QuerypostTVM(pt);
			if(!result.getHeader().isStatus()){
				logger.info("POSTvm查询返回结果："+result+"------入参哈希码为："+pt.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.queryPOSTVMByPassengerAndTrade, result);
			break;
		case InterfaceCode.jpkCode:
			Ticket_entrance jpk=(Ticket_entrance) object.getO();
			logger.info("检票口查询入参："+jpk+"------入参哈希码为："+jpk.hashCode());
			JpkResult jpkResult = JpkService.getJpkService().getCheckTicketWebService(jpk);
			if(!jpkResult.getHeader().isStatus()){
				logger.info("检票口查询返回结果："+jpkResult+"------入参哈希码为："+jpk.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.jpkCode, jpkResult);
			break;

		case InterfaceCode.getWWWZhcxFromWebService:
			IctOrderInfoByUserRQ2 ictOrderInfoByUserRQ=(IctOrderInfoByUserRQ2) object.getO();
			logger.info("订单订票查询入参："+ictOrderInfoByUserRQ+"------入参哈希码为："+ictOrderInfoByUserRQ.hashCode());
			ListIctOrderInfoByUserBO2Pojo wwwZhcxFromWebService = DPDD.getInstance().getWWWZhcxFromWebService(ictOrderInfoByUserRQ);
			if(!wwwZhcxFromWebService.getHeader().isStatus()){
				logger.info("订单订票查询返回结果："+wwwZhcxFromWebService+"------入参哈希码为："+ictOrderInfoByUserRQ.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.getWWWZhcxFromWebService, wwwZhcxFromWebService);
			break;
		case InterfaceCode.getIctInsuranceRRT:
			InsurancePojo insurancePojo=(InsurancePojo) object.getO();
			logger.info("固定期限乘意险查询入参："+insurancePojo+"------入参哈希码为："+insurancePojo.hashCode());
			InsuranceRRTPojo ictInsuranceRRT = DPDD.getInstance().getIctInsuranceRRT(insurancePojo);
			if(!ictInsuranceRRT.getHeader().isStatus()){
				logger.info("固定期限乘意险查询返回结果："+ictInsuranceRRT+"------入参哈希码为："+insurancePojo.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.getIctInsuranceRRT, ictInsuranceRRT);
			break;
		case InterfaceCode.getInsuranceWebService:
			InsurancePojo insurancePojo2=(InsurancePojo) object.getO();
			logger.info("固定期限乘意险详情查询入参："+insurancePojo2+"------入参哈希码为："+insurancePojo2.hashCode());
			ListInsuranceRRTPojo insuranceWebService = DPDD.getInstance().getInsuranceWebService(insurancePojo2);
			if(!insuranceWebService.getHeader().isStatus()){
				logger.info("固定期限乘意险详情查询返回结果："+insuranceWebService+"------入参哈希码为："+insurancePojo2.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.getInsuranceWebService, insuranceWebService);
			break;
		case InterfaceCode.queryUserInfo:
			POQueryUserInfo po=(POQueryUserInfo) object.getO();
			logger.info("实名制查询入参："+po+"------入参哈希码为："+po.hashCode());
			ReResponseEntityRegisterUser user = RealName.getInstance().ictQueryUserInfo(po);
			if(!user.getHeader().isStatus()){
				logger.info("实名制查询返回结果："+user+"------入参哈希码为："+po.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.queryUserInfo,user);
			break;
		case InterfaceCode.passengerInfosFromWebService:
			POQueryUserInfo poQueryUserInfo=(POQueryUserInfo) object.getO();
			logger.info("常用联系人查询入参："+poQueryUserInfo+"------入参哈希码为："+poQueryUserInfo.hashCode());
			ReResponseEntityPassenger reResponseEntityPassenger = RealName.getInstance().getPassengerInfosFromWebService(poQueryUserInfo);
			if(!reResponseEntityPassenger.getHeader().isStatus()){
				logger.info("常用联系人查询返回结果："+reResponseEntityPassenger+"------入参哈希码为："+poQueryUserInfo.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.passengerInfosFromWebService,reResponseEntityPassenger);
			break;
		case InterfaceCode.logOutRegisterUser:
			POQueryUserInfo poQueryUserInfo2=(POQueryUserInfo) object.getO();
			logger.info("注销用户操作入参："+poQueryUserInfo2+"------入参哈希码为："+poQueryUserInfo2.hashCode());
			ReResponseEntityLogOutRegisterUser responseEntityLogOutRegisterUser = RealName.getInstance().logOutRegisterUser(poQueryUserInfo2);
			if(!responseEntityLogOutRegisterUser.getHeader().isStatus()){
				logger.info("注销用户操作返回结果："+responseEntityLogOutRegisterUser+"------入参哈希码为："+poQueryUserInfo2.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.logOutRegisterUser,responseEntityLogOutRegisterUser);
			break;
		case InterfaceCode.getVerifyRegisterUserStatus:
			POVerifyRegisterUserStatus poVerifyRegisterUserStatus=(POVerifyRegisterUserStatus) object.getO();
			logger.info("验证用户信息操作入参："+poVerifyRegisterUserStatus+"------入参哈希码为："+poVerifyRegisterUserStatus.hashCode());
			ReResponseEntityReisterUser user1 = RealName.getInstance().getVerifyRegisterUserStatus(poVerifyRegisterUserStatus);
			if(!user1.getHeader().isStatus()){
				logger.info("验证用户信息操作返回结果："+user1+"------入参哈希码为："+poVerifyRegisterUserStatus.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.getVerifyRegisterUserStatus,user1);
			break;	
		case InterfaceCode.getSynchronizedUserByRegister:
			POSynchronizedUserByRegister poSynchronizedUserByRegister=(POSynchronizedUserByRegister) object.getO();
			logger.info("同步用户操作入参："+poSynchronizedUserByRegister+"------入参哈希码为："+poSynchronizedUserByRegister.hashCode());
			ReResponseEntityReisterUser user2 = RealName.getInstance().getSynchronizedUserByRegister(poSynchronizedUserByRegister);
			if(!user2.getHeader().isStatus()){
				logger.info("同步用户操作返回结果："+user2+"------入参哈希码为："+poSynchronizedUserByRegister.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.getSynchronizedUserByRegister,user2);
			break;
		case InterfaceCode.getPhoneVerificationCode:
			POPhoneVerificationCode poPhoneVerificationCode=(POPhoneVerificationCode) object.getO();
			logger.info("获取验证码操作入参："+poPhoneVerificationCode+"------入参哈希码为："+poPhoneVerificationCode.hashCode());
			ReResponseEntityPhoneVerificationCode user3 = RealName.getInstance().getPhoneVerificationCode(poPhoneVerificationCode);
			if(!user3.getHeader().isStatus()){
				logger.info("获取验证码操作返回结果："+user3+"------入参哈希码为："+poPhoneVerificationCode.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.getPhoneVerificationCode,user3);
			break;	
		case InterfaceCode.queryBundlingMobile:
			POQueryBundlingMobile poQueryBundlingMobile=(POQueryBundlingMobile) object.getO();
			logger.info("手机绑定联系人操作入参："+poQueryBundlingMobile+"------入参哈希码为："+poQueryBundlingMobile.hashCode());
			ReResponseEntityRegisterUser user4 = RealName.getInstance().ictQueryBundlingMobile(poQueryBundlingMobile);
			if(!user4.getHeader().isStatus()){
				logger.info("手机绑定联系人操作返回结果："+user4+"------入参哈希码为："+poQueryBundlingMobile.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.queryBundlingMobile,user4);
			break;
		case InterfaceCode.unbundlMobile:
			POUnbundlMobile poUnbundlMobile=(POUnbundlMobile) object.getO();
			logger.info("手机解绑操作入参："+poUnbundlMobile+"------入参哈希码为："+poUnbundlMobile.hashCode());
			ReResponseEntityVerifyMobile user5 = RealName.getInstance().ictUnbundlMobile(poUnbundlMobile);
			if(!user5.getHeader().isStatus()){
				logger.info("手机解绑操作返回结果："+user5+"------入参哈希码为："+poUnbundlMobile.hashCode());
			}
			cp=new CommunicatePojo(InterfaceCode.unbundlMobile,user5);
			break;	
		case InterfaceCode.getDealInfoWebService:
			IctOrderInfoByUserRQ2 ictOrderInfoByUserRQ2=(IctOrderInfoByUserRQ2) object.getO();
			logger.info("订单交易信息查询入参："+ictOrderInfoByUserRQ2+"------入参哈希码为："+ictOrderInfoByUserRQ2.hashCode());
			 IctOrderInfoByUserRS2Pojo dealInfoWebService = DPDD.getInstance().getDealInfoWebService(ictOrderInfoByUserRQ2);
			 if(!dealInfoWebService.getHeader().isStatus()){
				 logger.info("订单交易信息查询返回结果："+dealInfoWebService+"------入参哈希码为："+ictOrderInfoByUserRQ2.hashCode());
			 }
			cp=new CommunicatePojo(InterfaceCode.getDealInfoWebService, dealInfoWebService);
			break;
		case InterfaceCode.testNetty:
			TestNettyPojo tnp=(TestNettyPojo) object.getO();
			String justString = tnp.getJustString();
			tnp.setJustString("server返回"+tnp.getSerialNumber()+"的："+justString);
			cp=new CommunicatePojo(InterfaceCode.testNetty, tnp);
			break;
		default:
			logger.info("netty服务端接收到的信息暂时不能转换为相应类");
			cp=new CommunicatePojo(InterfaceCode.exceptionCode,new ExceptionMes("netty服务端接收到的信息暂时不能转换为相应类！！"));	
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
		
	}

}

