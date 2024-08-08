package test2;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/admin")
public class AdminLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		AdminBean ab=new AdminDAO().login(req.getParameter("uname"),req.getParameter("pword"));
		if(ab==null) {
			req.setAttribute("msz","invalid login process...");
			req.getRequestDispatcher("msz.jsp").forward(req, res);
			
		}
		else {
			HttpSession hs=req.getSession();
			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("Adminlogin.jsp").forward(req, res);
		}
		}
	
}
