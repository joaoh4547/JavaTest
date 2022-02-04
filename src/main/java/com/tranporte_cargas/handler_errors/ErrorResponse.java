package com.tranporte_cargas.handler_errors;

import java.util.Date;

public class ErrorResponse {
	
	private Object errorInfo;
	private Date moment = new Date(System.currentTimeMillis());
	private String path;
	
	public ErrorResponse(String path,Object data) {
		this.errorInfo = data;
		this.setPath(path);
	}

	public Object getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(Object data) {
		this.errorInfo = data;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
