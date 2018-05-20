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

import org.janine.jian.codegen.workingModel.DataDomain;
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
 * 工作代码生成器(根据模板文件目录,变量和指定目录生成代码,生成电科代码)
 * @author jian
 *
 */
public class WorkingCodegenController{

	public String codegenMain(String templatePath,Map<String, Object> dataMap, String codePath) {
		String result = "";
		/*1.根据模板路径获取所有模板*/
		List<File> templates = FileUtils.queryAllFiles(templatePath);
		if(null == templates || templates.size() == 0){
			result = "无模板存在,请重新选择目录";
			return result;
		}
		
		for (File file : templates) {
			String templateName = file.getName();//获取单一模板名称
			String templatePath1 = file.getPath().replace(templateName, "");//获取单一模板路径
            String filePath = templatePath1.replace(templatePath, codePath);//获取文件路径
            String fileName = templateName.replace("tableName", dataMap.get("tableName").toString());
            fileName = fileName.replace("serviceName", dataMap.get("serviceName").toString());
            Template template = FreeMarkerUtils.getTemplate(templateName,templatePath1);
    		if(null == template){
    			templateName = templateName.substring(0, templateName.length()-4);
    			template = FreeMarkerUtils.getTemplate(templateName,templatePath1);
    			if(null == template){
    				result += "模板"+templateName+"不存在,请重新选择目录";
        			continue;
    			}
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
	
	public List<DataDomain> getDataList() throws Exception{
		List<DataDomain> columns = new ArrayList<DataDomain>();
		DataDomain dataDomain = new DataDomain();
		dataDomain.setClassName("ownerUserHistoryId");
		dataDomain.setClassType("String");
		dataDomain.setFieldsNum("64");
		dataDomain.setFieldsName("OWNER_USER_HISTORY_ID");
		dataDomain.setFieldsRemark("合同拥有者ID");
		dataDomain.setFieldsType("VARCHAR2");
		columns.add(dataDomain);
		
		dataDomain = new DataDomain();
		dataDomain.setClassName("bpoId");
		dataDomain.setClassType("String");
		dataDomain.setFieldsNum("52");
		dataDomain.setFieldsName("BPO_ID");
		dataDomain.setFieldsRemark("合同ID");
		dataDomain.setFieldsType("VARCHAR2");
		columns.add(dataDomain);
		
		dataDomain = new DataDomain();
		dataDomain.setClassName("historyNum");
		dataDomain.setClassType("String");
		dataDomain.setFieldsNum("10");
		dataDomain.setFieldsName("HISTORY_NUM");
		dataDomain.setFieldsRemark("合同拥有者历史编号");
		dataDomain.setFieldsType("VARCHAR2");
		columns.add(dataDomain);
		
		dataDomain = new DataDomain();
		dataDomain.setClassName("ownerUserId");
		dataDomain.setClassType("String");
		dataDomain.setFieldsNum("64");
		dataDomain.setFieldsName("OWNER_USER_ID");
		dataDomain.setFieldsRemark("合同拥有者工号");
		dataDomain.setFieldsType("VARCHAR2");
		columns.add(dataDomain);
		
		dataDomain = new DataDomain();
		dataDomain.setClassName("ownerPosId");
		dataDomain.setClassType("String");
		dataDomain.setFieldsNum("64");
		dataDomain.setFieldsName("OWNER_POS_ID");
		dataDomain.setFieldsRemark("合同拥有者岗位号");
		dataDomain.setFieldsType("VARCHAR2");
		columns.add(dataDomain);
		
		dataDomain = new DataDomain();
		dataDomain.setClassName("ownerUserName");
		dataDomain.setClassType("String");
		dataDomain.setFieldsNum("10");
		dataDomain.setFieldsName("OWNER_USER_NAME");
		dataDomain.setFieldsRemark("合同拥有者名称");
		dataDomain.setFieldsType("VARCHAR2");
		columns.add(dataDomain);
		
		dataDomain = new DataDomain();
		dataDomain.setClassName("recCreator");
		dataDomain.setClassType("String");
		dataDomain.setFieldsNum("64");
		dataDomain.setFieldsName("REC_CREATOR");
		dataDomain.setFieldsRemark("记录创建者");
		dataDomain.setFieldsType("VARCHAR2");
		columns.add(dataDomain);
		
		dataDomain = new DataDomain();
		dataDomain.setClassName("recCreateName");
		dataDomain.setClassType("String");
		dataDomain.setFieldsNum("14");
		dataDomain.setFieldsName("REC_CREATE_NAME");
		dataDomain.setFieldsRemark("记录创建时间");
		dataDomain.setFieldsType("VARCHAR2");
		columns.add(dataDomain);
		
		dataDomain = new DataDomain();
		dataDomain.setClassName("recRevisor");
		dataDomain.setClassType("String");
		dataDomain.setFieldsNum("64");
		dataDomain.setFieldsName("REC_REVISOR");
		dataDomain.setFieldsRemark("记录最后修改人");
		dataDomain.setFieldsType("VARCHAR2");
		columns.add(dataDomain);
		
		dataDomain = new DataDomain();
		dataDomain.setClassName("recReviceTime");
		dataDomain.setClassType("String");
		dataDomain.setFieldsNum("14");
		dataDomain.setFieldsName("REC_REVICE_TIME");
		dataDomain.setFieldsRemark("记录最后修改时间");
		dataDomain.setFieldsType("VARCHAR2");
		columns.add(dataDomain);
		
		return columns;
	}
	
    public Map<String,Object> getDataMap(String tableName,List<DataDomain> columns){
    	Map<String,Object> dataMap = new HashMap<String,Object>();
    	dataMap.put("rootName","XPPH");
        dataMap.put("tableName","TPHCT100");
        dataMap.put("tableRemark","合同拥有者记录表");
        dataMap.put("serviceName","PHCT100");//表名称
        dataMap.put("model_column", columns);
    	return dataMap;
    }

	
	public static void main(String[] args) {
		WorkingCodegenController workingCodegenController = new WorkingCodegenController();
		try {
			List<DataDomain> columns = workingCodegenController.getDataList();
			Map<String,Object> dataMap = workingCodegenController.getDataMap("member_authority", columns);
			workingCodegenController.codegenMain("E:\\workspace\\githubWorkSpace\\commons-platform\\commons-codegen\\src\\main\\resources\\templates\\templateWorking", dataMap, "E:\\");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
