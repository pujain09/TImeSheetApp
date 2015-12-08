<%@page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="com.sample.dto.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View TimeSHeetID</title>
</head>
<body>
<form action="view.do" method="post">
	
	<table cellspacing="2" cellpadding="2" border="0">
	<tr><td align="center">Your TimeSHeets As of TOday</td>
	<td><select name="viewtsid">
	<option selected="selected">[Choose TimeSheet Id]</option>
	
		<%
			List<GetTaskDescDTO> list = (List<GetTaskDescDTO>)request.getAttribute("user");
			Iterator<GetTaskDescDTO> ite = list.iterator();
			while (ite.hasNext()) {
				GetTaskDescDTO task = ite.next();
		%>
	
	<option  value="<%=task.getTsid()%>"><%=task.getTsid()%>  WeekEnding: <%=task.getWeek_end()%></option>
		
		<%
			}
		%> 
	
	</select></td></tr></table>
		
	<input align="left" type="submit" value="Show TimeSheet">

</form>
</body>
</html>