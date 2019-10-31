package com.GitTests;


import org.testng.annotations.Test;

import com.GitPages.LoginPage;

public class LoginFunctionality {

@Test
	public  void logintest() 
	{
		
		LoginPage lpage = new LoginPage(null);
		
		lpage.login();
		
	}




}
