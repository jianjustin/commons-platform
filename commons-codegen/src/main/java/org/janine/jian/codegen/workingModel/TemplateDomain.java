package org.janine.jian.codegen.workingModel;

import java.util.List;

/**
 * 电科代码模板参数集
 * @author chenjianrui
 *
 */
public class TemplateDomain {

	private String rootName;
	private String tableName;
	private String serviceName;
	private List<DataDomain> dataList;
	public String getRootName() {
		return rootName;
	}
	public void setRootName(String rootName) {
		this.rootName = rootName;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public List<DataDomain> getDataList() {
		return dataList;
	}
	public void setDataList(List<DataDomain> dataList) {
		this.dataList = dataList;
	}
	
	
}
