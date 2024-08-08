<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="test2.*"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Update Book</title>
    <style>
        body {
            background-color: black;
            color: red;
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 10%;
        }

        form {
            display: inline-block;
            background-color: #333;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px red;
        }

        input[type="text"] {
            width: 80%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid red;
            border-radius: 5px;
            background-color: #222;
            color: red;
        }

        input[type="submit"] {
            background-color: red;
            color: black;
            border: none;
            padding: 10px 20px;
            font-size: 18px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #ff4d4d;
        }
    </style>
</head>
<body>
    <%
        AdminBean ab = (AdminBean) session.getAttribute("abean");
        BookBean bb = (BookBean) request.getAttribute("bbean");
    %>
    <form action="update" method="post">
        <input type="hidden" name="bcode" value="<%=bb.getCode() %>">
        <label for="bprice">Book Price:</label><br>
        <input type="text" id="bprice" name="bprice" value="<%=bb.getPrice() %>"><br>
        <label for="bqty">Book Quantity:</label><br>
        <input type="text" id="bqty" name="bqty" value="<%=bb.getQty() %>"><br>
        <input type="submit" value="Update Book">
    </form>
</body>
</html>
