<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<form action="subTS.do" method="post">
	<h2>Submit Time Sheet</h2>
	 ProjectName: <% out.println(request.getAttribute("ProjectName"));%> <br>
     Your Project ID: <% out.println(request.getAttribute("ProjectID"));%><br>
	<input type = "hidden" name ="id" value = "<%=request.getAttribute("ProjectID")%>">
	
	<p>Enter the details below.</p>
	<ul><li id="li_1"><label class="description" >Tasks
	</label><table cellspacing="2" cellpadding="2" border="0">
	<tr><td align="center">Task Description</td>
		<td><select name="task">
		
		<option selected="selected">[Choose a Task]</option>
		<option value="Training">Training</option>
		<option value="Study">Study</option>
		<option value="Planning">Planning</option>
		<option value="Designing">Designing</option>
		<option value="Coding">Coding</option>
		<option value="Integration">Integration</option>
		<option value="Testing">Testing</option>
					
	</select></table><br></li>
			
	
				
	<li id="li_2"><label class="description">TIMESHEET ID (AnyName U like - fit1, jain1))
	</label><div>
		<input type="text" name="tsid"></div><br></li>
			
	<li id="li_3"><label class="description">Week Ending(MM/DD/YYYY)
	</label><div>
		<input type="text" name="weekending"></div><br></li> 


	<li class="buttons"> Hours You Worked everyday for this Task
	<table><tr>
		<td>Mon:<br><input type="text" name="mon" size="4"><br></td>
		<td>Tue:<br><input type="text" name="tues" size="4"><br>  </td>
		<td>Wed:<br><input type="text" name="wed" size="4"><br> </td>
		<td>Thur:<br><input type="text" name="thurs" size="4"><br> </td>
		<td>Fri:<br><input type="text" name="fri" size="4"><br></td>
	</tr></table></ul>
			
		<input align="left" type="submit" value="Submit TimeSheet">                       

</form>
</body>
</html>



