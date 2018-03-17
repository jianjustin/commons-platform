package org.janine.jian.utils.string;

public class StringUtils {

	/**
	 * 判断对象是否为空
	 * @param obj
	 * @return
	 */
	public static Boolean isBlank(Object obj){
		if(obj == null)return true;
		if(obj == "")return true;
		return false;
	}
}
