package org.janine.jian.codegen.model;

/**
 * 模板实体类，用于存放实体类基本属性配置
 * @author janine
 *
 */
public class TemplateDomain {

	private String suffix;
	private String suffix1;
	private String prefix;
	private String prefix1;
	private String diskFilePath;
	private String diskTemplatePath;
	private String tableRemark;
	private String root_package_name;
	private String package_name;
	
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getSuffix1() {
		return suffix1;
	}
	public void setSuffix1(String suffix1) {
		this.suffix1 = suffix1;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getPrefix1() {
		return prefix1;
	}
	public void setPrefix1(String prefix1) {
		this.prefix1 = prefix1;
	}
	public String getDiskFilePath() {
		return diskFilePath;
	}
	public void setDiskFilePath(String diskFilePath) {
		this.diskFilePath = diskFilePath;
	}
	public String getDiskTemplatePath() {
		return diskTemplatePath;
	}
	public void setDiskTemplatePath(String diskTemplatePath) {
		this.diskTemplatePath = diskTemplatePath;
	}
	public String getTableRemark() {
		return tableRemark;
	}
	public void setTableRemark(String tableRemark) {
		this.tableRemark = tableRemark;
	}
	public String getRoot_package_name() {
		return root_package_name;
	}
	public void setRoot_package_name(String root_package_name) {
		this.root_package_name = root_package_name;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	
	
}
