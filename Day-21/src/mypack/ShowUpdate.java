	package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import dao.*;
import model.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/ShowUpdate")
public class ShowUpdate extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1 align='center'>Update Employee</h1><hr>"); 
		Integer eno=Integer.parseInt(req.getParameter("eno"));
		try
		{
			Verma v=new Verma();
            v.setEno(eno);
            
            VermaDao vermaDao =new VermaDao();
			v = vermaDao.findRecord(v);
			out.println("");
	        out.print("<form method='post' action='UpdateServlet' >");  
	        out.print("<table bgcolor='pink' border='2' width='18%' style='color:red' align='center'>");
	        
	        out.print("<tr><td>Eno:</td><td ><input type='text' name='eno' value='"+v.getEno()+"'/></td></tr>");  
	        out.print("<tr><td>Name:</td><td><input type='text' name='ename' value='"+v.getEname()+"'/></td></tr>");  
	        out.print("<tr><td>Sallary:</td><td><input type='text' name='esal' value='"+v.getEsal()+"'/></td></tr>");  
	          
	        out.print("<tr><td colspan='2' align ='center' bgcolor='blue'><input type='submit' value='Update & Save '/></td></tr>");  
	        out.print("</table>");  
	        out.print("</form>");   				
		}
		catch(Exception e) {
			out.println(e);      
		}

	}

}
