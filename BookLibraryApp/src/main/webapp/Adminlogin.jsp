<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test2.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("welcome admin:"+ab.getFname());

%>
<a href="book.html">ADDBOOK</a>
<a href="view">VIEWBOOK</a>
<a href="logout">LOGOUT</a>
</body>
</html>