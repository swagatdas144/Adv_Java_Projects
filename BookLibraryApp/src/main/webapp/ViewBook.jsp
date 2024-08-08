<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test2.*,java.util.*"%>
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
            margin: 20px;
        }

        .header {
            font-size: 24px;
            margin-bottom: 20px;
        }

        .book-list {
            margin: 20px 0;
            padding: 10px;
            border: 2px solid green;
            border-radius: 10px;
            background-color: #222;
        }

        .book-item {
            margin-bottom: 15px;
            padding: 10px;
            border-bottom: 1px solid green;
        }

        .book-item:last-child {
            border-bottom: none;
        }

        .book-item a {
            color: green;
            text-decoration: none;
            margin-right: 15px;
            transition: color 0.3s ease;
        }

        .book-item a:hover {
            color: #00cc00;
        }

        .actions {
            margin-top: 20px;
        }

        .actions a {
            color: green;
            text-decoration: none;
            font-size: 18px;
            margin-right: 20px;
            padding: 10px 20px;
            border: 2px solid green;
            border-radius: 5px;
            transition: background-color 0.3s ease, color 0.3s ease;
        }

        .actions a:hover {
            background-color: green;
            color: black;
        }
    </style>
</head>
<body>
    <div class="header">
        <% 
            AdminBean ab = (AdminBean) session.getAttribute("abean");
            out.println("Page belongs to: " + ab.getFname());
        %>
    </div>
    
    <div class="book-list">
        <%
            ArrayList<BookBean> al = (ArrayList<BookBean>) session.getAttribute("alist");
            if (al.size() == 0) {
                out.println("Books not available. Please add a book..");
            } else {
                Iterator<BookBean> it = al.iterator();
                while (it.hasNext()) {
                    BookBean bb = (BookBean) it.next();
        %>
                    <div class="book-item">
                        <strong>BOOK CODE:</strong> <%= bb.getCode() %><br>
                        <strong>BOOK NAME:</strong> <%= bb.getName() %><br>
                        <strong>BOOK AUTHOR:</strong> <%= bb.getAuthor() %><br>
                        <strong>BOOK PRICE:</strong> <%= bb.getPrice() %><br>
                        <strong>BOOK QUANTITY:</strong> <%= bb.getQty() %><br>
                        <a href="edit?bcode=<%= bb.getCode() %>">EDIT</a>
                        <a href="delete?bcode=<%= bb.getCode() %>">DELETE</a>
                    </div>
        <%
                }
            }
        %>
    </div>

    <div class="actions">
        <a href="book.html">Add Book</a>
        <a href="logout">Logout</a>
    </div>
</body>
</html>
