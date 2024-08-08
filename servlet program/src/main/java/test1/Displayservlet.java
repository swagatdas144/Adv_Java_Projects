package test1;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class Displayservlet extends GenericServlet{
@Override
public void init()throws ServletException{
	
}
@Override
public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
	String un=req.getParameter("unm");
	String md=req.getParameter("mid");
	String psw=req.getParameter("pswd");
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	pw.println("======servlet======<br>");
	pw.println("USER NAME:"+un+"<br>");
	pw.println("MAIL ID:"+md+"<br>");
	pw.println("PASSWORD:"+psw);
	
}
@Override
public void destroy() {
	
}
	
}
