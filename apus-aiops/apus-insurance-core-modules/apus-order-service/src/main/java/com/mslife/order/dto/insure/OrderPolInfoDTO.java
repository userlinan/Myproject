package com.mslife.order.dto.insure;

import java.io.Serializable;

/**
 * 险种信息列表
 * @author 蚂蚁
 *
 */
public class OrderPolInfoDTO implements Serializable {

	private static final long serialVersionUID = 7937534278148315587L;
	/**计划编号*/
	private String polId;

	/**商品编码*/
	private String goodsId;

	/**产品编码*/
	private String productId;
	
	/**主险种编号*/
	private String mainRiskCode;

	/**险种编号*/
	private String riskCode;

	/**险种名称*/
	private String riskName;

	/**险种类别*/
	private String riskType;

	/**险种类别*/
	private String riskType3;
	
	
	/** A -意外伤害保险
            L -定期人寿保险
            D -定期疾病保险
            M -医疗保险
            P -年金类保险 */
	private String riskTypeDetail;
	
	/**保额*/
	private String amnt;

	/**份数*/
	private String mult;

	/**保费*/
	private String prem;

	/**加费*/
	private String addPrem;

	/**保险期间*/
	private String insureYear;

	/**保险期间*/
	private String insureYears;

	/**保险期间*/
	private String insureYearsName;

	/**交费期间*/
	private String payYears;

	/**交费期间 */
	private String payYearsFlag;
	
	/**交费期间*/
	private String payYearsName;
	
	public String getPayYearsName() {
		return payYearsName;
	}

	public void setPayYearsName(String payYearsName) {
		this.payYearsName = payYearsName;
	}

	/**交费方式*/
	private String payIntv;
	
	/**交费方式(0:趸交,1:月交,3:季交,6:半年交,12:年交) */
	private String payIntvName;

	/** 险种生效日 */
	private String cvaliDate;
		
	/** 首期缴费日期 */
	private String firstPayDate;
		
	/** 终交日期 */
	private String payEndDate;
		
	/** 交至日期 */
	private String payToDate;
		
	/** 起领日期 */
	private String getStartDate;
		
	/** 保险责任终止日期 */
	private String endDate;
		
	/** 领取年龄 */
	private String getStartYear;
		
	/** 领取年期 */
	private String getYear;
		
	/** 领取年期标志(A:岁,D:天,M:月,Y:年) */
	private String getYearFlag;
		
	/** 终交年期 */
	private String payEndYear;
		
	/** 终交年期标志(A:岁,D:天,M:月,Y:年) */
	private String payEndYearFlag;
	
	/** 终交年期（显示）*/
	private String payEndYears;
		
	/** 保险年期标志(A:岁,D:天,M:月,Y:年) */
	private String insureYearFlag;
		
	/** 领取方式 */
	private String getWay;
		
	/** 是否自动垫缴保费 */
	private String autoRenewalFlag;
		
	/** 红利领取方式 */
	private String diviGetWay;
		
	/** 职业加费 */
	private String occPrem;
	
	/** 健康加费 */
	private String healthPrem;
	
	/** 医疗职业加费 */
	private String medicalOccPrem;
	
	/** 其他加费 */
	private String otherPrem;
		
	/** 录入来源 */
	private String contSouce;
	
	/**主险标志*/
	private String mainRiskFlag;

	public String getPolId() {
		return polId;
	}

	public void setPolId(String polId) {
		this.polId = polId;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getMainRiskCode() {
		return mainRiskCode;
	}

	public void setMainRiskCode(String mainRiskCode) {
		this.mainRiskCode = mainRiskCode;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getRiskName() {
		return riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	public String getRiskType() {
		return riskType;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public String getRiskType3() {
		return riskType3;
	}

	public void setRiskType3(String riskType3) {
		this.riskType3 = riskType3;
	}

	
	public String getRiskTypeDetail() {
		return riskTypeDetail;
	}

	public void setRiskTypeDetail(String riskTypeDetail) {
		this.riskTypeDetail = riskTypeDetail;
	}

	public String getAmnt() {
		return amnt;
	}

	public void setAmnt(String amnt) {
		this.amnt = amnt;
	}

	public String getMult() {
		return mult;
	}

	public void setMult(String mult) {
		this.mult = mult;
	}

	public String getPrem() {
		return prem;
	}

	public void setPrem(String prem) {
		this.prem = prem;
	}

	public String getAddPrem() {
		return addPrem;
	}

	public void setAddPrem(String addPrem) {
		this.addPrem = addPrem;
	}

	public String getInsureYear() {
		return insureYear;
	}

	public void setInsureYear(String insureYear) {
		this.insureYear = insureYear;
	}

	public String getInsureYears() {
		return insureYears;
	}

	public void setInsureYears(String insureYears) {
		this.insureYears = insureYears;
	}
	
	public String getInsureYearsName() {
		return insureYearsName;
	}

	public void setInsureYearsName(String insureYearsName) {
		this.insureYearsName = insureYearsName;
	}

	public String getPayYears() {
		return payYears;
	}

	public void setPayYears(String payYears) {
		this.payYears = payYears;
	}
	
	public String getPayYearsFlag() {
		return payYearsFlag;
	}

	public void setPayYearsFlag(String payYearsFlag) {
		this.payYearsFlag = payYearsFlag;
	}

	public String getPayIntv() {
		return payIntv;
	}

	public void setPayIntv(String payIntv) {
		this.payIntv = payIntv;
	}
	
	public String getPayIntvName() {
		return payIntvName;
	}

	public void setPayIntvName(String payIntvName) {
		this.payIntvName = payIntvName;
	}

	public String getMainRiskFlag() {
		return mainRiskFlag;
	}

	public void setMainRiskFlag(String mainRiskFlag) {
		this.mainRiskFlag = mainRiskFlag;
	}

	public String getCvaliDate() {
		return cvaliDate;
	}

	public void setCvaliDate(String cvaliDate) {
		this.cvaliDate = cvaliDate;
	}

	public String getFirstPayDate() {
		return firstPayDate;
	}

	public void setFirstPayDate(String firstPayDate) {
		this.firstPayDate = firstPayDate;
	}

	public String getPayEndDate() {
		return payEndDate;
	}

	public void setPayEndDate(String payEndDate) {
		this.payEndDate = payEndDate;
	}

	public String getPayToDate() {
		return payToDate;
	}

	public void setPayToDate(String payToDate) {
		this.payToDate = payToDate;
	}

	public String getGetStartDate() {
		return getStartDate;
	}

	public void setGetStartDate(String getStartDate) {
		this.getStartDate = getStartDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getGetStartYear() {
		return getStartYear;
	}

	public void setGetStartYear(String getStartYear) {
		this.getStartYear = getStartYear;
	}

	public String getGetYear() {
		return getYear;
	}

	public void setGetYear(String getYear) {
		this.getYear = getYear;
	}

	public String getGetYearFlag() {
		return getYearFlag;
	}

	public void setGetYearFlag(String getYearFlag) {
		this.getYearFlag = getYearFlag;
	}

	public String getPayEndYear() {
		return payEndYear;
	}

	public void setPayEndYear(String payEndYear) {
		this.payEndYear = payEndYear;
	}

	public String getPayEndYearFlag() {
		return payEndYearFlag;
	}

	public void setPayEndYearFlag(String payEndYearFlag) {
		this.payEndYearFlag = payEndYearFlag;
	}
	
	public String getPayEndYears() {
		return payEndYears;
	}

	public void setPayEndYears(String payEndYears) {
		this.payEndYears = payEndYears;
	}

	public String getInsureYearFlag() {
		return insureYearFlag;
	}

	public void setInsureYearFlag(String insureYearFlag) {
		this.insureYearFlag = insureYearFlag;
	}

	public String getGetWay() {
		return getWay;
	}

	public void setGetWay(String getWay) {
		this.getWay = getWay;
	}

	public String getAutoRenewalFlag() {
		return autoRenewalFlag;
	}

	public void setAutoRenewalFlag(String autoRenewalFlag) {
		this.autoRenewalFlag = autoRenewalFlag;
	}

	public String getDiviGetWay() {
		return diviGetWay;
	}

	public void setDiviGetWay(String diviGetWay) {
		this.diviGetWay = diviGetWay;
	}

	public String getOccPrem() {
		return occPrem;
	}

	public void setOccPrem(String occPrem) {
		this.occPrem = occPrem;
	}

	public String getContSouce() {
		return contSouce;
	}

	public void setContSouce(String contSouce) {
		this.contSouce = contSouce;
	}

	public String getHealthPrem() {
		return healthPrem;
	}

	public void setHealthPrem(String healthPrem) {
		this.healthPrem = healthPrem;
	}

	public String getMedicalOccPrem() {
		return medicalOccPrem;
	}

	public void setMedicalOccPrem(String medicalOccPrem) {
		this.medicalOccPrem = medicalOccPrem;
	}

	public String getOtherPrem() {
		return otherPrem;
	}

	public void setOtherPrem(String otherPrem) {
		this.otherPrem = otherPrem;
	}
}
