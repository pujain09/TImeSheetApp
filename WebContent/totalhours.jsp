<%@page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="com.sample.dto.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=2>

<tr>
			<th bgcolor="red">TimeSheetID</th>
			<th bgcolor="red">ProjectID</th>
			<th bgcolor="red">Task Description</th>
			<th bgcolor="red">TimeWorked</th>
			<th bgcolor="red">Week Ending</th>
		</tr>
<%
	List<GetTaskDescDTO> list = (List<GetTaskDescDTO>)request.getAttribute("Total");
	Iterator<GetTaskDescDTO> ite = list.iterator();
	while (ite.hasNext()) {
		GetTaskDescDTO task = ite.next();
%>
		<tr>
			<td align="center" bgcolor="red"><%=task.getTsid()%></td>
			<td align="center" bgcolor="red"><%=task.getProject_id()%></td>
			<td align="center" bgcolor="red"><%=task.getTask_info()%></td>
			<td align="center" bgcolor="red"><%=task.getTime_worked()%></td>
			<td align="center" bgcolor="red"><%=task.getWeek_end()%></td>
		</tr>
		
		<% } %>
		
		
		


	</table>

	



</body>
</html>
