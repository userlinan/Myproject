package com.mslife.order.dto.insure;

import java.io.Serializable;
import java.util.List;

import com.mslife.order.dao.AppOrderCusNotiyDao;
/**
 * 受益人信息
 * @author 蚂蚁
 *
 */
public class OrderBnfDTO implements Serializable {

	private static final long serialVersionUID = 2622734491977520380L;
	/**受益人编号*/
	private String bnfId;

	/**客户认证号*/
	private String cusNo;

	/**受益序号*/
	private String bnfNo;

	/**受益人级别*/
	private String bnfGrade;

	/**受益人级别*/
	private String bnfGradeName;

	/**受益份额*/
	private String bnfLot;
	
	/**受益份额*/
	private String bnfLotCalc;
	
	/**受益类型*/
	private String bnfType;
	
	/**受益类型*/
	private String bnfTypeName;

	/**与被保人关系*/
	private String bnfRelation;

	/**与被保人关系*/
	private String bnfRelationName;

	/**与被保人关系（反向）*/
	private String insuredRelation;

	/**与被保人关系（反向）*/
	private String insuredRelationName;

	/**客户姓名*/
	private String name;

	/**性别*/
	private String sex;
	
    /** 性别 */
    private String sexName;

	/**出生日期*/
	private String birthday;

	/**年龄 */
	private String age;
	
	/**证件类型*/
	private String idType;

	/**证件类型*/
	private String idTypeName;
	
	/**证件号码*/
	private String idNo;

	/**证件有效期类型*/
	private String validcardtype;

	/**证件有效期起期*/
	private String validcardstartdate;

	/**证件有效期止期*/
	private String validcardenddate;

	/**证件有效期止期*/
	private String validcardenddateName;
	
	/**国籍*/
	private String national;
	
	/**国籍*/
	private String nationalName;

	/**职业*/
	private String occupation;
	
	/**职业*/
	private String occupationName;

	/**手机号码*/
	private String phone;
	
	/** 地址信息列表 */
	private List<OrderCusAddressDTO> addressInfos;

	/** 受益人告知 */
	private List<AppOrderCusNotiyDao> disclosures;

	public String getBnfId() {
		return bnfId;
	}

	public void setBnfId(String bnfId) {
		this.bnfId = bnfId;
	}

	public String getCusNo() {
		return cusNo;
	}

	public void setCusNo(String cusNo) {
		this.cusNo = cusNo;
	}

	public String getBnfNo() {
		return bnfNo;
	}

	public void setBnfNo(String bnfNo) {
		this.bnfNo = bnfNo;
	}

	public String getBnfGrade() {
		return bnfGrade;
	}

	public void setBnfGrade(String bnfGrade) {
		this.bnfGrade = bnfGrade;
	}

	public String getBnfGradeName() {
		return bnfGradeName;
	}

	public void setBnfGradeName(String bnfGradeName) {
		this.bnfGradeName = bnfGradeName;
	}

	public String getBnfLot() {
		return bnfLot;
	}

	public void setBnfLot(String bnfLot) {
		this.bnfLot = bnfLot;
	}

	public String getBnfLotCalc() {
		return bnfLotCalc;
	}

	public void setBnfLotCalc(String bnfLotCalc) {
		this.bnfLotCalc = bnfLotCalc;
	}

	public String getBnfType() {
		return bnfType;
	}

	public void setBnfType(String bnfType) {
		this.bnfType = bnfType;
	}

	public String getBnfTypeName() {
		return bnfTypeName;
	}

	public void setBnfTypeName(String bnfTypeName) {
		this.bnfTypeName = bnfTypeName;
	}

	public String getBnfRelation() {
		return bnfRelation;
	}

	public void setBnfRelation(String bnfRelation) {
		this.bnfRelation = bnfRelation;
	}

	public String getBnfRelationName() {
		return bnfRelationName;
	}

	public void setBnfRelationName(String bnfRelationName) {
		this.bnfRelationName = bnfRelationName;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

}
