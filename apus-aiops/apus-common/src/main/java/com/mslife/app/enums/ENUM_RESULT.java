package com.mslife.app.enums;

public enum ENUM_RESULT {
	SUCCESS("01","成功"),
	FAIL("02","失败"),
	UNUSUAL("03","异常"),
	PARAM_ERROR("04","参数错误"),
	SENDNUM("05","短信次数达到限制"),
    TIMED_OUT("06","系统超时");
	private final String code;
	private final String desc;
	public String getCode() {
		return code;
	}
	public String getDesc() {
		return desc;
	}
	ENUM_RESULT(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	public static String getEnumDescByKey(String key) {
		for (ENUM_RESULT enumResult : ENUM_RESULT.values()) {
			return enumResult.desc;
		}
		return "";
	}
}
