package org.janine.jian.utils;

import java.util.Properties;

import org.janine.jian.server.DataSourceDomain;

import com.google.gson.Gson;

/**
 * JSON工具类
 * @author jian
 *
 */
public class JsonUtils {

	/**
	 * 根据对象获取json字符串
	 * @param obj
	 * @return
	 */
	public static <T> String toJson(T obj){
		Gson gson = new Gson();
		return gson.toJson(obj);
	}
	
	/**
	 * 根据json字符串获取实体对象
	 * @param jsonStr
	 * @param clazz
	 * @return
	 */
	public static <T> T from(String jsonStr,Class<T> clazz){
		Gson gson = new Gson();
		return gson.fromJson(jsonStr, clazz);
	}
	
	public static void main(String[] args) {
		Properties properties = PropertiesUtils.queryPropertiesList("DataSource.properties");
		String jsonStr = PropertiesUtils.queryJsonStr(properties.toString());
		DataSourceDomain dataSourceDomain = JsonUtils.from(jsonStr, DataSourceDomain.class);
		System.out.print(dataSourceDomain.getUrl());
	}
	
}
