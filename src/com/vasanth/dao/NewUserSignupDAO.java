package com.vasanth.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewUserSignupDAO {

	UserVerificationDAO userVerify = new UserVerificationDAO();

	public boolean verifyCredentials(String uname, String pass) {
		return userVerify.verifyNewUser(uname, pass);

	}

	public boolean createNewUser(String uname, String pass) {
		boolean result = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "hbstudent", "hbstudent");
			PreparedStatement pst = con.prepareStatement("insert into user values (?,?)");
			pst.setString(1, uname);
			pst.setString(2, pass);
			System.out.println(uname);
			System.out.println(pass);
			int n = pst.executeUpdate();
			con.close();
			pst.close();
			if (n == 1)
				return true;
			return result;
		} catch (Exception e) {
			return result;
		}
	}

}
