package com.mslife.order.dto.insure;

import java.io.Serializable;
import java.util.List;
/**
 * 被保人信息列表
 * @author 蚂蚁
 *
 */
public class OrderInsuredsDTO implements Serializable{

	private static final long serialVersionUID = 6222485084859143502L;
	private OrderInsuredDTO insuredInfo;

	/** 保单信息 */
	private OrderContDTO contInfo;

	/** 受益人信息列表 */
	private List<OrderBnfDTO> bnfInfos;

	public OrderInsuredDTO getInsuredInfo() {
		return insuredInfo;
	}

	public void setInsuredInfo(OrderInsuredDTO insuredInfo) {
		this.insuredInfo = insuredInfo;
	}

	public OrderContDTO getContInfo() {
		return contInfo;
	}

	public void setContInfo(OrderContDTO contInfo) {
		this.contInfo = contInfo;
	}

	public List<OrderBnfDTO> getBnfInfos() {
		return bnfInfos;
	}

	public void setBnfInfos(List<OrderBnfDTO> bnfInfos) {
		this.bnfInfos = bnfInfos;
	}
}
