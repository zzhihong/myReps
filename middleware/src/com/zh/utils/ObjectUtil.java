
package com.zh.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.lang3.ObjectUtils;

/**
 * 对象操作工具类
 * @author 
 * @version 
 */
public class ObjectUtil extends ObjectUtils {

	
	
	/**
	 * 序列化对象
	 * @param object
	 * @return
	 */
	 public static String serialize(Object o) {
	        ByteArrayOutputStream bos = null;
	        ObjectOutputStream oos=null;
			try {
				if(o!=null){
					bos = new ByteArrayOutputStream();
					oos = new ObjectOutputStream(bos);
					oos.writeObject(o);
					oos.flush();
					//return new BASE64Encoder().encode(bos.toByteArray());
			        return new String(bos.toByteArray(), "ISO-8859-1");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					oos.close();
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	       return null;
	       
	    }

	/**
	 * 反序列化对象
	 * @param bytes
	 * @return
	 */
	 public static Object unserialize(String str){
	        //ByteArrayInputStream bis = new ByteArrayInputStream(new BASE64Decoder().decodeBuffer(object));
	        ByteArrayInputStream bis =null;
	        ObjectInputStream ois=null;
	        Object o = null;
			try {
				if(str!=null&&str.length()>0){
					bis = new ByteArrayInputStream(str.getBytes("ISO-8859-1"));
					ois = new ObjectInputStream(bis);
					o = ois.readObject();
					return o;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					bis.close();
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	        return null;
	    }
	
	
}
