package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.util.*;
import java.sql.*;
import dao.*;
import model.*;
@WebServlet("/FindAll") 
public class FindAllServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<a href='index.html'>Add New Employee</a>");
		out.println("<br><br><br>");
		try
		{
			Verma v=new Verma();
			List<Verma> l=new ArrayList<>();
			VermaDao vermaDao =new VermaDao();
			l = vermaDao.findAllRecord();
			Iterator<Verma>itr=l.iterator();
			

	        out.print("<table border='2' width='90%' style='color:red' ");  
	        out.print("<tr><th>Eno</th><th>Ename</th><th>Esal</th><th>Modify</th><th>Remove</th></tr>");  
			while(itr.hasNext())
			{
				v=itr.next();

		         out.print("<tr><td align='center' style='color:#ff8c00'>"+v.getEno()+"</td>"
		         			 + "<td align='center' style='color:#00008B'>"+v.getEname()+"</td>"
		         			 + "<td align='center' style='color:#006400'>"+v.getEsal()+"</td>"
		         			 + "<td align='center' ><a href='ShowUpdate?eno="+v.getEno()+"'>update</a></td>"
		         			 + "<td align='center' ><a href='DeleteServlet?eno="+v.getEno()+"'>delete</a></td></tr>");  
			}	
		}
		catch(Exception e) {
			out.println(e);
		}

	}

}
