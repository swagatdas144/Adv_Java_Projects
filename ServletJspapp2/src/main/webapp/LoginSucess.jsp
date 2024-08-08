<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test1.StudentBEAN"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student Profile</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #111;
            color: #fff;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: #333;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
        }
        h1 {
            color: #c00;
            text-align: center;
        }
        .welcome-message {
            text-align: center;
            margin-bottom: 20px;
        }
        .welcome-message span {
            font-weight: bold;
        }
        .links {
            text-align: center;
            margin-top: 20px;
        }
        .links a {
            color: #c00;
            text-decoration: none;
            padding: 10px 20px;
            margin: 0 10px;
            border-radius: 5px;
            background-color: #222;
            transition: background-color 0.3s;
        }
        .links a:hover {
            background-color: #c00;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Student Profile</h1>
        <div class="welcome-message">
            <% StudentBEAN sb=(StudentBEAN)application.getAttribute("sbean"); %>
            <p>Welcome user: <span><%= sb.getsdname() %></span></p>
        </div>
        <div class="links">
            <a href="view">ViewProfile</a>
            <a href="logout">Logout</a>
        </div>
    </div>
</body>
</html>
