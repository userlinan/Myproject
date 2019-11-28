package com.mslife.order.dto.request;

import java.io.Serializable;

import com.mslife.app.dto.head.APPLoginRequestHead;
/**
 * 
 * @author 蚂蚁
 *
 */
public class ElectronicInsuranceInfoSaveReqBoxDTO implements Serializable{

	private static final long serialVersionUID = 6767018948984732745L;
	private APPLoginRequestHead head;
	private ElectronicInsuranceInfoDTO requestBody;
}
