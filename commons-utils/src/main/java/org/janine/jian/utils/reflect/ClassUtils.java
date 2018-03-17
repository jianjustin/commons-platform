package org.janine.jian.utils.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtils {

	public static <T> String getName(Class<T> clazz){
		return clazz.getName();
	}
	
	public static <T> Method[] getMethods(Class<T> clazz){
		return clazz.getMethods();
	}
	
	public static <T> Field[] getFields(Class<T> clazz){
		return clazz.getFields();
	}
	
	/**
	 * 根据实例，属性名，属性值设置属性
	 * @param domain
	 * @param propertiesName
	 * @param propertiesValue
	 * @return
	 */
	public static <T> T setFieldValue(T domain,String propertiesName,String propertiesValue){
		Class<? extends Object> clazz = domain.getClass();
		try {
			Field field = clazz.getDeclaredField(propertiesName);
			field.setAccessible(true);
			field.set(domain, propertiesValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return domain;
	}
}
