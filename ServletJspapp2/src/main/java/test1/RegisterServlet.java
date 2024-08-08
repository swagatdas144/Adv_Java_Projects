package test1;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/regn")
public class RegisterServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		StudentBEAN sb=new StudentBEAN();
		sb.setsdname(req.getParameter("sdn"));
		sb.setspswd(req.getParameter("spsd"));
		sb.setsdmid(req.getParameter("smid"));
		sb.setsdphno(Long.parseLong(req.getParameter("sdphno")));
		int k=new SturegDAO().insert(sb);
		if(k>0) {
			req.setAttribute("msg", "Student successfully registered");
			RequestDispatcher rd=req.getRequestDispatcher("register.jsp");
			rd.forward(req, res);
		}
	}
	
	
}
