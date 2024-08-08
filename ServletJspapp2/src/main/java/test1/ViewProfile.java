package test1;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfile extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		Cookie c[]=req.getCookies();
		if(c==null) {
			req.setAttribute("msg","session expired");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
			
		}else {
			String Sname=c[0].getValue();
			req.setAttribute("name", Sname);
			req.getRequestDispatcher("viewprofile.jsp").forward(req, res);
		}
		
	}
}
