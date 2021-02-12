package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import dao.*;
import model.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet{
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
			int x = vermaDao.updateRecord(v);
			if(x>0) {
				res.sendRedirect("FindAll");
			}
		}
		catch(Exception e) {
			out.println(e);
		}

	}

}
