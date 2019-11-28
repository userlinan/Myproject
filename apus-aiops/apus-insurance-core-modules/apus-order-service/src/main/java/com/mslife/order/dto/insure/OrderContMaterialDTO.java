package com.mslife.order.dto.insure;

import java.io.Serializable;
/**
 * 投保单资料
 * @author 蚂蚁
 *
 */
public class OrderContMaterialDTO implements Serializable{

	private static final long serialVersionUID = 5187420397588649304L;
	/** 订单号 */
	private String orderId;
	
	/** 子订单号 */
	private String subOrderId;
		
	/** 资料类型 */
	private String materialType;
		
	/** 资料链接 */
	private String materialUrl;
		
	/** 顺序 */
	private int sort;
	
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
	
	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	
	public String getMaterialUrl() {
		return materialUrl;
	}

	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
	}
	
	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}
}
