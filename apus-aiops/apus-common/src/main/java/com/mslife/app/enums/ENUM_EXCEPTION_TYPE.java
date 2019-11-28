package com.mslife.app.enums;

import java.util.ArrayList;
import java.util.List;

public enum ENUM_EXCEPTION_TYPE {

	SUCCESS("000000","成功"),
    FAILURE("000001","失败"),
    TIMED_OUT("000002","请求超时"),
    REPEAT_REQUEST("010100","重复请求");
	
	private final String code;
	private final String message;

	public String getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	private ENUM_EXCEPTION_TYPE(String code, String message) {
		this.code = code;
		this.message = message;
	}
	/**
	 * 通过枚举值码查找枚举值
	 * @param code
	 * @return
	 */
	public static ENUM_EXCEPTION_TYPE findStatus(String code) {
		for(ENUM_EXCEPTION_TYPE status:values()) {
			if(status.getCode().equals(code)) {
				return status;
			}
		}
		throw new IllegalArgumentException("ResultInfo StatusEnum not legal:" + code);//非法数据异常;
	}
	
	/**
	 * 获取所有的码值
	 */
	public static List<ENUM_EXCEPTION_TYPE> getValues(){
		List<ENUM_EXCEPTION_TYPE> list=new ArrayList<ENUM_EXCEPTION_TYPE>();
		for (ENUM_EXCEPTION_TYPE value : values()) {
			list.add(value);
		}
		return list;
	}
	/**
	 * 获取所有的码值
	 * @return
	 */
	public static List<String> getCodes(){
		List<String> list=new ArrayList<>();
		for (ENUM_EXCEPTION_TYPE code : values()) {
			list.add(code.getCode());
		}
		return list;
	}
	/**
	 * 转义报错(用于批量处理的异常)
	 * @param errCode
	 * @param args
	 * @return
	 */
	public static String getMessageStr(String errCode,Object[] args) {
		String errMsg=ENUM_EXCEPTION_TYPE.findStatus(errCode).getMessage();
		errMsg=String.format(errCode, args);
		return errMsg;
	}
}
	
