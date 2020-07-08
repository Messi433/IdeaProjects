/**  
 * All rights Reserved,Designed By XS
 * @Title: DAO.java
 * @Package com.faultquery.dao
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午7:05:22
 * @version V1.0
 */
package com.faultquery.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.faultquery.db.JDBCUtils;


/**   
 * @ClassName: DAO
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午7:05:22
 * @version V1.0
 */
public class DAO<T> {
	
	private QueryRunner queryRunner = new QueryRunner();

	private Class<T> clazz;

	@SuppressWarnings("unchecked")
	public DAO() {
		Type superClass = getClass().getGenericSuperclass();
		if (superClass instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) superClass;
			Type[] typeArgs = parameterizedType.getActualTypeArguments();
			if (typeArgs != null && typeArgs.length > 0) {
				if (typeArgs[0] instanceof Class) {
					clazz = (Class<T>) typeArgs[0];
				}
			}
		}
	}

	/**
	 * @Title: getForValue
	 * @Description: 返回某一个字段的值，例如返回某一条记录的customerName,或返回数据表中有多少条记录等。
	 * @param sql
	 * @param args
	 * @return
	 * @return E
	 */
	public <E> E getForValue(String sql, Object... args) {
		Connection connection = null;
		try {
			connection = JDBCUtils.getConnection();
			return queryRunner.query(connection, sql, new ScalarHandler<>(), args);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.releaseConnection(connection);
		}
		return null;
	}

	/**
	 * @Title: getForList
	 * @Description: 返回T所对应的List
	 * @param sql
	 * @param args
	 * @return
	 * @return List<T>
	 */
	public List<T> getForList(String sql, Object... args) {
		Connection connection = null;
		try {
			connection = JDBCUtils.getConnection();
			return queryRunner.query(connection, sql, new BeanListHandler<>(clazz), args);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.releaseConnection(connection);
		}
		return null;
	}

	/**
	 * @Title: get
	 * @Description: 返回对应的T的一个实例类的对象。
	 * @param sql
	 * @param args
	 * @return
	 * @return T
	 */
	public T get(String sql, Object... args) {
		Connection connection = null;
		try {
			connection = JDBCUtils.getConnection();
			return queryRunner.query(connection, sql, new BeanHandler<>(clazz), args);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.releaseConnection(connection);
		}
		return null;
	}

	/**
	 * @Title: update
	 * @Description: 该方法封装了INSERT、DELETE、UPDATE操作。
	 * @param sql: SQL 语句。
	 * @param args: 填充SQL语句的占位符。
	 * @return void
	 */
	public void update(String sql, Object... args) {
		Connection connection = null;

		try {
			connection = JDBCUtils.getConnection();
			queryRunner.update(connection, sql, args);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.releaseConnection(connection);
		}
	}

}
