package com.mslife.order.dto.insure;

import java.io.Serializable;
/**
 * 地址信息列表
 * @author 蚂蚁
 *
 */
public class OrderCusAddressDTO implements Serializable{

	private static final long serialVersionUID = -7050893987607002556L;
	/**地址编号*/
	private String addressId;

	/**地址类型*/
	private String addressType;

	/**省*/
	private String province;

	/**省*/
	private String provinceName;

	/**市*/
	private String city;
	
	/**市*/
	private String cityName;

	/**区*/
	private String country;

	/**区*/
	private String countryName;

	/**街道*/
	private String street;

	/**详细地址*/
	private String address;

	/**邮编*/
	private String zipCode;

	/**同通讯地址标志*/
	private String asPostalAddressFlag;

	/**同投保人标志*/
	private String asAppntFlag;

	/**同投被保人标志*/
	private String asInsureFlag;

	/** 客户编号：appnt_id/insured_id/bnf_id */
	private String cusId;

	/** 客户类型 A 投保人   I 被保人 B 受益人 */
	private String cusType;
	
	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAsPostalAddressFlag() {
		return asPostalAddressFlag;
	}

	public void setAsPostalAddressFlag(String asPostalAddressFlag) {
		this.asPostalAddressFlag = asPostalAddressFlag;
	}

	public String getAsAppntFlag() {
		return asAppntFlag;
	}

	public void setAsAppntFlag(String asAppntFlag) {
		this.asAppntFlag = asAppntFlag;
	}

	public String getAsInsureFlag() {
		return asInsureFlag;
	}

	public void setAsInsureFlag(String asInsureFlag) {
		this.asInsureFlag = asInsureFlag;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusType() {
		return cusType;
	}

	public void setCusType(String cusType) {
		this.cusType = cusType;
	}
}
