package com.sample.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sample.dao.*;
import com.sample.dto.*;

public class ViewTotalService implements InterfaceService {
	
	public void getService(HttpServletRequest request, HttpServletResponse response) {
		
		ViewTaskDescDAO dao = new ViewTaskDescDAO();
		HttpSession session = request.getSession();
		int userid = (Integer) session.getAttribute("userid");
		
		try{
			List<ViewTaskDescDAO> list = dao.getTaskinfo(userid);
			
			request.setAttribute("Total", list);
			request.getRequestDispatcher("totalhours.jsp").forward(request, response);
			
			}catch (ServletException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
			
	}
}
