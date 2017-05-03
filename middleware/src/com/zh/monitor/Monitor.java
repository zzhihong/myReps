package com.zh.monitor;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.log4j.Logger;

import com.chunyv.ws.handler.MyHandlerResolver;

/**
 * @author: baijiangtao
 * @createtime: 2016年3月4日上午10:03:17
 * @version: V1.0
 * @Description: 监控状态变更类 Monitor类和State类的关系
 */
public class Monitor {
	private static Logger logger = Logger.getLogger(Monitor.class);

	private static Monitor monitor;
	private long interval = 5 * 60 *1000;

	private Monitor() {
	}

	public static Monitor getInstance() {
		if(monitor==null){
			return monitor = new Monitor();
		}
		else
			return monitor;
	}

	private Timer timerSP = new Timer("sp");
	private Timer timerZH = new Timer("zh");
	private Timer timerPOSTVM = new Timer("postvm");
	private Timer timerREALNAME = new Timer("realname");
	private Timer timerDict =new Timer("pym");
	private Timer timerJpk = new Timer("jpk");

	/**
	 * 启动所有接口监控
	 */
	public void initStartMonitor() {

		timerZH.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				boolean zhcxMonitor = InterfaceMonitor.getInstance()
						.zhcxMonitor();
				if (zhcxMonitor)
					State.setZhcxState(5);
				else
					State.setZhcxState(0);

			}
		}, 0, interval);
		
		timerPOSTVM.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				boolean postTVMMonitor = InterfaceMonitor.getInstance()
						.postTVMMonitor();
				if (postTVMMonitor)
					State.setPostTMVState(5);
				else
					State.setPostTMVState(0);

			}
		}, 0,interval);
		
		timerJpk.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				boolean JpkMonitor = InterfaceMonitor.getInstance()
						.JpkServiceMonitor();
				if (JpkMonitor)
					State.setJpkState(5);
				else
					State.setJpkState(0);

			}
		}, 0, interval);
		
		
		
		timerREALNAME.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				boolean realnameMonitor = InterfaceMonitor.getInstance()
						.realnameMonitor();
				if (realnameMonitor)
					State.setRealnameState(5);
				else
					State.setRealnameState(0);

			}
		}, 0, interval);
		
		timerDict.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				boolean dictMonitor = InterfaceMonitor.getInstance()
						.dictServiceMonitor();
				if (dictMonitor)
					State.setPymState(5);
				else
					State.setPymState(0);
			}
			
		}, 0, interval);

	}
	
	/**
	 * 启动安全平台监控
	 */
	public void startTimerSP(){
		
		timerSP.scheduleAtFixedRate(new SPTimerTask(), 0, interval);
		
	}
	
	/**
	 * 启动所有监控
	 */
	public void startAllMonitor(){
		startTimerSP();
		initStartMonitor();
		logger.info("启动了所有监控");
	}
	
	/**
	 * 取消所有监控
	 */
	public void cancelMonitor() {
		timerSP.cancel();
		timerZH.cancel();
		timerPOSTVM.cancel();
		timerREALNAME.cancel();
		timerDict.cancel();
		timerJpk.cancel();
	}
	
	/**
	 * 安全平台有问题   停止所有接口监控
	 */
	public void cancelInterfaceMonitor(){
		timerZH.cancel();
		timerPOSTVM.cancel();
		timerREALNAME.cancel();
		timerDict.cancel();
		timerJpk.cancel();
	}
	
	/**
	 * 安全平台恢复正常  启动所有接口监控
	 */
	public void restoreInterfaceMonitor(){
		Monitor.getInstance().initStartMonitor();
		
	}

	/**
	 * 
	 * @param args
	 */
	public void cancel() {

	}

	public static void main(String[] args) {
		
//		Monitor.getInstance().startAllMonitor();//启动监控
		Monitor.getInstance();
		Monitor.getInstance();
	}

}


class SPTimerTask extends TimerTask{
	private static Logger logger =Logger.getLogger(SPTimerTask.class);
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void run() {
		//经过测试   发现测试查这个获取token根本没有效果    测试安全平台还需继续改进
		ExecutorService ex=Executors.newSingleThreadExecutor();
		Callable callable = new RealTimerTask();
		Future future = ex.submit(callable);
		try {
			Object object = future.get(20*1000,TimeUnit.MILLISECONDS);
			State.setBeforeSecurityState(State.getSecurityState());
			State.setSecurityState(5);
			System.out.println(object);
		} catch (InterruptedException e) {
			State.setBeforeSecurityState(State.getSecurityState());
			State.setSecurityState(0);
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (ExecutionException e) {
			State.setBeforeSecurityState(State.getSecurityState());
			State.setSecurityState(0);
			e.printStackTrace();
			logger.error(e.getMessage());
		} catch (TimeoutException e) {
			logger.error("获取token超时");
			e.printStackTrace();
			State.setBeforeSecurityState(State.getSecurityState());
			State.setSecurityState(0);
		}finally{  
			if(State.getSecurityState()==0 && State.getBeforeSecurityState()==5){
				Monitor.getInstance().cancelInterfaceMonitor();
				State.setBeforeSecurityState(0);
			}else if(State.getSecurityState()==5 && State.getBeforeSecurityState()==0){
				Monitor.getInstance().restoreInterfaceMonitor();
			}
            ex.shutdown();  
        }  
	}
	
	@SuppressWarnings("rawtypes")
	class RealTimerTask implements Callable{

		@Override
		public String call() throws Exception {
			MyHandlerResolver handler = InterfaceMonitor.getInstance().getMyHandlerResolver();
			String token = handler.getTokenHandler().getToken();
			return token;
		}
		
	}
	
}
