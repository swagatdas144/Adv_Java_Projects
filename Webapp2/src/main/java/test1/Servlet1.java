package test1;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/diss")
public class Servlet1 extends GenericServlet {
	@Override
	public void init() throws ServletException {
		
	}

	@Override
	public void service(ServletRequest req1, ServletResponse res1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String un=req1.getParameter("unm");
		String ps=req1.getParameter("pswd");
		String fnm=req1.getParameter("fn");
		String lnm=req1.getParameter("ln");
		String ad=req1.getParameter("add");
		String md=req1.getParameter("mid");
		String ph=req1.getParameter("phn");
		PrintWriter pw=res1.getWriter();
		res1.setContentType("text/html");
		pw.println("======servlet======<br>");
		pw.println("USER NAME:"+un+"<br>");
		pw.println("PASSWORD:"+ps+"<br>");
		pw.println("FIRST NAME:"+fnm+"<br>");
		pw.println("LAST NAME:"+lnm+"<br>");
		pw.println("ADDRESS:"+ad+"<br>");
		pw.println("MAIL ID:"+md+"<br>");
		pw.println("PHONE NUMBER:"+ph);
	}
	@Override
	public void destroy() {
		
	}

}
