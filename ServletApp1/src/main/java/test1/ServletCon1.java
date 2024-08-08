package test1;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/choice")
public class ServletCon1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=req.getParameter("s1");
		switch(s1) {
		case "sub":
				RequestDispatcher rd=req.getRequestDispatcher("sb");
				rd.forward(req, res);
				break;
		case "mul":
			RequestDispatcher rd1=req.getRequestDispatcher("mu");
				rd1.forward(req, res);
				break;
		case "div":
			RequestDispatcher rd2=req.getRequestDispatcher("dv");
				rd2.forward(req, res);
				break;
		case "moddiv":
			RequestDispatcher rd3=req.getRequestDispatcher("md");
				rd3.forward(req, res);
				break;
		case "greater":
			RequestDispatcher rd4=req.getRequestDispatcher("gr");
				rd4.forward(req, res);
				
		default:
			RequestDispatcher rd6=req.getRequestDispatcher("sm");
			rd6.forward(req, res);
			
		}
	}

}
