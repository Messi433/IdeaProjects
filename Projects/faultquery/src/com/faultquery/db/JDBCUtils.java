/**  
 * All rights Reserved,Designed By XS
 * @Title: JDBCUtils.java
 * @Package com.faultquery.db
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午6:38:25
 * @version V1.0
 */
package com.faultquery.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**   
 * @ClassName: JDBCUtils
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午6:38:25
 * @version V1.0
 */
public class JDBCUtils {
	
	/**
	 * @Title: releaseConnection
	 * @Description: 释放Connection连接
	 * @return void
	 */
	public static void releaseConnection(Connection connection) {

		try {
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @Fields dataSource: 数据源。
	 */
	private static DataSource dataSource = null;

	static {
		// 数据源只能被创建一次，所以放在静态代码块中。
		dataSource = new ComboPooledDataSource("faultquery");
	}

	/**
	 * @Title: getConnection
	 * @Description: 返回数据源的一个Connection对象
	 * @return
	 * @return Connection
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

}
