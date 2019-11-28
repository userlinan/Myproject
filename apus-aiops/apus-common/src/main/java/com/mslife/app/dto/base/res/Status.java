package com.mslife.app.dto.base.res;

import java.io.Serializable;

import com.mslife.app.enums.ENUM_RESULT;

public class Status  implements Serializable{

	private static final long serialVersionUID = -7963053864666976421L;
	/**状态编码**/
	private String statusCode;
	/**状态描述**/
	private String statusMessage;
	
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Status(String statusCode, String statusMessage) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public static Status succ() {
		Status status=new Status();
		status.setStatusCode(ENUM_RESULT.SUCCESS.getCode());
		status.setStatusMessage(ENUM_RESULT.SUCCESS.getDesc());
		return status;
	}
	public static Status fail() {
		Status status=new Status();
		status.setStatusCode(ENUM_RESULT.FAIL.getCode());
		status.setStatusMessage(ENUM_RESULT.FAIL.getDesc());
		return status;
	}
	public static Status fail(String desc) {
		Status status=new Status();
		status.setStatusCode(ENUM_RESULT.FAIL.getCode());
		status.setStatusMessage(desc);
		return status;
	}

	public static Status unusual(String desc) {
		Status ret = new Status();
		ret.setStatusCode(ENUM_RESULT.UNUSUAL.getCode());
		ret.setStatusMessage(desc);
		return ret;
	}

	public static Status paramsError(String desc) {
		Status ret = new Status();
		ret.setStatusCode(ENUM_RESULT.PARAM_ERROR.getCode());
		ret.setStatusMessage(desc);
		return ret;
	}

	public static Status timedOut(String desc) {
		Status ret = new Status();
		ret.setStatusCode(ENUM_RESULT.TIMED_OUT.getCode());
		ret.setStatusMessage(desc);
		return ret;
	}
}
