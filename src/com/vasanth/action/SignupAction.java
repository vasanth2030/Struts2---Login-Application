package com.vasanth.action;

import org.apache.commons.lang3.StringUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.vasanth.service.UserDatabaseService;

public class SignupAction extends ActionSupport{
	
	UserDatabaseService userDB=new UserDatabaseService();
	
	private String uname;
	private String pass;
	private String confirmPass;
	
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
	public String getConfirmPass() {
		return confirmPass;
	}
	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}
	
	public String execute() {
		if(userDB.createNewUser(uname, pass)) 
			return SUCCESS;
		else
			return INPUT;
	}
	
	public void validate()
	{
		if(StringUtils.isEmpty(uname))
			addFieldError("uname", "Username cannot be empty.");
		if(StringUtils.isEmpty(pass))
			addFieldError("pass", "Password cannot be empty.");
		if(userDB.verifyNewUser(uname, pass))
		{
			System.out.println(uname+" "+pass);
			addFieldError("uname", "Username already exists.");
		}
		if(!pass.equals(confirmPass))
			addFieldError("confirmPass", "Re-enter password.");
			
	}

}
