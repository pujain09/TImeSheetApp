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
<form action="approved.do" method="post">
	
	<table cellspacing="2" cellpadding="2" border="0">
	<tr><td align="center">Available TimeSheet to Approve</td>
	<td><select name="tsid">
	<option selected="selected">[Choose TimeSheet to Approve]</option>
	
		<%
			List<GetTaskDescDTO> list = (List<GetTaskDescDTO>)request.getAttribute("TimeSheet");
			Iterator<GetTaskDescDTO> ite = list.iterator();
			while (ite.hasNext()) {
				GetTaskDescDTO task = ite.next();
		%>
	
	<option  value="<%=task.getTsid()%>"><%=task.getTsid()%></option>
		
		<%
			}
		%> 
	
	</select></td></tr></table>
		
	<input align="left" type="submit" value="View TimeSheet">

</form>
</body>
</html>