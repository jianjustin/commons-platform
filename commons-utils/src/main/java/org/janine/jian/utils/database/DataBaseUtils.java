package org.janine.jian.utils.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.janine.jian.utils.string.StringUtils;

/**
 * 数据库工具类
 * @author jian
 *
 */
public class DataBaseUtils {

	/**
	 * 根据数据库配置获取数据库连接
	 * @param dataBaseUrl
	 * @param driverName
	 * @param userName
	 * @param password
	 * @return
	 */
	public static Connection getConnection(String dataBaseUrl,String driverName,String userName,String password){
		Connection connection = null;
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(dataBaseUrl, userName, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	/**
	 * 根据数据库连接和表名称获取表字段信息
	 * @param connection
	 * @param tableName
	 * @return
	 * @throws Exception 
	 */
	public static List<ColumnDomain> getDataList(Connection connection,String tableName, Properties properties) throws Exception{
		List<ColumnDomain> columns = new ArrayList<ColumnDomain>();
		ResultSet resultSet = connection.getMetaData().getColumns(null, "%", tableName, "%");
		while(resultSet.next()){
			 ColumnDomain columnDomain = new ColumnDomain();
			 columnDomain.setColumnName(resultSet.getString("COLUMN_NAME"));//字段名称
			 columnDomain.setModelName(StringUtils.toModelName("_", columnDomain.getColumnName()));//对象名称
			 columnDomain.setColumnType(resultSet.getString("TYPE_NAME").toLowerCase());
			 Object modelType = properties.get(resultSet.getString("TYPE_NAME").toUpperCase());
			 if(StringUtils.isBlank(modelType)){
				 throw new Exception("字段类型未知");
			 }
			 columnDomain.setModelType(modelType.toString());
			 columnDomain.setColumnRemark(resultSet.getString("REMARKS"));
			 columns.add(columnDomain);
		 }
		return columns;
	}
	
	public static Map<String,String> getCloumnsTypeMap(){
		Map<String,String> columnsTypeMap = new HashMap<String,String>();
		return columnsTypeMap;
	}
}
