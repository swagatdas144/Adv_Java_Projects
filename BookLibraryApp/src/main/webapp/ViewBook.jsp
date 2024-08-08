<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="test2.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
ArrayList<BookBean> al=(ArrayList<BookBean>)session.getAttribute("alist");
out.println("page belongs to :"+ab.getFname()+"<br>");
if(al.size()==0){
	out.println("books not availablle.please add book..");
}else{
	Iterator<BookBean>it=al.iterator();
	while(it.hasNext()){
		BookBean bb=(BookBean)it.next();
		out.println("BOOK CODE:="+bb.getCode()+"&nbsp&nbsp"+"<br>"+"BOOK NAME:="+bb.getName()+"<BR>"+"&nbsp&nbsp"+"BOOK AUTHOR:="+bb.getAuthor()+"<BR>"+"&nbsp&nbsp"+"BOOK PRICE:="+bb.getPrice()+"<BR>"+"&nbsp&nbsp"+"BOOK QUANTITY:="+bb.getQty()+"<br>"+"&nbsp&nbsp"+"<a href='edit?bcode="+bb.getCode()+"'>EDIT</a>"+"&nbsp&nbsp"+"<BR>"+"<a href='delete?bcode="+bb.getCode()+"'>DELETE</a>"+"<br>");
		
	}
}
%>
<a href="book.html">AddBook</a>
<a href="logout">Logout</a>
</body>
</html>