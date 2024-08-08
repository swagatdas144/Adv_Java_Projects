<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String cid=request.getParameter("id");
String cname=request.getParameter("nm");
String ccty=request.getParameter("cty");
String cmid=request.getParameter("mid");
long ph=Long.parseLong(request.getParameter("phn"));
out.println("CUSTOMER DETAILS"+"<br>");
out.println("customer id:"+cid+"<br>");
out.println("customer name:"+cname+"<br>");
out.println("customer city:"+ccty+"<br>");
out.println("customer mailid:"+cmid+"<br>");
out.println("customer phone no:"+ph+"<br>");
%>
</body>
</html>