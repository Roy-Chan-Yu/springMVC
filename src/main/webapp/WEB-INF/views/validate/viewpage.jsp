<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color:red
}
</style>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<form:form action="sumitEmp" modelAttribute="emp">
Username: <form:input path="name"/><br />
Password(*): <form:password path="password"/> 
<form:errors path="password" cssClass="error"></form:errors> <br />
Mail: <form:input path="email"/> <br />
<form:errors path="email" cssClass="error"> </form:errors>
<input type="submit" value="submit">
</form:form>
</body>
</html>