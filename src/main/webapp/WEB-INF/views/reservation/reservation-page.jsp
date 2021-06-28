<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Form</title>
</head>
<body>
<!--
<form:form action="submitForm" modelAttribute="reservation">
	FirstName: <form:input path="firstName" /> <br />
	LastName: <form:input path="lastName" /> <br/>
	<input type="submit" value="送交" />
</form:form>
--------------------------------------
<br />

-->

<form:form action="submitForm1" modelAttribute="reservation">
	FirstName: <form:input path="firstName"/> <br />
	LastName: <form:input path="lastName" type="password" /> <br />
	<p>Gender:
	Male<form:radiobutton path="Gender" value="Male" required="required" />
	Female <form:radiobutton path="Gender" value="Female" />
	</p> <br />
	Meals: 
	BreakFast<form:checkbox path="checkItems" value= "BreakFast" />
	Lunch<form:checkbox path="checkItems" value= "Lunch" />
	Dinner<form:checkbox path="checkItems" value= "Dinner"/>
	<br />
	Going : <form:select path="cityTo">
		<form:option value="高雄" label="高雄"></form:option>
		<form:option value="台中" label="台中"></form:option>
		<form:option value="台北" label="台北"></form:option>
	
	</form:select>
	
	<input type="submit" value="送交" />
</form:form>

</body>
</html>