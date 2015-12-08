package com.sample.dto;

import java.io.Serializable;
import java.sql.Date;

public class GetWeekDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String tsid = "";
	private double mon = 0.0;
	private double tues = 0.0;
	private double wed = 0.0;
	private double thurs = 0.0;
	private double fri = 0.0;
	
	public String getTsid() {
		return tsid;
	}
	public void setTsid(String tsid) {
		this.tsid = tsid;
	}
	public double getMon() {
		return mon;
	}
	public void setMon(double mon) {
		this.mon = mon;
	}
	public double getTues() {
		return tues;
	}
	public void setTues(double tues) {
		this.tues = tues;
	}
	public double getWed() {
		return wed;
	}
	public void setWed(double wed) {
		this.wed = wed;
	}
	public double getThurs() {
		return thurs;
	}
	public void setThurs(double thurs) {
		this.thurs = thurs;
	}
	public double getFri() {
		return fri;
	}
	public void setFri(double fri) {
		this.fri = fri;
	}
}
	
	