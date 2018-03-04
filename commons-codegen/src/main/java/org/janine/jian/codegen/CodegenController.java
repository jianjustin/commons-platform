package org.janine.jian.codegen;

import java.util.Properties;

import org.janine.jian.model.TemplateDomain;
import org.janine.jian.server.DataSourceDomain;
import org.janine.jian.utils.JsonUtils;
import org.janine.jian.utils.PropertiesUtils;

/**
 * 代码生成器
 * @author jian
 *
 */
public class CodegenController {

	
	/**
	 * 获取数据库连接实例
	 * @return
	 */
	public static DataSourceDomain queryDataSourceDomain(){
		Properties properties = PropertiesUtils.queryPropertiesList("DataSource.properties");
		String jsonStr = PropertiesUtils.queryJsonStr(properties.toString());
		return JsonUtils.from(jsonStr, DataSourceDomain.class);
	}
	
	/**
	 * 获取模板配置信息
	 */
	public static TemplateDomain queryTemplateDomain(){
		Properties properties = PropertiesUtils.queryPropertiesList("templateConfig.properties");
		String jsonStr = PropertiesUtils.queryJsonStr(properties.toString());
		return JsonUtils.from(jsonStr, TemplateDomain.class);
	}
	
	public static void main(String[] args) {
		DataSourceDomain dataSourceDomain = CodegenController.queryDataSourceDomain();
		System.out.print(dataSourceDomain.getUrl());
	}
	
	
	
	
}
