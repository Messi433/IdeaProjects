/**  
 * All rights Reserved,Designed By XS
 * @Title: FaultQueryDAOImpl.java
 * @Package com.faultquery.dao.impl
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午7:40:15
 * @version V1.0
 */
package com.faultquery.dao.impl;

import java.util.List;

import com.faultquery.dao.DAO;
import com.faultquery.dao.FaultQueryDAO;
import com.faultquery.po.Message;
import com.faultquery.po.QueryMessage;
//import com.faultquery.po.Question;

/**
 * @ClassName: FaultQueryDAOImpl
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午7:40:15
 * @version V1.0
 */
public class FaultQueryDAOImpl extends DAO<Message> implements FaultQueryDAO {

	/**
	 * <p>
	 * Title: getAll
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @see com.faultquery.dao.FaultQueryDAO#getAll(com.faultquery.po.QueryMessage)
	 * @param queryMessage
	 * @return
	 */
	@Override
	public List<Message> getAll(QueryMessage queryMessage) {
		String sql = "SELECT id, name, title, date time, content, count FROM mach"
				+ " WHERE title LIKE ?";
		return getForList(sql, queryMessage.getType());
	}

	/**   
	 * <p>Title: getById</p>
	 * <p>Description: </p>
	 * @see com.faultquery.dao.FaultQueryDAO#getById(java.lang.Integer)
	 * @param id
	 * @return
	 */
	@Override
	public Message getById(Integer id) {
		String sql = "SELECT id, name, title, date time, content, count FROM mach WHERE id = ?";
		return get(sql, id);
	}

	/**   
	 * <p>Title: addCount</p>
	 * <p>Description: </p>
	 * @see com.faultquery.dao.FaultQueryDAO#addCount(java.lang.Integer)
	 * @param id
	 */
	@Override
	public void addCount(Integer id, Integer count) {
		String sql = "UPDATE mach SET count = ? WHERE id = ?";
		update(sql, count, id);;
		
	}

}
