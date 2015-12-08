package com.sample.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.sample.util.DBConnectionUtil;

public class SubmitTSDAO {
	
	 //Enters the TimeSheet Info for Employee or Manager and return the status
	public boolean submit_week(String tsid, double m, double t, double w, double th, double f)
	{
		boolean status = false;
		Connection conn = null;
		PreparedStatement st = null;
		String query = "Insert into WEEK values(?,?,?,?,?,?)";
		
		try {
			conn = DBConnectionUtil.getConnection();
			st = conn.prepareStatement(query);
			st.setString(1, tsid);
			st.setDouble(2, m);
			st.setDouble(3, t);
			st.setDouble(4, w);
			st.setDouble(5, th);
			st.setDouble(6, f);
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
		} catch (SQLException ex) {
				ex.getStackTrace();}}
		
		return status;

	}
	
	 //Enters Task Information for Manager/Employee and returns the status
	public boolean subTimeSheet(String taskinfo, double hrs, String date, int userid, int projectid, String tsid) {
		boolean status = false;
		Connection conn = null;
		PreparedStatement st = null;
		String query = "Insert into TASKDESC values(?,?,?,?,?,?)";
		
		try {
			conn = DBConnectionUtil.getConnection();
			st = conn.prepareStatement(query);
			
			st.setString(1, taskinfo);
			st.setDouble(2, hrs);
			st.setString(3, date);
			st.setInt(4, userid);
			st.setInt(5, projectid);
			st.setString(6, tsid);
			st.executeUpdate();
			
			status = true;
			System.out.println("IN SUBMIT TIME SHEET DAOOOOOOOO.....VALUES ENTERED");

		} catch (SQLException e) {
			e.printStackTrace();}
		finally {
			try {
				if (st != null){
					st.close();}
				if (conn != null){
					conn.close();}
		} catch (SQLException ex) {
			ex.getStackTrace();}}
		
	return status;
	}
}
