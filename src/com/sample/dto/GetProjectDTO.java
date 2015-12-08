package com.sample.dto;

import java.io.Serializable;

public class GetProjectDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String project_info = "";
	private int user_id = 0;
	private int project_id = 0;
	
	public String getProject_info() {
		return project_info;
	}
	public void setProject_info(String project_info) {
		this.project_info = project_info;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getProjectid() {
		return project_id;
	}
	public void setProjectid(int projectid) {
		this.project_id = projectid;
	}
}