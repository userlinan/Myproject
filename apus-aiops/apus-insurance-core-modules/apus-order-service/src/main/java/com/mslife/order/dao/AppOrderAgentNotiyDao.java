package com.mslife.order.dao;

import java.io.Serializable;
import java.util.Date;
/**
 * 代理人告知
 * @author 蚂蚁
 *
 */
public class AppOrderAgentNotiyDao implements Serializable{

	private static final long serialVersionUID = -7753092403969276684L;
	/** 主键ID */
	private Long sid;
		
	/** 订单号 */
	private String orderId;
		
	/** 子订单号 */
	private String subOrderId;
		
	/** 业务员编号 */
	private String agentCode;
		
	/** 告知编码 */
	private String notiyCode;
		
	/** 告知版本 */
	private String notiyVersion;
		
	/** 告知结果 */
	private String notiyResult;
		
	/** 告知描述(选择框选择编码) */
	private String notiyDesc;
		
	/** 备注(录入框文本) */
	private String notiyRemark;
		
	/** 有效性 */
	private String edState;
		
	/** 创建者 */
	private String makeOperatorId;
		
	/** 创建时间 */
	private Date makeDate;
		
	/** 修改者 */
	private String modifyOperatorId;
		
	/** 修改时间 */
	private Date modifyDate;
		
	
	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getSubOrderId() {
		return subOrderId;
	}

	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}
	
	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	
	public String getNotiyCode() {
		return notiyCode;
	}

	public void setNotiyCode(String notiyCode) {
		this.notiyCode = notiyCode;
	}
	
	public String getNotiyVersion() {
		return notiyVersion;
	}

	public void setNotiyVersion(String notiyVersion) {
		this.notiyVersion = notiyVersion;
	}
	
	public String getNotiyResult() {
		return notiyResult;
	}

	public void setNotiyResult(String notiyResult) {
		this.notiyResult = notiyResult;
	}
	
	public String getNotiyDesc() {
		return notiyDesc;
	}

	public void setNotiyDesc(String notiyDesc) {
		this.notiyDesc = notiyDesc;
	}
	
	public String getNotiyRemark() {
		return notiyRemark;
	}

	public void setNotiyRemark(String notiyRemark) {
		this.notiyRemark = notiyRemark;
	}
	
	public String getEdState() {
		return edState;
	}

	public void setEdState(String edState) {
		this.edState = edState;
	}
	
	public String getMakeOperatorId() {
		return makeOperatorId;
	}

	public void setMakeOperatorId(String makeOperatorId) {
		this.makeOperatorId = makeOperatorId;
	}
	
	public Date getMakeDate() {
		return makeDate;
	}

	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}
	
	public String getModifyOperatorId() {
		return modifyOperatorId;
	}

	public void setModifyOperatorId(String modifyOperatorId) {
		this.modifyOperatorId = modifyOperatorId;
	}
	
	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
