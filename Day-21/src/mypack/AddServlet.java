package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.sql.*;
import dao.*;
import model.*;
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		Integer eno=Integer.parseInt(req.getParameter("eno"));
		String ename=req.getParameter("ename");
		Integer esal=Integer.parseInt(req.getParameter("esal"));
		try
		{
			Verma v=new Verma();
            v.setEno(eno);
            v.setEname(ename);
            v.setEsal(esal);
            
            VermaDao vermaDao =new VermaDao();
			int x = vermaDao.addRecord(v);
			if(x>0) {  
	            req.getRequestDispatcher("FindAll").include(req, res);  
			}
		}
		catch(Exception e) {
			out.println(e);
		}

	}

}
