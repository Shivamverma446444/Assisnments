package mypack;
import dao.*;
import model.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Integer eno=Integer.parseInt(request.getParameter("eno"));
		String ename=request.getParameter("ename");
		Integer esal=Integer.parseInt(request.getParameter("esal"));
		try
		{
			Verma v=new Verma();
            v.setEno(eno);
            v.setEname(ename);
            v.setEsal(esal);
            
            VermaDao vermaDao =new VermaDao();
			int x = vermaDao.addRecord(v);
			if(x>0) {  
	            request.getRequestDispatcher("FindAll").include(request, response);  
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
