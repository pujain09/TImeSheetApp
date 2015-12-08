package com.sample.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.dao.ViewWeekDAO;

public class ViewWeekService implements InterfaceService  {
	
	public void getService(HttpServletRequest request, HttpServletResponse response) {
		
		ViewWeekDAO dao = new ViewWeekDAO();
		String value = request.getParameter("viewtsid");
		System.out.println("tsid" +value);
		
		List list = dao.getWeek(value);
		
		try {
			request.setAttribute("week", list);
			request.getRequestDispatcher("viewTS2.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
