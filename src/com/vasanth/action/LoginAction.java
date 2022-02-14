package com.vasanth.action;

import org.apache.commons.lang3.StringUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.vasanth.service.UserDatabaseService;

public class LoginAction extends ActionSupport{
	
	UserDatabaseService userDB=new UserDatabaseService();
	
	private String uname;
	private String pass;
	
	public String execute()
	{
		if(userDB.existingUserVerification(uname, pass))
		{
			return SUCCESS;
		}
		else
			return INPUT;
	}
	
	public void validate() {
		if(StringUtils.isEmpty(uname))
			addFieldError("uname", "Username cannot be empty.");
		if(StringUtils.isEmpty(pass))
			addFieldError("pass", "Password cannot be empty.");
		
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
