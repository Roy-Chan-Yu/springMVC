<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="index.jsp"></jsp:include>
<hr />
<%@page import="com.pouchen.roy.httpInvoker.ClientInvoker" %>

<%
	int num = Integer.parseInt(request.getParameter("number"));
	out.print("cube of "+num+ " is: "+ ClientInvoker.getCube(num));
%>

</body>
</html>