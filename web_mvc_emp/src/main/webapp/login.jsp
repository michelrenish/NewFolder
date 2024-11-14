<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Login Page</title>
</head>
<body>
	<h3>Employee Login page</h3>
	<form:form action="save" modelAttribute="employee">
	
	<form:label path="name">Name</form:label>
	<form:input path="name" type="text" placeholder="Enter the Name"/>
	
	<form:label path="salary">Salary</form:label>
	<form:input path="salary" type="text" placeholder="Enter the Salary"/>
	
	<form:label path="posting">Posting</form:label>
	<form:input path="posting" type="text" placeholder="Enter the Desgination"/>
	
	<form:label path="location">Location</form:label>
	<form:input path="location" type="text" placeholder="Enter the location"/>
	
	<input type="submit" value="login">
	</form:form>
</body>
</html>