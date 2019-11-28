package com.mslife.app.dto.base.res;

import java.io.Serializable;
/**
 * 
 * @author 蚂蚁
 *
 */
public class BaseBodyRes implements Serializable{

	private static final long serialVersionUID = -3946786882970602266L;
	/**返回报错提示节点**/
	private Status status;
	/**返回的数据**/
	private Object data;
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "BaseBodyRes [status=" + status + ", data=" + data + "]";
	}
	
}
