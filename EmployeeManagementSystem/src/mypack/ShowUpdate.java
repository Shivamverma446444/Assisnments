package mypack;
import dao.*;
import model.*;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowUpdate
 */
@WebServlet("/ShowUpdate")
public class ShowUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1 align='center'>Update Employee</h1><hr>"); 
		Integer eno=Integer.parseInt(request.getParameter("eno"));
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
