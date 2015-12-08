package com.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.dto.GetWeekDTO;
import com.sample.util.DBConnectionUtil;

public class ViewWeekDAO {
	
	//Returns a list of all Weekly Hours Worked on Task 
		public List getWeek(String id) {
			Connection conn = null;
			PreparedStatement st = null;
			ResultSet rs = null;
			List list = null;
			String query = "SELECT * FROM WEEK where TSID=?";
			
			try {
				list = new ArrayList<GetWeekDTO>();
				conn = DBConnectionUtil.getConnection();
				st = conn.prepareStatement(query);
				st.setString(1, id);
				rs = st.executeQuery();
				
				while (rs.next()) {
					GetWeekDTO dto = new GetWeekDTO();
					dto.setTsid(rs.getString("TSID"));
					dto.setMon(rs.getDouble("MONDAY"));
					dto.setTues(rs.getDouble("TUESDAY"));
					dto.setWed(rs.getDouble("WEDNESDAY"));
					dto.setThurs(rs.getDouble("THURSDAY"));
					dto.setFri(rs.getDouble("FRIDAY"));
					
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
