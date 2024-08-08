<%@page import="test1.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information</title>
<style>
    body {
        background-color: #1f1f1f;
        color: #fff;
        font-family: Arial, sans-serif;
    }
    .container {
        width: 80%;
        margin: 50px auto;
        background-color: #333;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.3);
    }
    h1, h3 {
        text-align: center;
    }
    table {
        width: 100%;
        border-collapse: collapse;
        margin-top: 20px;
    }
    table, th, td {
        border: 1px solid #666;
    }
    th, td {
        padding: 10px;
        text-align: left;
    }
    th {
        background-color: #444;
    }
    td {
        background-color: #555;
    }
</style>
</head>
<body>

<div class="container">
    <% UserBean ub = (UserBean) request.getAttribute("ub"); %>
    
    <% if (ub != null) { %>
        <h1>Welcome <%= ub.getuname() %>!</h1>
        <h3>Your information is as follows:</h3>
        
        <table>
            <tr>
                <th>Field</th>
                <th>Details</th>
            </tr>
            <tr>
                <td>Your Name</td>
                <td><%= ub.getuname() %></td>
            </tr>
            <tr>
                <td>First Name</td>
                <td><%= ub.getfname() %></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><%= ub.getlname() %></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><%= ub.getaddr() %></td>
            </tr>
        </table>
        
    <% } else { %>
        <h1>Login Failed!</h1>
    <% } %>
</div>

</body>
</html>
