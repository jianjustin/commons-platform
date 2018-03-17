package org.janine.jian.utils.database;

/**
 * 数据库连接实体类
 * @author jian
 *
 */
public class DataSourceDomain {

	/**
	 * 数据库连接url
	 */
	private String url;
	/**
	 * 数据库连接用户名
	 */
	private String userName;
	/**
	 * 数据库连接密码
	 */
	private String password;
	/**
	 * 数据库连接驱动类
	 */
	private String driver;
	/**
	 * 数据库连接数据库名称
	 */
	private String schema;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	
	
}
