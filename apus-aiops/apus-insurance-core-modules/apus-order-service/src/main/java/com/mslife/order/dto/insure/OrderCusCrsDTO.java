package com.mslife.order.dto.insure;

import java.io.Serializable;
/**
 * 税收居民身份信息
 * @author 蚂蚁
 *
 */
public class OrderCusCrsDTO implements Serializable{

	private static final long serialVersionUID = 1544375973698418931L;
	/** 税收身份标识 */
	private String crsType;
	
	/** 税收身份标识 */
	private String crsTypeName;

	/** 姓 */
	private String lastName;

	/** 名 */
	private String firstName;

	/** 境外居住国家 */
	private String abroadLiveNation;

	/** 境外居住地址 */
	private String abroadLiveAddress;
	
	/** 出生地：境内、境外 */
	private String birthPlace;
	
	/** 出生国家 */
	private String birthNation;

	/** 出生地省 */
	private String province;

	/** 出生地省 */
	private String provinceName;

	/** 出生地市 */
	private String city;
	
	/** 出生地市 */
	private String cityName;

	/** 出生地区 */
	private String country;
	
	/** 出生地市 */
	private String countryName;

	/** 出生地街道 */
	private String street;

	/** 出生地详细地址 */
	private String address;

	/** 税收居民国 */
	private String crsNation;

	/** 税收居民国名称 */
	private String crsNationName;

	/** 纳税人识别码 */
	private String crsNo;

	/** 不提供识别码原因 */
	private String notProvidedReason;

	/** 详细原因 */
	private String reasonDesc;
	
	/** 客户编码（投保人、被保人、受益人） */
	private String cusId;

	/** 子订单编码 */
	private String subOrderId;
	
	/** CRS问卷Pdf生成路径 */
	private String crsPdfUrl;

	public String getCrsType() {
		return crsType;
	}

	public void setCrsType(String crsType) {
		this.crsType = crsType;
	}
	
	public String getCrsTypeName() {
		return crsTypeName;
	}

	public void setCrsTypeName(String crsTypeName) {
		this.crsTypeName = crsTypeName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAbroadLiveNation() {
		return abroadLiveNation;
	}

	public void setAbroadLiveNation(String abroadLiveNation) {
		this.abroadLiveNation = abroadLiveNation;
	}

	public String getAbroadLiveAddress() {
		return abroadLiveAddress;
	}

	public void setAbroadLiveAddress(String abroadLiveAddress) {
		this.abroadLiveAddress = abroadLiveAddress;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getProvince() {
		return province;
	}

	public String getBirthNation() {
		return birthNation;
	}

	public void setBirthNation(String birthNation) {
		this.birthNation = birthNation;
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

	public String getCrsNation() {
		return crsNation;
	}

	public void setCrsNation(String crsNation) {
		this.crsNation = crsNation;
	}
	
	public String getCrsNationName() {
		return crsNationName;
	}

	public void setCrsNationName(String crsNationName) {
		this.crsNationName = crsNationName;
	}

	public String getCrsNo() {
		return crsNo;
	}

	public void setCrsNo(String crsNo) {
		this.crsNo = crsNo;
	}

	public String getNotProvidedReason() {
		return notProvidedReason;
	}

	public void setNotProvidedReason(String notProvidedReason) {
		this.notProvidedReason = notProvidedReason;
	}

	public String getReasonDesc() {
		return reasonDesc;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getSubOrderId() {
		return subOrderId;
	}

	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}

	public String getCrsPdfUrl() {
		return crsPdfUrl;
	}

	public void setCrsPdfUrl(String crsPdfUrl) {
		this.crsPdfUrl = crsPdfUrl;
	}
}
