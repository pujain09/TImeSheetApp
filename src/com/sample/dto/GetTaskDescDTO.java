package com.sample.dto;

import java.io.Serializable;
import java.sql.Date;

public class GetTaskDescDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String task_info = "";
	private double time_worked = 0.0;
	private String week_end = "";
	private int user_id = 0;
	private int project_id = 0;
	private String tsid = "";

	public String getTask_info() {
		return task_info;
	}

	public void setTask_info(String task_info) {
		this.task_info = task_info;
	}

	public double getTime_worked() {
		return time_worked;
	}

	public void setTime_worked(double time_worked) {
		this.time_worked = time_worked;
	}

	public String getWeek_end() {
		return week_end;
	}

	public void setWeek_end(String week_end) {
		this.week_end = week_end;
	}

	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getTsid() {
		return tsid;
	}

	public void setTsid(String tsid) {
		this.tsid = tsid;
	}

	
	
}
