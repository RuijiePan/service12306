package com.ruijie.util;

import com.google.gson.Gson;

public class GsonUtil {
	public static Gson gson;
	
	public static Gson getGson(){
		if(gson==null)
			gson = new Gson();
		return gson;
	}
	
	public static String toJson(Object obj){
		return getGson().toJson(obj);
	}
	
	public static <T> T toObject(String json, Class<T> classOfT){
		return getGson().fromJson(json, classOfT);
	}
}
