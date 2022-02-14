package com.vasanth.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserVerificationDAO {

	public boolean verifyExistingUser(String uname, String pass) {
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "hbstudent", "hbstudent");
			PreparedStatement pst = con.prepareStatement("select * from user where uname=?");
			pst.setString(1, uname);
			ResultSet rs = pst.executeQuery();
			result = (rs.next()) ? (rs.getString(2).equals(pass)) ? true : false : false;
			con.close();
			pst.close();
			return result;
		} catch (Exception e) {
			return result;
		}
	}

	public boolean verifyNewUser(String uname, String pass) {
		PreparedStatement pst = null;
		boolean result = false;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "hbstudent", "hbstudent");
			pst = con.prepareStatement("select * from user where uname=?");
			pst.setString(1, uname);
			ResultSet rs = pst.executeQuery();
			result = (rs.next()) ? true : false;
			con.close();
			pst.close();
			return result;
		} catch (Exception e) {
			return result;
		} 
	}

}
