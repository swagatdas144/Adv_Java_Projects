package test1;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{
	@Override
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
	UserBean ub=new UserBean();
	ub.setuname(req.getParameter("uname"));
	ub.setpword(req.getParameter("pword"));
	ub.setfname(req.getParameter("fname"));
	ub.setlname(req.getParameter("lname"));
	ub.setaddr(req.getParameter("addr"));
	ub.setmid(req.getParameter("mid"));
	ub.setphno(Long.parseLong(req.getParameter("phno")));
	int k=new RegisterDAO().insert(ub);
	System.out.println("k valuew is"+k);
	if(k>0) {
		req.setAttribute("msg", "user sucessfully registerd");
		RequestDispatcher rd=req.getRequestDispatcher("Register.jsp");
		rd.forward(req, res);
	}
	else
	{
		PrintWriter pw=res.getWriter();
		pw.println("Not Registered");
	}
}
}
