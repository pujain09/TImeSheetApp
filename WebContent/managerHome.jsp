<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MANAGER HOME</title>
</head>
<body>

<font face="geneva" color="red" size="3">Welcome  <% out.println(session.getAttribute("userid"));%>
 <% out.println(request.getAttribute("lName"));%></font><br>
 Your Position:  <% out.println(request.getAttribute("Position"));%><br>

<h5><a href="addProject.jsp">Click to ADD a Project</a></h5>


<form action="appTimeSheet.do" method="post">
		<input align="left" type="submit" value="Approve TimeSheet">
		</form>
		<br>


<form action="PopTS.do" method="post">
		<input align="left" type="submit" value="SUBMIT TimEShEEt">
		</form>
		<br>
		
<form action="viewTotal.do" method="post">
		<input align="left" type="submit" value="VIEW TotalHOURS WoRkEd">
		</form>
		<br>	

<form action="viewTS.do" method="post">
		<input align="left" type="submit" value="VIEW TimeSHeeT">
		</form>
		<br>

<a href="logout.jsp">Logout</a>

</body>
</html>