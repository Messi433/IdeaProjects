/**  
 * All rights Reserved,Designed By XS
 * @Title: QueryMessage.java
 * @Package com.faultquery.po
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午7:29:39
 * @version V1.0
 */
package com.faultquery.po;

/**   
 * @ClassName: QueryMessage
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午7:29:39
 * @version V1.0
 */
public class QueryMessage {
	
	private String type;
	private String code;
	private String description;
	/**   
	 * @Title: QueryMessage
	 * @Description: TODO
	 * @param type
	 * @param code
	 * @param description
	 */
	public QueryMessage(String type, String code, String description) {
		super();
		this.type = type;
		this.code = code;
		this.description = description;
	}
	/**   
	 * @Title: QueryMessage
	 * @Description: TODO
	 */
	public QueryMessage() {
		super();
	}
	/**  
	 * @return the type
	 */
	public String getType() {
		return "%" + type + "%" + code + "%";
	}
	/**  
	 * @param type: the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**  
	 * @return the code
	 */
	public String getCode() {
		return "%" + code + "%";
	}
	/**  
	 * @param code: the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**  
	 * @return the description
	 */
	public String getDescription() {
		if (description.equals("请描述您的问题")) {
			return "%%";
		}
		return "%" + description + "%";
	}
	/**  
	 * @param description: the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**   
	 * <p>Title: toString</p>
	 * <p>Description: </p>
	 * @see java.lang.Object#toString()
	 * @return
	 */
	@Override
	public String toString() {
		return "QueryMessage [type=" + type + ", code=" + code + ", description=" + description + "]";
	}
	
	

}
