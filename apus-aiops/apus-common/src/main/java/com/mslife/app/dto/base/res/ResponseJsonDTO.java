package com.mslife.app.dto.base.res;

import java.io.Serializable;
/**
 * 报文返回封装类
 * @author 蚂蚁
 *
 */
public class ResponseJsonDTO extends BaseBodyRes  implements Serializable{

	private static final long serialVersionUID = 6378625538961983157L;
	/**报文体信息**/
	private BaseBodyRes body;
	public BaseBodyRes getBody() {
		return body;
	}
	public void setBody(BaseBodyRes body) {
		this.body = body;
	}
	public static ResponseJsonDTO SUCC(BaseBodyRes body) {
		ResponseJsonDTO res=new ResponseJsonDTO();
		BaseBodyRes baseRes=new BaseBodyRes();
		body.setStatus(Status.succ());
		res.setBody(body);
		return res;	
	}
	
    public static ResponseJsonDTO succData(Object data) {
    	ResponseJsonDTO res = new ResponseJsonDTO();
    	BaseBodyRes resBody = new BaseBodyRes();
        resBody.setData(data);
        resBody.setStatus(Status.succ());
        res.setBody(resBody);
        return res;
    }
	public static ResponseJsonDTO fail(BaseBodyRes body) {
		ResponseJsonDTO res=new ResponseJsonDTO();
		BaseBodyRes baseRes=new BaseBodyRes();
		body.setStatus(Status.fail());
		res.setBody(body);
		return res;
	}
	public static  ResponseJsonDTO fail(String statusCode, String statusMessage) {
		Status status=new Status();
		status.setStatusCode(statusCode);
		status.setStatusMessage(statusMessage);
		return ResponseJsonDTO.fail(status);
	}

	public static ResponseJsonDTO fail(Status status) {
		ResponseJsonDTO resp = new ResponseJsonDTO();
		BaseBodyRes respBody = new BaseBodyRes();
		respBody.setStatus(status);
		resp.setBody(respBody);
		return resp;
	}
}
