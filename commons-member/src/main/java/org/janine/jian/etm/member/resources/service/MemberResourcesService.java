package org.janine.jian.etm.member.resources.service;

import java.util.List;
import java.util.Map;

import org.janine.jian.etm.member.resources.domain.MemberResources;

/******************************************
 * 实体服务接口
 * @author janine
 *
 *******************************************/
public interface MemberResourcesService {
     /**
      * 实体保存
      * @param memberResources
      * @return
      */
     public MemberResources save(MemberResources memberResources);
     /**
      * 实体更新
      * @param memberResources
      * @return
      */
     public MemberResources update(MemberResources memberResources);
     /**
      * 实体删除
      * @param memberResources
      * @return
      */
     public MemberResources delete(MemberResources memberResources);
     /**
 	 * 根据JPQL语句返回查询实体列表
 	 * @param jpql
 	 * @param paramValueList 参数列表,防止sql注入
 	 * @return
 	 */
 	public  List<MemberResources> queryAllByJPQL(String jpql,List<Object> paramValueList);
 	
 	/**
 	 * 根据JPQL语句返回查询键值对列表
 	 * @param jpql
 	 * @param paramValueList
 	 * @return
 	 */
 	public List<Map<String,Object>> queryAllColumnByJPQL(String jpql,List<Object> paramValueList);
 	
 	/**
 	 * 根据sql语句查询实体列表
 	 * @param sql
 	 * @param paramValueList
 	 * @return
 	 */
 	public  List<MemberResources> queryAllBySQL(String sql,List<Object> paramValueList);
 	
 	/**
 	 * 根据sql语句查询键值对列表
 	 * @param sql
 	 * @param paramValueList
 	 * @return
 	 */
 	public List<Map<String,Object>> queryAllColumnBySQL(String sql,List<Object> paramValueList);
}
