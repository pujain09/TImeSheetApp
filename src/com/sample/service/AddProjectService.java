package com.sample.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sample.dao.*;

public class AddProjectService implements InterfaceService {

	public void getService(HttpServletRequest request, HttpServletResponse response) {
		
		AddProjectDAO dao = new AddProjectDAO();
		String projectN = request.getParameter("projectNAME");
		
		HttpSession session = request.getSession();
		int userid = (Integer) session.getAttribute("userid");
		
		System.out.println("User Information: "+projectN+" "+ userid);

		try{
			boolean status =  dao.addProject(projectN,userid);
			
			request.setAttribute("status", status);
			
			if (status){
				System.out.println("In AddProjectService..Project Added");
				request.getRequestDispatcher("timeSheetEntered.jsp").forward(request,response);}
			else
				request.getRequestDispatcher("error.jsp").forward(request,response);
		}catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();}
	}
}