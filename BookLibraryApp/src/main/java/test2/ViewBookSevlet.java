package test2;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewBookSevlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	HttpSession hs=req.getSession(false);
	if(hs==null) {
		req.setAttribute("msz", "session has expired.....");
		req.getRequestDispatcher("msg.jsp").forward(req, res);		
	}else {
		ArrayList<BookBean>al=new ViewBookDAO().retrive();
		hs.setAttribute("alist", al);
		req.getRequestDispatcher("ViewBook.jsp").forward(req, res);
		
		
	}
}
}
