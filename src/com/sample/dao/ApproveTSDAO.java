package com.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.dto.GetTaskDescDTO;
import com.sample.util.DBConnectionUtil;


public class ApproveTSDAO {
	
	 //Returns a List of TimeSheet that Employees have submitted 
	public List<GetTaskDescDTO> getTS(int id) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List<GetTaskDescDTO> dto = null;
		String query = "SELECT * FROM TASKDESC where PROJECTID=?";
		
		try {
			dto = new ArrayList<GetTaskDescDTO>();
			conn = DBConnectionUtil.getConnection();
			st = conn.prepareStatement(query);
			st.setInt(1, id);
			rs = st.executeQuery();
			rs = st.getResultSet();
			
			while (rs.next()) {
				GetTaskDescDTO instance = new GetTaskDescDTO();
				instance.setTask_info(rs.getString("TASKINFO"));
				instance.setTime_worked(rs.getDouble("TIMEWORKED"));
				instance.setWeek_end(rs.getString("WEEKEND"));
				instance.setUser_id(rs.getInt("USERID"));
				instance.setProject_id(rs.getInt("PROJECTID"));
				instance.setTsid(rs.getString("TSID"));

				dto.add(instance);
			}} catch (SQLException ex) {
						ex.getStackTrace();
			} finally {
				try {
					if(rs != null){
						rs.close();}
					if (st != null){
						st.close();}
					if (conn != null){
						conn.close();}
				} catch (SQLException ex) {
						ex.getStackTrace();}}
		
			return dto;
}
	}

