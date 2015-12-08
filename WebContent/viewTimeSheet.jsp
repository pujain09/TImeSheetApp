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
			<th bgcolor="red">TimeSheet ID</th>
			<th bgcolor="red">Monday</th>
			<th bgcolor="red">Tuesday</th>
			<th bgcolor="red">Wednesday</th>
			<th bgcolor="red">Thursday</th>
			<th bgcolor="red">Friday</th>
		</tr>

		<%
			
			List<GetWeekDTO> list = (List<GetWeekDTO>)request.getAttribute("weeks");
			Iterator<GetWeekDTO> ite = list.iterator();
			while (ite.hasNext()) {
				GetWeekDTO task = ite.next();
			
		%>
		

		<tr>
			<td align="center" bgcolor="red"><%=task.getTsid()%></td>
			<td align="center" bgcolor="red"><%=task.getMon()%></td>
			<td align="center" bgcolor="red"><%=task.getTues()%></td>
			<td align="center" bgcolor="red"><%=task.getWed()%></td>
			<td align="center" bgcolor="red"><%=task.getThurs()%></td>
			<td align="center" bgcolor="red"><%=task.getFri()%></td>
		</tr>
		
		<%} %>
		
		


	</table>
	
	<form action="ok.do" method="post">
		<input align="left" type="submit" value="Approve this TimeSheet">
		</form>
		<br>

<br>




</body>
</html>