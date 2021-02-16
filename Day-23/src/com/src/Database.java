package com.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Database {
	static Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
      public static Connection getConnection() {
          try  {
        	  Class.forName("com.mysql.cj.jdbc.Driver");
  			String url="jdbc:mysql://localhost:3306/shivamdb";
  			String username="root";
  			String password="Verma";
  			con=DriverManager.getConnection(url, username, password);
             return con;
          }
          catch(Exception ex) {
              System.out.println("Database.getConnection() Error -->" + ex.getMessage());
              return null;
          }
      }
 
       public static void close(Connection con) {
          try  {
              con.close();
          }
          catch(Exception ex) {
          }
      }
}