package com.mslife.order.dto.insure;

import java.io.Serializable;
/**
 * 缴费账户信息
 * @author 蚂蚁
 *
 */
public class OrderPayAccDTO implements Serializable{

	private static final long serialVersionUID = -4516874503349858681L;
	/** 账户编号 */
	private String payAccId;

	/** 银行卡正面照链接地址 */
	private String bankFrontImagesUrl;

	/** 持卡人姓名 */
	private String payCusName;

	/** 账号 */
	private String accNo;

	/** 银行 */
	private String accBankCode;

	/** 银行 */
	private String accBankName;

	/** 开户行所在省 */
	private String bankProvince;

	/** 开户行所在省 */
	private String bankProvinceName;

	/** 开户行所在市 */
	private String bankCity;

	/** 开户行所在市 */
	private String bankCityName;

	/** 账户绑定手机号 */
	private String accPhone;

	/** 首/续期同缴费账户标志:当前默认传是01 */
	private String sameAccFlag;
	
	/** 签约状态 */
	private String signState;
		
	/** 签约时间 */
	private String signTime;
	
	/** 支付说明原因（交费失败时使用） */
	private String payStateDesc;

	public String getPayAccId() {
		return payAccId;
	}

	public void setPayAccId(String payAccId) {
		this.payAccId = payAccId;
	}

	public String getBankFrontImagesUrl() {
		return bankFrontImagesUrl;
	}

	public void setBankFrontImagesUrl(String bankFrontImagesUrl) {
		this.bankFrontImagesUrl = bankFrontImagesUrl;
	}

	public String getPayCusName() {
		return payCusName;
	}

	public void setPayCusName(String payCusName) {
		this.payCusName = payCusName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccBankCode() {
		return accBankCode;
	}

	public void setAccBankCode(String accBankCode) {
		this.accBankCode = accBankCode;
	}

	public String getAccBankName() {
		return accBankName;
	}

	public void setAccBankName(String accBankName) {
		this.accBankName = accBankName;
	}

	public String getBankProvince() {
		return bankProvince;
	}

	public void setBankProvince(String bankProvince) {
		this.bankProvince = bankProvince;
	}

	public String getBankProvinceName() {
		return bankProvinceName;
	}

	public void setBankProvinceName(String bankProvinceName) {
		this.bankProvinceName = bankProvinceName;
	}

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankCityName() {
		return bankCityName;
	}

	public void setBankCityName(String bankCityName) {
		this.bankCityName = bankCityName;
	}

	public String getAccPhone() {
		return accPhone;
	}

	public void setAccPhone(String accPhone) {
		this.accPhone = accPhone;
	}

	public String getSameAccFlag() {
		return sameAccFlag;
	}

	public void setSameAccFlag(String sameAccFlag) {
		this.sameAccFlag = sameAccFlag;
	}

	public String getSignState() {
		return signState;
	}

	public void setSignState(String signState) {
		this.signState = signState;
	}

	public String getSignTime() {
		return signTime;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getPayStateDesc() {
		return payStateDesc;
	}

	public void setPayStateDesc(String payStateDesc) {
		this.payStateDesc = payStateDesc;
	}
}
