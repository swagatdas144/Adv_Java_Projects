<%@page import="test1.StudentBEAN"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f8d7da;
        color: #721c24;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
    }
    .container {
        background-color: #f5c6cb;
        border: 1px solid #f5c6cb;
        border-radius: 10px;
        padding: 20px;
        text-align: center;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    }
    h1 {
        color: #721c24;
        margin-bottom: 20px;
    }
    .student-info {
        margin: 20px 0;
    }
    .student-info span {
        display: inline-block;
        margin: 0 10px;
    }
    .links {
        margin-top: 20px;
    }
    .links a {
        text-decoration: none;
        color: #ffffff;
        background-color: #c82333;
        padding: 10px 20px;
        border-radius: 5px;
        transition: background-color 0.3s;
    }
    .links a:hover {
        background-color: #a71d2a;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Welcome to the Student Page</h1>
        <%
            String Sname = (String) request.getAttribute("name");
            StudentBEAN sb = (StudentBEAN) application.getAttribute("sbean");
        %>
        <p>Page belongs to: <strong><%= Sname %></strong></p>
        <div class="student-info">
            <span>Name: <%= sb.getsdname() %></span>
            <span>Phone: <%= sb.getsdphno() %></span>
            <span>Email: <%= sb.getsdmid() %></span>
        </div>
        <div class="links">
            <a href="edit">Edit</a>
            <a href="logout">Logout</a>
        </div>
    </div>
</body>
</html>
