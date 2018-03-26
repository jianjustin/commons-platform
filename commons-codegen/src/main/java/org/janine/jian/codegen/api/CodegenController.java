package org.janine.jian.codegen.api;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.janine.jian.utils.database.ColumnDomain;
import org.janine.jian.utils.database.DataBaseUtils;
import org.janine.jian.utils.database.DataSourceDomain;
import org.janine.jian.utils.file.FileUtils;
import org.janine.jian.utils.freemarker.FreeMarkerUtils;
import org.janine.jian.utils.json.JsonUtils;
import org.janine.jian.utils.property.PropertiesUtils;
import org.janine.jian.utils.string.StringUtils;


import freemarker.template.Template;

/**
 * 代码生成器(根据模板文件目录,变量和指定目录生成代码)
 * @author jian
 *
 */
public class CodegenController implements CodegenApi{

	public String codegenMain(String templatePath,Map<String, Object> dataMap, String codePath) {
		String result = "";
		/*1.根据模板路径获取所有模板*/
		List<File> templates = FileUtils.queryAllFiles(templatePath);
		if(null == templates || templates.size() == 0){
			result = "无模板存在,请重新选择目录";
			return result;
		}
		
		/*2.根据模板和表名称获取文件路径和文件名称，进行文件逆向生成*/
		String prefix = dataMap.get("prefix").toString();
		String suffix = dataMap.get("suffix").toString();
		codePath = codePath + "\\" + prefix + "\\" + suffix;
		
		for (File file : templates) {
			String templateName = file.getName();//获取单一模板名称
			String templatePath1 = file.getPath().replace(templateName, "");//获取单一模板路径
            String filePath = templatePath1.replace(templatePath, codePath);//获取文件路径
            String fileName = templateName.replace("TableName", dataMap.get("TableName").toString());
    		fileName = fileName.replace("ftl", "java");
            Template template = FreeMarkerUtils.getTemplate(templateName,templatePath1);
    		if(null == template){
    			result = "模板不存在,请重新选择目录";
    			return result;
    		}
    		/**3.判断目录是否存在（不存在则进行创建）*/
    		File path = new File(filePath);
    		if(!path.exists()){
    			path.mkdirs();
    		}
    		File file1 = new File(filePath+fileName);
    		FileOutputStream fos;
			try {
				fos = new FileOutputStream(file1);
				Writer out = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"),10240);
				template.process(dataMap,out);
			} catch (Exception e) {
				result = "逆向生成异常";
				return result;
			}
            result += fileName + "文件创建成功";
		}
		return result;
	}
	
	public List<ColumnDomain> getDataList(String tableName) throws Exception{
		/*获取数据库连接*/
		Properties properties = PropertiesUtils.queryPropertiesList("DataSource.properties");
		Properties columnsTypeProperties = PropertiesUtils.queryPropertiesList("columnsTypeMapping.properties");
		DataSourceDomain dataSourceDomain = JsonUtils.from(JsonUtils.toJson(properties), DataSourceDomain.class);
		Connection connection = DataBaseUtils.getConnection(dataSourceDomain.getUrl(), dataSourceDomain.getDriver(), dataSourceDomain.getUserName(), dataSourceDomain.getPassword());
		if(StringUtils.isBlank(connection)){
			throw new Exception("获取数据库连接失败");
		}
		/*根据数据库连接,表名获取表内字段信息*/
		List<ColumnDomain> columns = new ArrayList<ColumnDomain>();
		try {
			columns = DataBaseUtils.getDataList(connection, tableName,columnsTypeProperties);
		} catch (SQLException e) {
			throw new SQLException("获取数据库连接失败");
		}
		return columns;
	}
	
    public Map<String,Object> getDataMap(String tableName,List<ColumnDomain> columns){
    	if(StringUtils.isBlank(tableName))return null;
    	/*局限于basic_member规范*/
    	String prefix = "",Prefix = "", suffix = "",Suffix = "";
		prefix = tableName.split("_")[0];
		Prefix = prefix.substring(0, 1).toUpperCase() + prefix.substring(1, prefix.length());
		suffix = tableName.split("_")[1];
		Suffix = suffix.substring(0, 1).toUpperCase() + suffix.substring(1, suffix.length());
		
    	Map<String,Object> dataMap = new HashMap<String,Object>();
    	dataMap.put("table_name",prefix+"_"+suffix);
        dataMap.put("Table_name",Prefix+"_"+suffix);
        dataMap.put("TableName", Prefix+Suffix);//表名称
        dataMap.put("tableName", prefix+Suffix);
        dataMap.put("prefix", prefix);//模块名称
        dataMap.put("Prefix", Prefix);
        dataMap.put("suffix", suffix);//表名称
        dataMap.put("Suffix", Suffix);
        dataMap.put("root_package_name", "org.janine.jian");
        dataMap.put("package_name", "org.janine.jian.etm."+prefix+"."+suffix);
        dataMap.put("model_column", columns);
    	return dataMap;
    }

	
	public static void main(String[] args) {
		CodegenApi codegenApi = new CodegenController();
		try {
			List<ColumnDomain> columns = codegenApi.getDataList("member_user");
			Map<String,Object> dataMap = codegenApi.getDataMap("member_user", columns);
			codegenApi.codegenMain("I:\\workSpaceCustom\\docs\\template", dataMap, "I:\\workSpaceCustom\\commons-platform\\commons-member\\src\\main\\java\\org\\janine\\jian\\etm");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
