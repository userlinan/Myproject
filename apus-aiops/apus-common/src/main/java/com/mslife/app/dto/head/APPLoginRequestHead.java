package com.mslife.app.dto.head;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
/**
 * 
 * @author 蚂蚁
 *
 */
public class APPLoginRequestHead implements Serializable{
	private static final long serialVersionUID = 177843495436438205L;
	/**请求流水号*/
	@Valid
	@NotBlank(message = "请求流水号不能为空")
   private String transId;
   
   /**操作用户的id*/
	@Valid
    @NotBlank(message = "操作用户ID不能为空")
   private String operatorId;
   
   /**用户登录时返回的ticket id */
   private String ticketId;
   
   /**用户登录时返回的tokenId */
   @Valid
   @NotBlank(message = "用户登录的tokenId不能为空")
   private String tokenId;
   
   /**设备独有的id*/
   @Valid
   @NotBlank(message = "设备序列号不能为空")
   private String deviceToken;
   
   /**设备操作系统类型*/
   @Valid
   @NotBlank(message = "设备操作系统不能为空")
   private String deviceOS;
   
   /**交易日期*/
   @Valid
   @NotBlank(message = "交易日期不能为空")
   private String transDate;
   
   /**交易时间*/
   @Valid
   @NotBlank(message = "交易时间不能为空")
   private String transTime;
   
   /**交易类型*/
   private String transType;
   
   /**客户端版本号*/
   @Valid
   @NotBlank(message = "客户端版本不能为空")
   private String version;
   
   /**所需语言*/
   private String lang;

public String getTransId() {
	return transId;
}

public void setTransId(String transId) {
	this.transId = transId;
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

public String getDeviceToken() {
	return deviceToken;
}

public void setDeviceToken(String deviceToken) {
	this.deviceToken = deviceToken;
}

public String getDeviceOS() {
	return deviceOS;
}

public void setDeviceOS(String deviceOS) {
	this.deviceOS = deviceOS;
}

public String getTransDate() {
	return transDate;
}

public void setTransDate(String transDate) {
	this.transDate = transDate;
}

public String getTransTime() {
	return transTime;
}

public void setTransTime(String transTime) {
	this.transTime = transTime;
}

public String getTransType() {
	return transType;
}

public void setTransType(String transType) {
	this.transType = transType;
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
   
}
