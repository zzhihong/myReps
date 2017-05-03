package com.zh.utils.json;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.google.gson.Gson;

import com.zh.config.CommunicatePojo;


import com.zh.config.CommunicatePojo;


/**
 *@author: zzh
 *@createtime: 2016-3-4下午2:21:35
 *@version: V1.0
 *@Description:该工具类只能适用于CommunicatePojo的json转换
 */
public class JsonUtil {
	@SuppressWarnings("rawtypes")
	public static Object json2Pojo(String json, Class clazz) {
        Gson gson = new Gson();
        Type objectType = type(CommunicatePojo.class, clazz);
        return gson.fromJson(json, objectType);
    }

    public static String pojo2Json(Object obj) {
        Gson gson = new Gson();
        Type objectType = type(obj.getClass(), obj.getClass());
        return gson.toJson(obj, objectType);
    }

    @SuppressWarnings("rawtypes")
	static ParameterizedType type(final Class raw, final Type... args) {
        return new ParameterizedType() {
            public Type getRawType() {
                return raw;
            }

            public Type[] getActualTypeArguments() {
                return args;
            }

            public Type getOwnerType() {
                return null;
            }
        };
    }
}

