package com.sample.service;

import java.io.IOException;
import java.util.List;
import com.sample.dto.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.dao.*;

public class PopulateTService implements InterfaceService {

	public void getService(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ApproveTSDAO dao = new ApproveTSDAO();
		String projectID = request.getParameter("project_Name");

		try{
			int p_id = Integer.parseInt(projectID);
			List<GetTaskDescDTO> list = dao.getTS(p_id);
			if (list != null){
				request.setAttribute("TimeSheet", list);
				request.getRequestDispatcher("viewApproveTS.jsp").forward(request, response);}
			else
				request.getRequestDispatcher("errorApproveTS.jsp").forward(request, response);
		}catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			
			
		}


	}