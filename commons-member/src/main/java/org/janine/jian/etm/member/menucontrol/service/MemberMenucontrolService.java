package org.janine.jian.etm.member.menucontrol.service;

import java.util.List;
import java.util.Map;

import org.janine.jian.etm.member.menucontrol.domain.MemberMenucontrol;

/******************************************
 * 实体服务接口
 * @author janine
 *
 *******************************************/
public interface MemberMenucontrolService {
     /**
      * 实体保存
      * @param memberMenucontrol
      * @return
      */
     public MemberMenucontrol save(MemberMenucontrol memberMenucontrol);
     /**
      * 实体更新
      * @param memberMenucontrol
      * @return
      */
     public MemberMenucontrol update(MemberMenucontrol memberMenucontrol);
     /**
      * 实体删除
      * @param memberMenucontrol
      * @return
      */
     public MemberMenucontrol delete(MemberMenucontrol memberMenucontrol);
     /**
 	 * 根据JPQL语句返回查询实体列表
 	 * @param jpql
 	 * @param paramValueList 参数列表,防止sql注入
 	 * @return
 	 */
 	public  List<MemberMenucontrol> queryAllByJPQL(String jpql,List<Object> paramValueList);
 	
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
 	public  List<MemberMenucontrol> queryAllBySQL(String sql,List<Object> paramValueList);
 	
 	/**
 	 * 根据sql语句查询键值对列表
 	 * @param sql
 	 * @param paramValueList
 	 * @return
 	 */
 	public List<Map<String,Object>> queryAllColumnBySQL(String sql,List<Object> paramValueList);
}
