package com.mslife.order.dao;

import java.io.Serializable;
import java.util.Date;
/**
 * 投保人告知
 * @author 蚂蚁
 *
 */
public class AppOrderCusNotiyDao implements Serializable{

	private static final long serialVersionUID = 6938416446743829556L;
	/** 主键ID */
	private Long sid;
		
	/** 告知项编码 */
	private String notiyId;
		
	/** 子订单号 */
	private String subOrderId;
		
	/** 客户类型（投保人：A，被保人：I） */
	private String cusType;
		
	/** 客户编号 */
	private String cusNo;
		
	/** 告知编码 */
	private String notiyCode;
		
	/** 告知结果 */
	private String notiyResult;
		
	/** 告知描述 */
	private String notiyDesc;
	
	/** 告知填写值 */
	private String notiyValue;
	
	/** 告知描述(生成电子投保书使用) */
	private String notiyDescPdf;
	
	/** 告知填写值(生成电子投保书使用)  */
	private String notiyValuePdf;
	
	/** 告知顺序 */
	private int notiySort;
		
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
		
	/** 告知版本 */
	private String notiyVersion;
		
	
	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}
	
	public String getNotiyId() {
		return notiyId;
	}

	public void setNotiyId(String notiyId) {
		this.notiyId = notiyId;
	}
	
	public String getSubOrderId() {
		return subOrderId;
	}

	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}
	
	public String getCusType() {
		return cusType;
	}

	public void setCusType(String cusType) {
		this.cusType = cusType;
	}
	
	public String getCusNo() {
		return cusNo;
	}

	public void setCusNo(String cusNo) {
		this.cusNo = cusNo;
	}
	
	public String getNotiyCode() {
		return notiyCode;
	}

	public void setNotiyCode(String notiyCode) {
		this.notiyCode = notiyCode;
	}
	
	public String getNotiyResult() {
		return notiyResult;
	}

	public void setNotiyResult(String notiyResult) {
		this.notiyResult = notiyResult;
	}
	
	public String getNotiyValue() {
		return notiyValue;
	}

	public void setNotiyValue(String notiyValue) {
		this.notiyValue = notiyValue;
	}

	public String getNotiyDesc() {
		return notiyDesc;
	}

	public void setNotiyDesc(String notiyDesc) {
		this.notiyDesc = notiyDesc;
	}
	
	public String getNotiyDescPdf() {
		return notiyDescPdf;
	}

	public void setNotiyDescPdf(String notiyDescPdf) {
		this.notiyDescPdf = notiyDescPdf;
	}

	public String getNotiyValuePdf() {
		return notiyValuePdf;
	}

	public void setNotiyValuePdf(String notiyValuePdf) {
		this.notiyValuePdf = notiyValuePdf;
	}

	public int getNotiySort() {
		return notiySort;
	}

	public void setNotiySort(int notiySort) {
		this.notiySort = notiySort;
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
	
	public String getNotiyVersion() {
		return notiyVersion;
	}

	public void setNotiyVersion(String notiyVersion) {
		this.notiyVersion = notiyVersion;
	}
}
