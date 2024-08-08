package test1;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/log")
public class StudentLoginServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		StudentBEAN sb=new LoginDAO().login(req.getParameter("sdn"),req.getParameter("spsd"));
		if(sb==null) {
			req.setAttribute("msg", "invalid login process...");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}else {
			ServletContext sc=req.getServletContext();
			sc.setAttribute("sbean", sb);
			Cookie ck=new Cookie("stdname",sb.getsdname());
			res.addCookie(ck);
			req.getRequestDispatcher("LoginSucess.jsp").forward(req, res);
		}
	}
}
