package com.mslife.order.dto.insure;

import java.io.Serializable;
import java.util.List;

import com.mslife.order.dao.AppOrderCusNotiyDao;
/**
 * 
 * @author 蚂蚁
 *
 */
public class OrderInsuredDTO implements Serializable{

	private static final long serialVersionUID = -1667895346078107754L;
	/** 被保人编号 */
	private String insuredId;
		
	/** 订单号 */
	private String orderId;
		
	/** 子订单号 */
	private String subOrderId;
	
	/** 商品编码 */
	private String goodsId;
		
	/** 投保单号 */
	private String prtNo;
		
	/** 客户号 */
	private String cusNo;
		
	/** 与投保人关系 */
	private String insuredRelation;
	
	/** 与投保人关系 */
	private String insuredRelationName;
	
	/** 与投保人关系（反向）*/
	private String appntRelation;
	
	/** 与投保人关系（反向） */
	private String appntRelationName;
		
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
		
	/** 手机号码同投保人标志 */
	private String asAppntPhoneFlag;
		
	/** 是否法定受益人 */
	private String isLegalBnf;
	
	/** 是否法定受益人名称 */
	private String isLegalBnfName;

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

	/** 被保人告知列表 */
	private List<AppOrderCusNotiyDao> disclosures;

	/** 被保人告知列表（电子投保PDF） */
	private List<AppOrderCusNotiyDao> disclosuresPDF;
	
	public String getInsuredId() {
		return insuredId;
	}

	public void setInsuredId(String insuredId) {
		this.insuredId = insuredId;
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
	
	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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

	public String getInsuredRelation() {
		return insuredRelation;
	}

	public void setInsuredRelation(String insuredRelation) {
		this.insuredRelation = insuredRelation;
	}

	public String getInsuredRelationName() {
		return insuredRelationName;
	}

	public void setInsuredRelationName(String insuredRelationName) {
		this.insuredRelationName = insuredRelationName;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
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

	public String getAsAppntPhoneFlag() {
		return asAppntPhoneFlag;
	}

	public void setAsAppntPhoneFlag(String asAppntPhoneFlag) {
		this.asAppntPhoneFlag = asAppntPhoneFlag;
	}

	public String getIsLegalBnf() {
		return isLegalBnf;
	}

	public void setIsLegalBnf(String isLegalBnf) {
		this.isLegalBnf = isLegalBnf;
	}

	public String getIsLegalBnfName() {
		return isLegalBnfName;
	}

	public void setIsLegalBnfName(String isLegalBnfName) {
		this.isLegalBnfName = isLegalBnfName;
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

	public String getAppntRelation() {
		return appntRelation;
	}

	public void setAppntRelation(String appntRelation) {
		this.appntRelation = appntRelation;
	}

	public String getAppntRelationName() {
		return appntRelationName;
	}

	public void setAppntRelationName(String appntRelationName) {
		this.appntRelationName = appntRelationName;
	}
}
