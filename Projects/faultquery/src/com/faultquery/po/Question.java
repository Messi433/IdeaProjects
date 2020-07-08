/**  
 * All rights Reserved,Designed By XS
 * @Title: Question.java
 * @Package com.faultquery.po
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午7:24:45
 * @version V1.0
 */
package com.faultquery.po;

/**   
 * @ClassName: Question
 * @Description: TODO
 * @author: XS
 * @date: 2019年5月29日 下午7:24:45
 * @version V1.0
 */
public class Question {
	
	private Integer id;
	private String faultType;
	private String faultWebsite;
	private String faultTitle;
	private String faultTime;
	private String faultAnswer;
	private String faultCount;
	/**   
	 * @Title: Question
	 * @Description: TODO
	 */
	public Question() {
		super();
	}
	/**   
	 * @Title: Question
	 * @Description: TODO
	 * @param id
	 * @param faultType
	 * @param faultWebsite
	 * @param faultTitle
	 * @param faultTime
	 * @param faultAnswer
	 * @param faultCount
	 */
	public Question(Integer id, String faultType, String faultWebsite, String faultTitle, String faultTime,
			String faultAnswer, String faultCount) {
		super();
		this.id = id;
		this.faultType = faultType;
		this.faultWebsite = faultWebsite;
		this.faultTitle = faultTitle;
		this.faultTime = faultTime;
		this.faultAnswer = faultAnswer;
		this.faultCount = faultCount;
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
	 * @return the faultType
	 */
	public String getFaultType() {
		return faultType;
	}
	/**  
	 * @param faultType: the faultType to set
	 */
	public void setFaultType(String faultType) {
		this.faultType = faultType;
	}
	/**  
	 * @return the faultWebsite
	 */
	public String getFaultWebsite() {
		return faultWebsite;
	}
	/**  
	 * @param faultWebsite: the faultWebsite to set
	 */
	public void setFaultWebsite(String faultWebsite) {
		this.faultWebsite = faultWebsite;
	}
	/**  
	 * @return the faultTitle
	 */
	public String getFaultTitle() {
		return faultTitle;
	}
	/**  
	 * @param faultTitle: the faultTitle to set
	 */
	public void setFaultTitle(String faultTitle) {
		this.faultTitle = faultTitle;
	}
	/**  
	 * @return the faultTime
	 */
	public String getFaultTime() {
		return faultTime;
	}
	/**  
	 * @param faultTime: the faultTime to set
	 */
	public void setFaultTime(String faultTime) {
		this.faultTime = faultTime;
	}
	/**  
	 * @return the faultAnswer
	 */
	public String getFaultAnswer() {
		return faultAnswer;
	}
	/**  
	 * @param faultAnswer: the faultAnswer to set
	 */
	public void setFaultAnswer(String faultAnswer) {
		this.faultAnswer = faultAnswer;
	}
	/**  
	 * @return the faultCount
	 */
	public String getFaultCount() {
		return faultCount;
	}
	/**  
	 * @param faultCount: the faultCount to set
	 */
	public void setFaultCount(String faultCount) {
		this.faultCount = faultCount;
	}
	
	
	
	
	/**   
	 * <p>Title: toString</p>
	 * <p>Description: </p>
	 * @see java.lang.Object#toString()
	 * @return
	 */
	@Override
	public String toString() {
		return "Question [id=" + id + ", faultType=" + faultType + ", faultWebsite=" + faultWebsite + ", faultTitle="
				+ faultTitle + ", faultTime=" + faultTime + ", faultAnswer=" + faultAnswer + ", faultCount="
				+ faultCount + "]";
	}
	
	

}
