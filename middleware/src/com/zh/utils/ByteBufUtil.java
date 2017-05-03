package com.zh.utils;

import java.io.UnsupportedEncodingException;

import io.netty.buffer.ByteBuf;

/**
 *@author: zzh
 *@createtime: 2016-3-3下午4:39:19
 *@version: V1.0
 *@Description:
 */
public class ByteBufUtil {
	public static String ByteBufToString(ByteBuf byteBuf){
		byte[] req = new byte[byteBuf.readableBytes()];
		byteBuf.readBytes(req);
		String body;
		try {
			body = new String(req,"UTF-8");
			return body;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}

