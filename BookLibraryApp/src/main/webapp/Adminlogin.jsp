<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test2.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Admin Dashboard</title>
    <style>
        body {
            background-color: black;
            color: green;
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 10%;
        }
        
        a {
            color: green;
            text-decoration: none;
            font-size: 24px;
            border: 2px solid green;
            padding: 10px 20px;
            margin: 10px;
            display: inline-block;
            transition: background-color 0.3s ease, color 0.3s ease;
        }
        
        a:hover {
            background-color: green;
            color: black;
        }
    </style>
</head>
<body>
    <% 
        AdminBean ab = (AdminBean) session.getAttribute("abean");
        out.println("Welcome, admin: " + ab.getFname() + "<br><br>");
    %>
    <a href="book.html">ADDBOOK</a>
    <a href="view">VIEWBOOK</a>
    <a href="logout">LOGOUT</a>
</body>
</html>
