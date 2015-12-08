package com.sample.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sample.dao.*;
import com.sample.dto.GetTaskDescDTO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ViewTService implements InterfaceService  {
	
	public void getService(HttpServletRequest request, HttpServletResponse response) {
	
		ViewTaskDescDAO dao = new ViewTaskDescDAO();
		HttpSession session = request.getSession();
		int userid = (Integer) session.getAttribute("userid");

		try{
		List<GetTaskDescDTO> list = dao.getTaskinfo(userid);
		request.setAttribute("user", list);
		request.getRequestDispatcher("viewTS1.jsp").forward(request, response);
		
		}catch (ServletException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
			
		}


	}