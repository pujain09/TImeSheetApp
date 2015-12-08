<%@page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="com.sample.dto.*"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project SELECTION</title>

<body>
<form action="selectProject.do" method="post">
	Please Select the PROJECT You are working on<br> 
	
	<table cellspacing="2" cellpadding="2" border="0">
	<tr><td align="center">Project Name</td>
	<td><select name="project_Name">
	<option selected="selected">[Choose a Project Name]</option>
	
		<%
			List<GetProjectDTO> list = (List<GetProjectDTO>)request.getAttribute("ProjectName");
			Iterator<GetProjectDTO> ite = list.iterator();
			while (ite.hasNext()) {
						GetProjectDTO task = ite.next();
		%>
	
	<option  value="<%=task.getProjectid()%>"><%=task.getProject_info()%></option>
		
		<%
			}
		%> 
	
	</select></td></tr></table>
		
	<input align="left" type="submit" value="Click to Enter Hours">

</form>
</body>
</html>



	