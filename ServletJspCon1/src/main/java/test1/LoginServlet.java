package test1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/log")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pword");
		
		
		UserBean ub=null;
		
		ub=LoginDAO.login(uname, pass);
		
		
			//pw.println(uname+" You Have Login Succesfull");
			req.setAttribute("ub", ub);
			RequestDispatcher rd=req.getRequestDispatcher("loginView.jsp");
			rd.include(req, resp);
		
		
	}
}
