package com.sample.service;

import java.io.IOException;

import com.sample.dao.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterService implements InterfaceService {
	
	public void getService(HttpServletRequest request, HttpServletResponse response) {
		
		RegisterDAO dao = new RegisterDAO();
		String value = request.getParameter("role");
		System.out.println(value);
		String userN = request.getParameter("UserName");
		String userP = request.getParameter("Password");
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		System.out.println("User Information: "+userN+" "+ userP+" "+fName);

		try{
		boolean status =  dao.registerUser(userN, userP, fName,lName, value);
		request.setAttribute("status", status);
		if (status){
			request.getRequestDispatcher("userEntered.jsp").forward(request,response);
		}
		}catch (ServletException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
			
		}
	}
