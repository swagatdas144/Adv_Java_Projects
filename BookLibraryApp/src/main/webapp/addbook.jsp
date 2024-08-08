<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test2.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Admin Page</title>
    <style>
        body {
            background-color: black;
            color: blue;
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 20%;
        }
        
        a {
            color: blue;
            text-decoration: none;
            font-size: 24px;
            border: 2px solid blue;
            padding: 10px 20px;
            margin: 10px;
            display: inline-block;
            transition: background-color 0.3s ease, color 0.3s ease;
        }
        
        a:hover {
            background-color: blue;
            color: black;
        }
    </style>
</head>
<body>
    <% 
        AdminBean ab = (AdminBean) session.getAttribute("abean");
        String msg = (String) request.getAttribute("msz");
        out.println("Page belongs to admin: " + ab.getFname() + "<br>");
        out.println(msg + "<br>");
    %>
    <a href="book.html">ADDBOOK</a>
    <a href="view">VIEWBOOK</a>
    <a href="logout">LOGOUT</a>
</body>
</html>
