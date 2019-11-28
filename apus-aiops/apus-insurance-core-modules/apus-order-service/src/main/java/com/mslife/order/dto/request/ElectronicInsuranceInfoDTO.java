package com.mslife.order.dto.request;

import java.io.Serializable;
import java.util.List;

import com.mslife.order.dto.insure.OrderAppntDTO;
import com.mslife.order.dto.insure.OrderContMaterialDTO;
import com.mslife.order.dto.insure.OrderInsuredsDTO;
import com.mslife.order.dto.insure.OrderPayAccDTO;
/**
 * 电子通报请求报文体
 * @author 蚂蚁
 *
 */
public class ElectronicInsuranceInfoDTO implements Serializable{

	private static final long serialVersionUID = -2102786383210105406L;
	/** 订单号（查询） */
	private String orderId;
	
	/** 子订单号（查询） */
	private String subOrderId;

	/** 暂存标识（查询 投保申请接口） */
	private String tmpOrderFlag;
	
	/** 订单类型 */
	private String orderType;
	
	/** proInsu商品投保、planInsu计划书投保 */
	private String planModelPlateId;
	
	/** proInsu商品投保名称、planInsu计划书投保名称 */
	private String orderName;
	
	/** 代理人编码 */
	private String agentCode;

	/** 代理人所属机构 */
	private String brandCode;

    /** 投保人信息 */
	private OrderAppntDTO appntInfo;

    /** 被保人信息列表 */
	private List<OrderInsuredsDTO> insuredInfos;

    /** 缴费账户信息 */
	private OrderPayAccDTO payAccInfo;
	
    /** 首期总保费 */
	private String totalPrem;

    /** 订单状态 */
	private String orderState;

    /** 查询数据来源  */
	private String sourceFlag;
	
	/** 上传资料*/
	private List<OrderContMaterialDTO> materialInfos;

	/**
	 * 投被保人选是的告知总数量(电子保单PDF用)
	 */
	private String sizes;

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
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
	
	public String getTmpOrderFlag() {
		return tmpOrderFlag;
	}

	public void setTmpOrderFlag(String tmpOrderFlag) {
		this.tmpOrderFlag = tmpOrderFlag;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getPlanModelPlateId() {
		return planModelPlateId;
	}

	public void setPlanModelPlateId(String planModelPlateId) {
		this.planModelPlateId = planModelPlateId;
	}
	
	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	
	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public OrderAppntDTO getAppntInfo() {
		return appntInfo;
	}

	public void setAppntInfo(OrderAppntDTO appntInfo) {
		this.appntInfo = appntInfo;
	}

	public List<OrderInsuredsDTO> getInsuredInfos() {
		return insuredInfos;
	}

	public void setInsuredInfos(List<OrderInsuredsDTO> insuredInfos) {
		this.insuredInfos = insuredInfos;
	}

	public OrderPayAccDTO getPayAccInfo() {
		return payAccInfo;
	}

	public void setPayAccInfo(OrderPayAccDTO payAccInfo) {
		this.payAccInfo = payAccInfo;
	}

	public String getTotalPrem() {
		return totalPrem;
	}

	public void setTotalPrem(String totalPrem) {
		this.totalPrem = totalPrem;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	
	public List<OrderContMaterialDTO> getMaterialInfos() {
		return materialInfos;
	}

	public void setMaterialInfos(List<OrderContMaterialDTO> materialInfos) {
		this.materialInfos = materialInfos;
	}

	public String getSourceFlag() {
		return sourceFlag;
	}

	public void setSourceFlag(String sourceFlag) {
		this.sourceFlag = sourceFlag;
	}
}
