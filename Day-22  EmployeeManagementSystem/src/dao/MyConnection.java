package dao;
import java.sql.*;
import java.util.Properties;
import java.io.*;
public class MyConnection {
	private MyConnection() {}
	private static Connection conn;
	public static Connection getConnection() throws ClassNotFoundException,SQLException, IOException
	{
		FileReader fr= new FileReader("home\\shivam\\DatabaseInformation.properties");
		Properties p=new Properties();
		p.load(fr);
		if(conn==null)
		{
			Class.forName(p.getProperty("driver"));
			conn=DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("password"));
		}
		return conn;
	}
}
