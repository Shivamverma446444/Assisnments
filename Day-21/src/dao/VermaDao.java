package dao;
import model.*;
import java.util.*;
import java.sql.*;
import java.io.*;
public class VermaDao
{
	private Connection conn;
	private String sql;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public VermaDao() throws ClassNotFoundException,SQLException,IOException
	{
		conn=MyConnection.getConnection();
	}
	public Integer addRecord (Verma v) throws SQLException
	{
		sql="insert into Verma values (?,?,?)";
		pst=conn.prepareStatement(sql);
		pst.setInt(1,v.getEno());
		pst.setString(2,v.getEname());
		pst.setInt(3,v.getEsal());
		return pst.executeUpdate();
	}
	public Integer updateRecord (Verma v) throws SQLException
	{
		sql="update  Verma set ename=?, esal=?where eno=?";
		pst=conn.prepareStatement(sql);
		pst.setInt(3,v.getEno());
		pst.setString(1,v.getEname());
		pst.setInt(2,v.getEsal());
		return pst.executeUpdate();
	}
	public Integer deleteRecord (Verma v) throws SQLException
	{
		sql="delete from Verma where eno=?";
		pst=conn.prepareStatement(sql);
		pst.setInt(1,v.getEno());
		return pst.executeUpdate();
	}
	
	public Verma findRecord (Verma v) throws SQLException,ClassNotFoundException
	{
		sql="select * from Verma where eno=?";
		pst=conn.prepareStatement(sql);
		pst.setInt(1,v.getEno());
		rs= pst.executeQuery();
		rs.next();
		
		v.setEno(rs.getInt("eno"));
		v.setEname(rs.getString("ename"));
		v.setEsal(rs.getInt("esal"));
		return v;
	}
	public List<Verma> findAllRecord () throws SQLException,ClassNotFoundException
	{
		sql="select * from Verma ";
		pst=conn.prepareStatement(sql);
		rs= pst.executeQuery();
		List<Verma> l=new ArrayList<>();
		while(rs.next())
		{
			Verma v = new Verma();
			v.setEno(rs.getInt("eno"));
			v.setEname(rs.getString("ename"));
			v.setEsal(rs.getInt("esal"));
			l.add(v);
		}	
		return l;
	}
	
}
