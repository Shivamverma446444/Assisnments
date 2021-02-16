package mypack;
import dao.*;
import model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindAllServlet
 */
@WebServlet("FindAllServlet")
public class FindAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
