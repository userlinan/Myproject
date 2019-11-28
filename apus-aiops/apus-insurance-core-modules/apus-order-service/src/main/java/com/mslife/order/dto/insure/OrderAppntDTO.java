package com.mslife.order.dto.insure;

import java.io.Serializable;
import java.util.List;

import com.mslife.order.dao.AppOrderAgentNotiyDao;
import com.mslife.order.dao.AppOrderCusNotiyDao;
/**
 * 
 * @author 蚂蚁
 *
 */
public class OrderAppntDTO  implements Serializable{

	private static final long serialVersionUID = 8875166593652519429L;
	 private String relaToInsured;

	    /** 投保人编号（预留） */
	    private String appntId;

	    /** 订单号（预留） */
	    private String orderId;

	    /** 子订单号 （预留）*/
	    private String subOrderId;

	    /** 投保单号（预留） */
	    private String prtNo;

	    /** 客户号（预留） */
	    private String cusNo;

	    /** 客户姓名 */
	    private String name;

	    /** 性别 */
	    private String sex;

	    /** 性别 */
	    private String sexName;

	    /** 出生日期 */
	    private String birthday;

	    /** 年龄 */
	    private String age;

	    /** 证件类型 */
	    private String idType;

	    /** 证件类型 */
	    private String idTypeName;

	    /** 证件号码 */
	    private String idNo;

	    /** 证件有效期类型 */
	    private String validcardtype;

	    /** 证件有效期起期 */
	    private String validcardstartdate;

	    /** 证件有效期止期 */
	    private String validcardenddate;

	    /** 证件有效期止期 */
	    private String validcardenddateName;
	    
	    /** 国籍 */
	    private String national;

	    /** 国籍 */
	    private String nationalName;

	    /** 是否有社保 */
	    private String socialSecurityFlag;

	    /** 身高 */
	    private String height;

	    /** 体重 */
	    private String weight;

	    /** 税收居民身份 */
	    private String taxType;

	    /** 年收入（单位万元） */
	    private String annualincome;
	    
	    /** 工作单位 */
	    private String workplace;

	    /** 职业 */
	    private String occupation;

	    /** 职业 */
	    private String occupationName;

	    /** 兼职职业 */
	    private String parttimeOccupation;
	    
		/** 兼职职业 */
		private String parttimeOccupationName;

	    /** 手机号码 */
	    private String phone;

	    /** 邮箱 */
	    private String email;

	    /** 婚姻状况 */
	    private String marriageState;
	    
	    /** 婚姻状况 */
	    private String marriageStateName;

	    /** OCR识别信息 */
	    private List<OrderOcrDTO> ocrInfos;

	    /** 税收居民身份信息 */
	    private OrderCusCrsDTO crsInfo;

	    /** 地址信息列表 */
	    private List<OrderCusAddressDTO> addressInfos;

	    /** 代理人告知 */
	    private List<AppOrderAgentNotiyDao> agentDisclosures;

	    /** 投保人告知 */
	    private List<AppOrderCusNotiyDao> disclosures;
	    
	    /** 投保人告知(电子投保) */
	    private List<AppOrderCusNotiyDao> disclosuresPDF;

		public String getRelaToInsured() {
			return relaToInsured;
		}

		public void setRelaToInsured(String relaToInsured) {
			this.relaToInsured = relaToInsured;
		}

		public String getAppntId() {
			return appntId;
		}

		public void setAppntId(String appntId) {
			this.appntId = appntId;
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

		public String getPrtNo() {
			return prtNo;
		}

		public void setPrtNo(String prtNo) {
			this.prtNo = prtNo;
		}

		public String getCusNo() {
			return cusNo;
		}

		public void setCusNo(String cusNo) {
			this.cusNo = cusNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getSexName() {
			return sexName;
		}

		public void setSexName(String sexName) {
			this.sexName = sexName;
		}

		public String getBirthday() {
			return birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getIdType() {
			return idType;
		}

		public void setIdType(String idType) {
			this.idType = idType;
		}

		public String getIdTypeName() {
			return idTypeName;
		}

		public void setIdTypeName(String idTypeName) {
			this.idTypeName = idTypeName;
		}

		public String getIdNo() {
			return idNo;
		}

		public void setIdNo(String idNo) {
			this.idNo = idNo;
		}

		public String getValidcardtype() {
			return validcardtype;
		}

		public void setValidcardtype(String validcardtype) {
			this.validcardtype = validcardtype;
		}

		public String getValidcardstartdate() {
			return validcardstartdate;
		}

		public void setValidcardstartdate(String validcardstartdate) {
			this.validcardstartdate = validcardstartdate;
		}

		public String getValidcardenddate() {
			return validcardenddate;
		}

		public void setValidcardenddate(String validcardenddate) {
			this.validcardenddate = validcardenddate;
		}

		public String getValidcardenddateName() {
			return validcardenddateName;
		}

		public void setValidcardenddateName(String validcardenddateName) {
			this.validcardenddateName = validcardenddateName;
		}

		public String getNational() {
			return national;
		}

		public void setNational(String national) {
			this.national = national;
		}

		public String getNationalName() {
			return nationalName;
		}

		public void setNationalName(String nationalName) {
			this.nationalName = nationalName;
		}

		public String getSocialSecurityFlag() {
			return socialSecurityFlag;
		}

		public void setSocialSecurityFlag(String socialSecurityFlag) {
			this.socialSecurityFlag = socialSecurityFlag;
		}

		public String getHeight() {
			return height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public String getWeight() {
			return weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		public String getTaxType() {
			return taxType;
		}

		public void setTaxType(String taxType) {
			this.taxType = taxType;
		}

		public String getAnnualincome() {
			return annualincome;
		}

		public void setAnnualincome(String annualincome) {
			this.annualincome = annualincome;
		}

		public String getWorkplace() {
			return workplace;
		}

		public void setWorkplace(String workplace) {
			this.workplace = workplace;
		}

		public String getOccupation() {
			return occupation;
		}

		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}

		public String getOccupationName() {
			return occupationName;
		}

		public void setOccupationName(String occupationName) {
			this.occupationName = occupationName;
		}

		public String getParttimeOccupation() {
			return parttimeOccupation;
		}

		public void setParttimeOccupation(String parttimeOccupation) {
			this.parttimeOccupation = parttimeOccupation;
		}

		public String getParttimeOccupationName() {
			return parttimeOccupationName;
		}

		public void setParttimeOccupationName(String parttimeOccupationName) {
			this.parttimeOccupationName = parttimeOccupationName;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMarriageState() {
			return marriageState;
		}

		public void setMarriageState(String marriageState) {
			this.marriageState = marriageState;
		}

		public String getMarriageStateName() {
			return marriageStateName;
		}

		public void setMarriageStateName(String marriageStateName) {
			this.marriageStateName = marriageStateName;
		}

		public List<OrderOcrDTO> getOcrInfos() {
			return ocrInfos;
		}

		public void setOcrInfos(List<OrderOcrDTO> ocrInfos) {
			this.ocrInfos = ocrInfos;
		}

		public OrderCusCrsDTO getCrsInfo() {
			return crsInfo;
		}

		public void setCrsInfo(OrderCusCrsDTO crsInfo) {
			this.crsInfo = crsInfo;
		}

		public List<OrderCusAddressDTO> getAddressInfos() {
			return addressInfos;
		}

		public void setAddressInfos(List<OrderCusAddressDTO> addressInfos) {
			this.addressInfos = addressInfos;
		}

		public List<AppOrderAgentNotiyDao> getAgentDisclosures() {
			return agentDisclosures;
		}

		public void setAgentDisclosures(List<AppOrderAgentNotiyDao> agentDisclosures) {
			this.agentDisclosures = agentDisclosures;
		}

		public List<AppOrderCusNotiyDao> getDisclosures() {
			return disclosures;
		}

		public void setDisclosures(List<AppOrderCusNotiyDao> disclosures) {
			this.disclosures = disclosures;
		}

		public List<AppOrderCusNotiyDao> getDisclosuresPDF() {
			return disclosuresPDF;
		}

		public void setDisclosuresPDF(List<AppOrderCusNotiyDao> disclosuresPDF) {
			this.disclosuresPDF = disclosuresPDF;
		}

}
