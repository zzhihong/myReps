package com.zh.interfaceManager.service.postvm;

import com.zh.interfaceManager.client.postvm.PosTvmEntity;
import com.zh.interfaceManager.client.postvm.PosTvmResult;




public interface IPostTvmService {

	public PosTvmResult QuerypostTVM(PosTvmEntity pt) throws Exception ;

}
