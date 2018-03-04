package org.janine.jian.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置文件读取工具类
 * @author janine
 */
public class PropertiesUtils {

	/**
	 * 根据配置文件名称获取配置文件实例
	 * @param propertiesName
	 * @return
	 */
	public static Properties queryPropertiesList(String propertiesName){
		try {
			Properties prop = new Properties();
			InputStream in = PropertiesUtils.class.getClassLoader().getResourceAsStream(propertiesName);
			prop.load(in);
			System.out.print(prop);
			return prop;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Properties();
	}	
	
	/**
	 * 根据class和properties对象反射获取配置实例
	 */
	@SuppressWarnings("unchecked")
	public static void queryPropertiesByClass(Class clazz){
		Class<?>[] parameterTypes = {};
		try {
			clazz.getDeclaredConstructor(parameterTypes);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 将配置文件数据转换为json格式数据
	 * @param jsonStr
	 * @return
	 */
	public static String queryJsonStr(String jsonStr){
		jsonStr = jsonStr.replace(" ","");
		jsonStr = jsonStr.replace("}","\"}");
		jsonStr = jsonStr.replace("{","{\"");
		jsonStr = jsonStr.replaceAll("=","\":\"");
		jsonStr = jsonStr.replaceAll(",","\",\"");
		jsonStr = jsonStr.replaceAll("=",":");
		return jsonStr;
	}
	
	public static void main(String[] args) {
		PropertiesUtils.queryPropertiesList("DataSource.properties");
	}
}
