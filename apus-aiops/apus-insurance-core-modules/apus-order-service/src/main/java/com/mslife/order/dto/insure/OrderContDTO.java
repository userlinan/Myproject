package com.mslife.order.dto.insure;

import java.io.Serializable;
import java.util.List;

public class OrderContDTO implements Serializable{

	private static final long serialVersionUID = -2874591104159478509L;
	/**子订单号*/
	private String subOrderId;

	/**投保单*/
	private String prtNo;
	
	/**保单号*/
	private String contNo;

	/**保单状态*/
	private String contState;

	/**保单状态描述*/
	private String contStateDesc;

	/**合同类型(1电子、2纸质、3电子+纸质)*/
	private String contType;
	
	/**合同类型(1电子、2纸质、3电子+纸质)*/
	private String contTypeName;

	/**是否自动垫缴保费*/
	private String autoRenewalFlag;
	
	/** 子订单创建日期 */
	private String subOrderCreateDate;

	/** 子订单创建日期(PDF使用) */
	private String subOrderCreateDatePDF;
	
	/** 子订单提交核心日期 */
	private String subOrderCommitDate;

	/**红利领取方式*/
	private String diviGetWay;

	/**领取方式*/
	private String getWay;

	/**领取期限*/
	private String getYear;

	/**领取期限*/
	private String getYearName;

	/**领取年龄*/
	private String getStartYear;

	/**录入来源*/
	private String contSouce;

	/**总保费*/
	private String totalPrem;

	/**总保额*/
	private String totalAmnt;

	/**总份数*/
	private String sumMult;
	
	/**万能追加保险（专用于电子保单生成PDF）*/
	private String addWnPrem;
	
	/** 险种信息列表 */
	private List<OrderPolInfoDTO> polInfos;

	/** 险种信息列表 */
	private List<OrderContMaterialDTO> contMaterialInfos;
	
	public String getSubOrderId() {
		return subOrderId;
	}

	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}
	
	public String getContNo() {
		return contNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	public String getPrtNo() {
		return prtNo;
	}

	public void setPrtNo(String prtNo) {
		this.prtNo = prtNo;
	}

	public String getContState() {
		return contState;
	}

	public void setContState(String contState) {
		this.contState = contState;
	}

	public String getContStateDesc() {
		return contStateDesc;
	}

	public void setContStateDesc(String contStateDesc) {
		this.contStateDesc = contStateDesc;
	}

	public String getContType() {
		return contType;
	}

	public void setContType(String contType) {
		this.contType = contType;
	}

	public String getContTypeName() {
		return contTypeName;
	}

	public void setContTypeName(String contTypeName) {
		this.contTypeName = contTypeName;
	}

	public String getAutoRenewalFlag() {
		return autoRenewalFlag;
	}

	public void setAutoRenewalFlag(String autoRenewalFlag) {
		this.autoRenewalFlag = autoRenewalFlag;
	}
	
	public String getSubOrderCreateDate() {
		return subOrderCreateDate;
	}

	public void setSubOrderCreateDate(String subOrderCreateDate) {
		this.subOrderCreateDate = subOrderCreateDate;
	}
	
	public String getSubOrderCreateDatePDF() {
		return subOrderCreateDatePDF;
	}

	public void setSubOrderCreateDatePDF(String subOrderCreateDatePDF) {
		this.subOrderCreateDatePDF = subOrderCreateDatePDF;
	}

	public String getSubOrderCommitDate() {
		return subOrderCommitDate;
	}

	public void setSubOrderCommitDate(String subOrderCommitDate) {
		this.subOrderCommitDate = subOrderCommitDate;
	}

	public String getDiviGetWay() {
		return diviGetWay;
	}

	public void setDiviGetWay(String diviGetWay) {
		this.diviGetWay = diviGetWay;
	}

	public String getGetWay() {
		return getWay;
	}

	public void setGetWay(String getWay) {
		this.getWay = getWay;
	}

	public String getGetYear() {
		return getYear;
	}

	public void setGetYear(String getYear) {
		this.getYear = getYear;
	}
	
	public String getGetYearName() {
		return getYearName;
	}

	public void setGetYearName(String getYearName) {
		this.getYearName = getYearName;
	}

	public String getGetStartYear() {
		return getStartYear;
	}

	public void setGetStartYear(String getStartYear) {
		this.getStartYear = getStartYear;
	}

	public String getContSouce() {
		return contSouce;
	}

	public void setContSouce(String contSouce) {
		this.contSouce = contSouce;
	}

	public String getTotalPrem() {
		return totalPrem;
	}

	public void setTotalPrem(String totalPrem) {
		this.totalPrem = totalPrem;
	}

	public String getTotalAmnt() {
		return totalAmnt;
	}

	public void setTotalAmnt(String totalAmnt) {
		this.totalAmnt = totalAmnt;
	}

	public String getSumMult() {
		return sumMult;
	}

	public void setSumMult(String sumMult) {
		this.sumMult = sumMult;
	}

	public List<OrderPolInfoDTO> getPolInfos() {
		return polInfos;
	}

	public void setPolInfos(List<OrderPolInfoDTO> polInfos) {
		this.polInfos = polInfos;
	}

	public List<OrderContMaterialDTO> getContMaterialInfos() {
		return contMaterialInfos;
	}

	public void setContMaterialInfos(List<OrderContMaterialDTO> contMaterialInfos) {
		this.contMaterialInfos = contMaterialInfos;
	}

	public String getAddWnPrem() {
		return addWnPrem;
	}

	public void setAddWnPrem(String addWnPrem) {
		this.addWnPrem = addWnPrem;
	}
}
