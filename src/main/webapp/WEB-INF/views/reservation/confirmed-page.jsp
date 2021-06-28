<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
First Name : ${reservation.firstName } <br />
Last Name : ${reservation.lastName } <br />
Gender : ${reservation.gender } <br />
Meals: 
<c:forEach var="meal" items="${reservation.checkItems }">
	<b>${meal }</b>
</c:forEach>
Going to ${reservation.cityTo}  
</body>
</html>