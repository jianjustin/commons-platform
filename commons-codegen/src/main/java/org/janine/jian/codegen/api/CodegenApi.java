package org.janine.jian.codegen.api;

import java.util.List;
import java.util.Map;

import org.janine.jian.codegen.workingModel.DataDomain;
import org.janine.jian.utils.database.ColumnDomain;

/**
 * 模板反向生成代码api
 * @author jian
 *
 */
public interface CodegenApi {

	/**
	 * 根据模板路径,数据源,代码路径生成代码(不指定表,默认整个数据库)
	 * @param templatePath
	 * @param dataMap
	 * @param codePath
	 * @return
	 */
	public String codegenMain(String templatePath,Map<String,Object> dataMap,String codePath);

	/**
	 * 根据数据库配置和表名称获取表字段信息
	 * @param tableName
	 * @return
	 * @throws Exception 
	 */
	public List<ColumnDomain> getDataList(String tableName) throws Exception;
	
	/**
	 * 根据数据库配置和表名称获取表字段信息
	 * @param tableName
	 * @return
	 * @throws Exception 
	 */
	//public List<DataDomain> getDataList() throws Exception;
	
	/**
	 * 根据表名称和表字段信息生成映射信息
	 * @param tableName
	 * @param columns
	 * @return
	 */
	public Map<String,Object> getDataMap(String tableName,List<ColumnDomain> columns);
}
