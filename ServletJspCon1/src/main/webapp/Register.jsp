<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
    body {
        background-color: #1f1f1f; /* Dark background color */
        color: #fff; /* White text color */
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 80%;
        margin: 50px auto;
        background-color: #333; /* Darker container background */
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0,0,0,0.3);
    }
    h1 {
        text-align: center;
    }
    .message {
        margin-top: 20px;
        padding: 10px;
        background-color: #555; /* Darker message box */
        border-radius: 5px;
        text-align: center;
    }
    .login-form {
        margin-top: 20px;
        text-align: center;
    }
    .login-form input[type="text"], 
    .login-form input[type="password"], 
    .login-form input[type="submit"] {
        padding: 10px;
        margin: 5px;
        border: none;
        border-radius: 3px;
    }
    .login-form input[type="submit"] {
        background-color: #4CAF50; /* Green submit button */
        color: white;
        cursor: pointer;
    }
    .login-form input[type="submit"]:hover {
        background-color: #45a049; /* Darker green on hover */
    }
</style>
</head>
<body>

<div class="container">
    <h1>Login Page</h1>
    <div class="message">
        <% String msg = (String) request.getAttribute("msg"); %>
        <%= msg %>
    </div>
    
    <div class="login-form">
        <%@ include file="Login.html" %>
    </div>
</div>

</body>
</html>
