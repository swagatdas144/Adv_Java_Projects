<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #111; /* dark black background */
            color: #fff; /* white text */
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: #333; /* darker container background */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            text-align: center;
            max-width: 400px;
            width: 100%;
            box-sizing: border-box;
        }
        h1 {
            color: #c00; /* red heading text */
            margin-bottom: 20px;
        }
        p {
            margin-bottom: 20px;
        }
        .login-form {
            margin-bottom: 20px;
        }
        .login-form input[type="text"],
        .login-form input[type="password"],
        .login-form input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
        }
        .login-form input[type="submit"] {
            background-color: #c00; /* red submit button */
            color: #fff; /* white text on submit button */
            cursor: pointer;
        }
        .login-form input[type="submit"]:hover {
            background-color: #900; /* darker shade on hover */
        }
        .message {
            color: #ff0; /* yellow message text */
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Student Login</h1>
        <p>Please enter your credentials:</p>
        <div class="login-form">
            <%@include file="studentlogin.html" %>
        </div>
        <p class="message">
            <% String msz=(String)request.getAttribute("msg"); %>
            <%= msz %>
        </p>
    </div>
</body>
</html>
