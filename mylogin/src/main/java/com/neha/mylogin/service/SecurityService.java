package com.neha.mylogin.service;

public interface SecurityService {
	
	String findLoggedInUserName();
	
	public void autoLogin(String userName,String password);

}
