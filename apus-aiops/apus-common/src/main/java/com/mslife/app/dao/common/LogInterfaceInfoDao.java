package com.mslife.app.dao.common;


import java.io.Serializable;
import java.util.Date;


 public class LogInterfaceInfoDao implements Serializable {
		
	/** 
    * @Fields serialVersionUID : TODO
    */
    private static final long serialVersionUID = 5712795098994623003L;

    /** $eachOne.comment */
	private Integer id;
		
	/** $eachOne.comment */
	private String transId;
		
	/** $eachOne.comment */
	private String deviceOS;
		
	/** $eachOne.comment */
	private String deviceToken;
		
	/** $eachOne.comment */
	private Date transDate;
		
	/** $eachOne.comment */
	private String transTime;
		
	/** $eachOne.comment */
	private String interfaceCode;
		
	/** $eachOne.comment */
	private String transType;
		
	/** $eachOne.comment */
	private String operatorId;
		
	/** $eachOne.comment */
	private String ticketId;
	
	/** $eachOne.comment */
	private String tokenId;
		
	/** $eachOne.comment */
	private String requestIp;
		
	/** $eachOne.comment */
	private String version;
		
	/** $eachOne.comment */
	private String lang;
		
	/** $eachOne.comment */
	private String requestContent;
		
	/** $eachOne.comment */
	private String responseContent;
		
	/** $eachOne.comment */
	private Date requestDate;
		
	/** $eachOne.comment */
	private String requestTime;
		
	/** $eachOne.comment */
	private Date responseDate;
		
	/** $eachOne.comment */
	private String responseTime;
		
	/** $eachOne.comment */
	private String usedTime;
		
	/** $eachOne.comment */
	private String edState;
		
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}
	
	public String getDeviceOS() {
		return deviceOS;
	}

	public void setDeviceOS(String deviceOS) {
		this.deviceOS = deviceOS;
	}
	
	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}
	
	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	
	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}
	
	public String getInterfaceCode() {
		return interfaceCode;
	}

	public void setInterfaceCode(String interfaceCode) {
		this.interfaceCode = interfaceCode;
	}
	
	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}
	
	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	
	public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getRequestIp() {
		return requestIp;
	}

	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}
	
	public String getResponseContent() {
		return responseContent;
	}

	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}
	
	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	
	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	
	public Date getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	
	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}
	
	public String getUsedTime() {
		return usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
	}
	
	public String getEdState() {
		return edState;
	}

	public void setEdState(String edState) {
		this.edState = edState;
	}
		
 }