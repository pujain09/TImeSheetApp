package com.sample.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sample.dao.*;
import com.sample.dto.*;

public class ProjectNameService implements InterfaceService {
	
	public void getService(HttpServletRequest request, HttpServletResponse response) {
		
		ProjectListDAO dao = new ProjectListDAO();
		HttpSession session = request.getSession();
		int userid = (Integer) session.getAttribute("userid");
		
		try{
			List<GetProjectDTO> list = dao.getAllProject();
			request.setAttribute("ProjectName", list);
			request.getRequestDispatcher("submitTS1.jsp").forward(request, response);
		}catch (ServletException e1) {
				e1.printStackTrace();
		} catch (IOException e1) {
				e1.printStackTrace();
			}
				
				
	}
}
