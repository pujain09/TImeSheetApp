package com.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.dto.*;
import com.sample.util.DBConnectionUtil;

public class ViewTaskDescDAO {
	
	 //Returns a list of all Task Worked by the User
	public List getTaskinfo(int id) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List list = null;
		String query = "SELECT * FROM TASKDESC where USERID=?";
		
		try {
			list = new ArrayList<GetTaskDescDTO>();
			conn = DBConnectionUtil.getConnection();
			st = conn.prepareStatement(query);
			st.setInt(1, id);
			rs = st.executeQuery();
			
			while (rs.next()) {
				GetTaskDescDTO dto = new GetTaskDescDTO();
				dto.setTask_info(rs.getString("TASKINFO"));
				dto.setTime_worked(rs.getDouble("TIMEWORKED"));
				dto.setWeek_end(rs.getString("WEEKEND"));
				dto.setUser_id(rs.getInt("USERID"));
				dto.setProject_id(rs.getInt("PROJECTID"));
				dto.setTsid(rs.getString("TSID"));

				list.add(dto);}
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
		} catch (SQLException ex) {
				ex.getStackTrace();}}
		
	return list;
}

}

