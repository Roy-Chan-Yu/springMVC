<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<p>Your reservation is confirmed successfully...</p>
	<p>Please re-check the details</p>
	First Name : ${reservation.firstName } <br />
	Last Name : ${reservation.lastName } <br />
	Gender : ${reservation.Gender } 
</body>
</html>