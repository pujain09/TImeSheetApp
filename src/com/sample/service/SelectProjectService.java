package com.sample.service;

import java.io.IOException;
import com.sample.dao.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SelectProjectService implements InterfaceService {
	
	public void getService(HttpServletRequest request, HttpServletResponse response) {
		
		ProjectListDAO dao = new ProjectListDAO();
		String value = request.getParameter("project_Name");
		int project_id = Integer.parseInt(value);
		
		String p_Name = dao.getProjectName(project_id);
		
		try {
			request.setAttribute("ProjectID", project_id);
			request.setAttribute("ProjectName", p_Name);
			request.getRequestDispatcher("submitTS2.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
