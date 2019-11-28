package com.mslife.app.exception;

import java.io.Serializable;

import com.mslife.app.enums.ENUM_EXCEPTION_TYPE;
import com.mslife.app.utils.StringUtil;

/**
 * 基本异常处理
 * @author linannan
 *
 */
public class BaseException extends RuntimeException implements Serializable{


	private static final long serialVersionUID = -4388292151953292468L;
	/**错误码**/
	private String errCode;
	/**错误信息**/
	private String errMsg;
	/**错误码对应的参数**/
	private Object[] args;
	public BaseException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * 支持传入code，messag和动态参数
	 * @param errCode
	 * @param errMsg
	 * @param args
	 */
	public BaseException(String errCode, String errMsg, Object[] args) {
		super();
		this.errCode = errCode;
		String message=null;
		if(!StringUtil.isEmpt(errCode)) {
			message= getMessage(errCode,args);
		}
		if(message==null) {
			message=errMsg;
		}
		this.errMsg = errMsg;
		this.args = args;
	}

	private String getMessage(String errCode, Object[] args2) {
		String errMsg= ENUM_EXCEPTION_TYPE.findStatus(errCode).getMessage();
		errMsg = String.format(errMsg, args);
		return errMsg;
	}	
}
