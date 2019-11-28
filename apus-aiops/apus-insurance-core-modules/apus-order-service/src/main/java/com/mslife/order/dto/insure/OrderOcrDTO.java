package com.mslife.order.dto.insure;

import java.io.Serializable;
/**
 * ORC识别信息
 * @author 蚂蚁
 *
 */
public class OrderOcrDTO implements Serializable{

	private static final long serialVersionUID = 4486061758026901441L;
	/** 子订单号 */
	private String subOrderId;
		
	/** 客户类型 */
	private String cusType;
		
	/** 客户号 */
	private String cusId;
	
	/**影像类型*/
	private String imagesType;

	/**影像链接地址*/
	private String imagesUrl;

	/**证件类型*/
	private String idType;

	/**业务员所属机构*/
	private String bandCode;


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

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getImagesType() {
		return imagesType;
	}

	public void setImagesType(String imagesType) {
		this.imagesType = imagesType;
	}

	public String getImagesUrl() {
		return imagesUrl;
	}

	public void setImagesUrl(String imagesUrl) {
		this.imagesUrl = imagesUrl;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getBandCode() {
		return bandCode;
	}

	public void setBandCode(String bandCode) {
		this.bandCode = bandCode;
	}
}
