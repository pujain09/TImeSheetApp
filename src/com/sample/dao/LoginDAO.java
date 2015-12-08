package com.sample.dao;

import java.sql.*;

import com.sample.util.*;

public class LoginDAO {
	
	//Validates whether the login fields matches Employee_list Database
		public boolean validation(String user, String pass, String role) {
			boolean status = false;
			Connection conn = null;
			PreparedStatement st = null;
			ResultSet rs = null;
			String query = "SELECT USERID,USERNAME,USERKEY,POSITION FROM EMPLOYEE_LIST where username=?";
			
			try {
				conn = DBConnectionUtil.getConnection();
				st = conn.prepareStatement(query);
				st.setString(1, user);
				rs = st.executeQuery();
				while (rs.next()) {
					String userN = rs.getString("USERNAME");
					String passW = rs.getString("USERKEY");
					String roleM = rs.getString("POSITION");
					if (userN.equals(user) && passW.equals(pass) && roleM.equals(role)) {
						status = true;}}
				} catch (SQLException e) {
					System.out.println("Error: " + e.getMessage());
				} finally {
					  try {
						if(rs != null){
							rs.close();}
						if (st != null){
							st.close();}
						if (conn != null){
							conn.close();}
				}catch (SQLException e) {
					e.printStackTrace();}}
			
			return status;

		}

	
	 //gets only the userID from EmPloyee_list table which matches the username
	public int get_userID(String user){
		int userID = 0;
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String query = "SELECT USERID FROM EMPLOYEE_LIST where username=?";
		
		try {
			conn = DBConnectionUtil.getConnection();
			st = conn.prepareStatement(query);
			st.setString(1, user);
			rs = st.executeQuery();
			while (rs.next()) {
				userID = rs.getInt("USERID");}
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			  try {
				 if(rs != null){
					 rs.close();}
				 if (st != null){
					 st.close();}
				 if (conn != null){
						conn.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}}
		
		return userID;
}
	
	public String getUserName(int user_id){
		String userFName = "";
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String query = "SELECT FNAME FROM EMPLOYEE_LIST where USERID=?";
		
		try {
			conn = DBConnectionUtil.getConnection();
			st = conn.prepareStatement(query);
			st.setInt(1, user_id);
			rs = st.executeQuery();
			while (rs.next()) {
				userFName = rs.getString("FNAME");}
			} catch (SQLException e) {
				System.out.println("Error: " + e.getMessage());
			} finally {
				  try {
					if(rs != null){
						rs.close();}
					if (st != null){
						st.close();}
					if (conn != null){
						conn.close();}
				  	} catch (SQLException e) {
				  			e.printStackTrace();}
				  }
		return userFName;
}
	
	public String getUserLName(int user_id){
		String userLName = "";
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String query = "SELECT LNAME FROM EMPLOYEE_LIST where USERID=?";
		
		try {
			conn = DBConnectionUtil.getConnection();
			st = conn.prepareStatement(query);
			st.setInt(1, user_id);
			rs = st.executeQuery();
			while (rs.next()) {
				userLName = rs.getString("LNAME");}
			} catch (SQLException e) {
				System.out.println("Error: " + e.getMessage());
			} finally {
				  try {
					if(rs != null){
						rs.close();}
					if (st != null){
						st.close();}
					if (conn != null){
						conn.close();}
				  	} catch (SQLException e) {
				  			e.printStackTrace();}
				  }
		return userLName;
}
	

	
	 }