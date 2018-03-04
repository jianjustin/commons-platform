package org.janine.jian.utils;

public class StringUtils {

	public static Boolean isBlank(Object obj){
		if(obj == null)return true;
		if(obj == "")return true;
		return false;
	}
}
