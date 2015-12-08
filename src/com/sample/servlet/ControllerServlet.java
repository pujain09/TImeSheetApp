package com.sample.servlet;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.service.*;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		ControllerServlet servlet = new ControllerServlet();
		URL url = servlet.getClass().getClassLoader().getResource("../../login.jsp");
		System.out.println(url.getPath());
		
		InterfaceService is = null;
		System.out.println(request.getServletPath());
		String path = request.getServletPath();
		int end = path.indexOf('.');
		int start = 1;
		
		String mappinStr = path.substring(start, end);
		mappinStr=mappinStr.trim();
		System.out.println("THE SERVICE IS: " +mappinStr);
		
		if (mappinStr.equals("register"))
			is = new RegisterService();
		else if (mappinStr.equals("login"))
			is = new LoginService();
		else if (mappinStr.equals("addProject"))
			is = new AddProjectService();
		else if (mappinStr.equals("appTS"))
			is = new PopulateTService();
		else if (mappinStr.equals("approved"))
			is = new ApprovedTService();
		else if (mappinStr.equals("appTimeSheet"))
			is = new PopProjectService();
		else if (mappinStr.equals("ok"))
			is = new ApprovedService();
		else if (mappinStr.equals("PopTS"))
			is = new ProjectNameService();
		else if (mappinStr.equals("selectProject"))
			is = new SelectProjectService();
		else if (mappinStr.equals("subTS"))
			is = new AddTService();
		else if (mappinStr.equals("viewTotal"))
			is = new ViewTotalService();
		else if (mappinStr.equals("viewTS"))
			is = new ViewTService();
		else if (mappinStr.equals("view"))
			is = new ViewWeekService();
		
		
		
		is.getService(request, response);
	}
}