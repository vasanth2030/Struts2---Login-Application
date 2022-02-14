package com.vasanth.service;

import com.vasanth.dao.NewUserSignupDAO;
import com.vasanth.dao.UserVerificationDAO;

public class UserDatabaseService {

	UserVerificationDAO userDAO = new UserVerificationDAO();

	NewUserSignupDAO newUser = new NewUserSignupDAO();

	public boolean existingUserVerification(String uname, String pass) {
		return userDAO.verifyExistingUser(uname, pass);
	}

	public boolean verifyNewUser(String uname, String pass) {
		return userDAO.verifyNewUser(uname, pass);
	}

	public boolean createNewUser(String uname, String pass) {
		if (newUser.createNewUser(uname, pass))
			return true;
		else
			return false;

	}
}
