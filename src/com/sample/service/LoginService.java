package com.sample.service;

import java.io.IOException;

import com.sample.dao.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginService implements InterfaceService {

	public void getService(HttpServletRequest request, HttpServletResponse response) {
			
			LoginDAO dao = new LoginDAO();
			String value = request.getParameter("role");
			System.out.println(value);
			String userName = request.getParameter("UserName");
			String password = request.getParameter("Password");
			
			HttpSession session = request.getSession();
			int user_ID = dao.get_userID(userName);
			session.setAttribute("userid",userName);
			
			String userFName = dao.getUserName(user_ID);
			String userLName = dao.getUserLName(user_ID);
			
			System.out.println(" user name= " + userName);
			System.out.println(" password= " + password);
			
			try {
				if (dao.validation(userName.trim(),password.trim(), value)){
					request.setAttribute("fName", userFName);
					request.setAttribute("lName", userLName);
					request.setAttribute("Position", value);
					
					if (value.equals("Employee")){
						request.getRequestDispatcher("employeeHome.jsp").forward(request,
							response);}
					else if (value.equals("Manager")){
						request.getRequestDispatcher("managerHome.jsp").forward(request,
								response);
					}
				} else
					request.getRequestDispatcher("error.jsp").forward(request,response);
			} catch (ServletException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	}

}
