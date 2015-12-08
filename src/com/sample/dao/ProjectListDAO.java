package com.sample.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.sample.dto.*;
import com.sample.util.DBConnectionUtil;

public class ProjectListDAO {
	
	 //Returns a List of all the Projects Entered by Managers
	public List getProject(int user_id) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List list = null;
		String query = "SELECT * FROM PROJECT where USERID = ?";
		
		try {
			list = new ArrayList<GetProjectDTO>();
			conn = DBConnectionUtil.getConnection();
			st = conn.prepareStatement(query);
			st.setInt(1, user_id);
			rs = st.executeQuery();
			
			while (rs.next()) {
				GetProjectDTO dto = new GetProjectDTO();
				dto.setUser_id(rs.getInt("USERID"));
				dto.setProjectid(rs.getInt("PROJECTID"));
				dto.setProject_info(rs.getString("PROJECTNAME"));
				
				list.add(dto);
				}
		} catch (SQLException ex) {
			ex.getStackTrace();
		} finally {
			try {
				if(rs != null){
					rs.close();}
				if (st != null){
					st.close();}
				if (conn != null){
					conn.close();}
		}catch (SQLException ex) {
				ex.getStackTrace();}}
		
	return list;
}
	public List getAllProject() {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List list = null;
		String query = "SELECT * FROM PROJECT";
		
		try {
			list = new ArrayList<GetProjectDTO>();
			conn = DBConnectionUtil.getConnection();
			st = conn.prepareStatement(query);
			rs = st.executeQuery();
			
			while (rs.next()) {
				GetProjectDTO dto = new GetProjectDTO();
				dto.setUser_id(rs.getInt("USERID"));
				dto.setProjectid(rs.getInt("PROJECTID"));
				dto.setProject_info(rs.getString("PROJECTNAME"));
				
				list.add(dto);
				}
		} catch (SQLException ex) {
			ex.getStackTrace();
		} finally {
			try {
				if(rs != null){
					rs.close();}
				if (st != null){
					st.close();}
				if (conn != null){
					conn.close();}
		}catch (SQLException ex) {
				ex.getStackTrace();}}
		
	return list;
}
	
	
	 //gets the Project Name from Project Table which matches the selected ProjectId 
	public String getProjectName(int project_id){
		String p_Name = "";
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String query = "SELECT PROJECTNAME FROM PROJECT where PROJECTID=?";
		
		try {
			conn = DBConnectionUtil.getConnection();
			st = conn.prepareStatement(query);
			st.setInt(1, project_id);
			rs = st.executeQuery();
			while (rs.next()) {
				p_Name = rs.getString("PROJECTNAME");}
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
		return p_Name;
}
	
	
}
	