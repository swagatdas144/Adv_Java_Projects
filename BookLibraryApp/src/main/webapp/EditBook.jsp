<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="test2.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
BookBean bb=(BookBean)request.getAttribute("bbean");

%>
<form action="update">
<input type="hidden" name="bcode" value=<%=bb.getCode() %>>
BookPrice:<input type="text" name="bprice" value=<%=bb.getPrice() %>><br>
BookQunty:<input type="text" name="bqty" value=<%=bb.getQty() %>><br>
<input type="submit" value="updateBook">
</form>
</body>
</html>