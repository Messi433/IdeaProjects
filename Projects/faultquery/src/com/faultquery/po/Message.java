/**  
 * All rights Reserved,Designed By XS
 * @Title: Message.java
 * @Package com.faultquery.po
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月30日 下午4:31:06
 * @version V1.0
 */
package com.faultquery.po;

import java.sql.Date;

/**   
 * @ClassName: Message
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月30日 下午4:31:06
 * @version V1.0
 */
public class Message {
	
	private Integer id;
	private String name;
	private String title;
	private Date time;
	private String content;
	private Integer count;
	
	
	
	/**   
	 * @Title: Message
	 * @Description: TODO
	 */
	public Message() {
		super();
	}
	/**   
	 * @Title: Message
	 * @Description: TODO
	 * @param name
	 * @param title
	 * @param time
	 * @param content
	 * @param count
	 */
	public Message(String name, String title, Date time, String content, Integer count) {
		super();
		this.name = name;
		this.title = title;
		this.time = time;
		this.content = content;
		this.count = count;
	}
	/**   
	 * @Title: Message
	 * @Description: TODO
	 * @param id
	 * @param name
	 * @param title
	 * @param time
	 * @param content
	 * @param count
	 */
	public Message(Integer id, String name, String title, Date time, String content, Integer count) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.time = time;
		this.content = content;
		this.count = count;
	}
	/**  
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**  
	 * @param id: the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**  
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**  
	 * @param name: the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**  
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**  
	 * @param title: the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**  
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}
	/**  
	 * @param time: the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}
	/**  
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**  
	 * @param content: the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**  
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}
	/**  
	 * @param count: the count to set
	 */
	public void setCount(Integer count) {
		this.count = count;
	}
	/**   
	 * <p>Title: toString</p>
	 * <p>Description: </p>
	 * @see java.lang.Object#toString()
	 * @return
	 */
	@Override
	public String toString() {
		return "Message [id=" + id + ", name=" + name + ", title=" + title + ", time=" + time + ", content=" + content
				+ "]";
	}
	
	
	

}
