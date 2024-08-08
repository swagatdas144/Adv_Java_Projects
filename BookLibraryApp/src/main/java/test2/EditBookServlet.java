package test2;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditBookServlet extends HttpServlet {
	@SuppressWarnings("unchecked")
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		
	 HttpSession hs=req.getSession(false);
	 if(hs==null) {
		 req.setAttribute("msz","Sesion expired");
		 req.getRequestDispatcher("msg.jsp").forward(req, res);
	 }else {
		 String bC=req.getParameter("bcode");
		 ArrayList<BookBean>al=(ArrayList<BookBean>)hs.getAttribute("alist");
		 Iterator<BookBean>it=al.iterator();
		 while(it.hasNext()){
			 BookBean bb=(BookBean)it.next();
			 if(bC.equals(bb.getCode())){
				 req.setAttribute("bbean", bb);
				 req.getRequestDispatcher("EditBook.jsp").forward(req, res);
				 
				break;
			 }
		 }
	 }

  }
}
