package com.mb.EmpMangApp.model;

public class TokenInfo {
	
private String msg;
private String token;

public TokenInfo(String msg, String token) {
	this.msg = msg;
	this.token = token;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public String getToken() {
	return token;
}

public void setToken(String token) {
	this.token = token;
}


}
