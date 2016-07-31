package com.github.MrWub.Dekaron.utils;

import com.google.gson.Gson;

public class JsonCoder {
	public static String toJson(Object obj) {
		return new Gson().toJson(obj);
	}
	public static <T> T toObject(String json,Class<T> clazz) {
		return new Gson().fromJson(json, clazz);
	}
}
