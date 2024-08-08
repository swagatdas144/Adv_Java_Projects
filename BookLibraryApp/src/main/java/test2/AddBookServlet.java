package test2;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddBookServlet extends HttpServlet{
	
 protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msz", "session expired..");
			req.getRequestDispatcher("msz.jsp").forward(req, res);
		}else {
			BookBean bb=new BookBean();
			bb.setCode(req.getParameter("bcode"));
			bb.setName(req.getParameter("bname"));
			bb.setAuthor(req.getParameter("bauthor"));
			bb.setPrice(Float.parseFloat(req.getParameter("bprice")));
			bb.setQty(Integer.parseInt(req.getParameter("bqty")));
			int k=new AddBookDAO().insert(bb);
			if(k>0) {
				req.setAttribute("msz", "book added sucessfully...");
				req.getRequestDispatcher("addbook.jsp").forward(req, res);
			}
		}
	}
}
