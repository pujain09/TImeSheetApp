package com.sample.dao;

import java.sql.*;

import com.sample.util.DBConnectionUtil;

public class RegisterDAO {
	
	//Enters the Information Entered by User in the Database and returns whether the commit was successful
	public boolean registerUser(String userN, String userKey,
			String fName, String lName, String role) {
			
			boolean status = false;
			Connection conn = null;
			PreparedStatement st = null;
			String query = "Insert into EMPLOYEE_LIST(USERNAME, USERKEY, FNAME, LNAME, POSITION) values(?,?,?,?,?)";
			
			try {
				conn = DBConnectionUtil.getConnection();
				st = conn.prepareStatement(query);
				st.setString(1, userN);
				st.setString(2, userKey);
				st.setString(3, fName);
				st.setString(4, lName);
				st.setString(5, role);
				st.executeUpdate();
				
				status = true;
				System.out.println("in Register DAOOOOOOOO.....User Signed Up and READY TO GO!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if (st != null){
						st.close();}
					if (conn != null){
						conn.close();}
			}catch (SQLException ex) {
					ex.getStackTrace();}}
			
		return status;
	}
}


