package com.mb.EmpMangApp.model;

import java.util.Date;

import lombok.Data;


public class ErrorInfo {

	private Integer code;
	private String msg;
	private Date date;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ErrorInfo [code=" + code + ", msg=" + msg + ", date=" + date + "]";
	}
	
	
	
}
