<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Message Page</title>
    <style>
        body {
            background-color: black;
            color: green;
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 10%;
        }

        .message {
            font-size: 20px;
            margin-bottom: 20px;
            padding: 10px;
            border: 2px solid green;
            display: inline-block;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <div class="message">
        <%
            String msg = (String) request.getAttribute("msz");
            out.println(msg);
        %>
    </div>
    <div>
        <%@include file="Home.html" %>
    </div>
</body>
</html>
