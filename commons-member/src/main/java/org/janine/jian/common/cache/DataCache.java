package org.janine.jian.common.cache;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 自定义缓存实现
 * @author janine
 * @since 2017-12-21
 * @version 1.0.0
 */
public class DataCache{

	private static ConcurrentMap<String, Object> concurrentMap = new ConcurrentHashMap<String, Object>();
	
	static{
		if(null == concurrentMap)concurrentMap = new ConcurrentHashMap<String, Object>();
	}
	
	public static Object getCache(String cacheKey){
		return concurrentMap.get(cacheKey);
	}
	
	public static boolean setCache(String cacheKey,Object cacheValue){
		try {
			concurrentMap.put(cacheKey, cacheValue);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static boolean clearCache(){
		try {
			concurrentMap.clear();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	
}
