package com.sample.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sample.dao.*;

public class AddTService implements InterfaceService {
	
	public void getService(HttpServletRequest request, HttpServletResponse response) {
		
		SubmitTSDAO dao = new SubmitTSDAO();
		
		HttpSession session = request.getSession();
		int userid = (Integer) session.getAttribute("userid");
		System.out.println("Your CURRENT USER ID ------>" +userid);
		
		String taskinfo= request.getParameter("task");
		System.out.println("YOUR TASK IS ..." +taskinfo);
		
		String pid = (String)request.getParameter("id");
		System.out.println("Ok the PROJECT ID ..." +pid);
		int projectid = Integer.parseInt(pid);
		
		String tsid = request.getParameter("tsid");

		String week_end = request.getParameter("weekending");
		
		String m = request.getParameter("mon");
		double mon = Double.parseDouble(m);
		
		String t = request.getParameter("tues");
		double tues =  Double.parseDouble(t);
		
		String w = request.getParameter("wed");
		double wed = Double.parseDouble(w);
		
		String th = request.getParameter("thurs");
		double thurs = Double.parseDouble(th);
		
		String f = request.getParameter("fri");
		double fri = Double.parseDouble(f);
		
		try{
			double totalhrs = (mon+ tues + wed + thurs + fri);
			System.out.println("Your total hrs is " +totalhrs);
		
			boolean validate = dao.subTimeSheet(taskinfo, totalhrs, week_end, userid, projectid, tsid);
			boolean validate1 = dao.submit_week(tsid,mon,tues,wed,thurs,fri);
		
			if (validate && validate1){
				System.out.println("/nIn AddTService...TIMESHEET ENTRY Successful");
				request.getRequestDispatcher("timeSheetEntered.jsp").forward(request,response);}
			else
				request.getRequestDispatcher("error.jsp").forward(request,response);} 
		catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}