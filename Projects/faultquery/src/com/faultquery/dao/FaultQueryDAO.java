/**  
 * All rights Reserved,Designed By XS
 * @Title: FaultQueryDAO.java
 * @Package com.faultquery.dao
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午7:35:36
 * @version V1.0
 */
package com.faultquery.dao;

import java.util.List;

import com.faultquery.po.Message;
import com.faultquery.po.QueryMessage;
//import com.faultquery.po.Question;

/**   
 * @ClassName: FaultQueryDAO
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午7:35:36
 * @version V1.0
 */
public interface FaultQueryDAO {
	
	public List<Message> getAll(QueryMessage queryMessage);
	
	public Message getById(Integer id);
	
	public void addCount(Integer id, Integer count);
	
}
