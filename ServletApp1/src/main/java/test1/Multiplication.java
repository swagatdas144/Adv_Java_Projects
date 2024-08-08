package test1;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/mu")
public class Multiplication extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i1=Integer.parseInt(req.getParameter("v1"));
		int i2=Integer.parseInt(req.getParameter("v2"));
		int rs=i1*i2;
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("===multiplication of two values====");
		pw.println(rs);
		RequestDispatcher rdd=req.getRequestDispatcher("input.html");
		rdd.include(req, res);
		
	}

}
