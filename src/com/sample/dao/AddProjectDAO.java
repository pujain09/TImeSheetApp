package com.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sample.util.DBConnectionUtil;

public class AddProjectDAO {
	
	 //Adds ProjectName and UserID into Oracle table Hr.Project(ProjectID has auto increment)
	public boolean addProject(String projectName, int uid) {
			boolean status = false;
			Connection conn = null;
			PreparedStatement st = null;
			String query = "Insert into PROJECT(USERID, PROJECTNAME) values(?,?)";
			
			try {
				conn = DBConnectionUtil.getConnection();
				st = conn.prepareStatement(query);
				st.setInt(1, uid);
				st.setString(2, projectName);
				st.executeUpdate();
				status = true;
			} catch (SQLException e) {
						e.printStackTrace();}
			
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
