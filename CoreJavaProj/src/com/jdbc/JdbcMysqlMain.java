package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcMysqlMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection dbcon= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		System.out.println("Connection Established!!");
		Statement stmt=dbcon.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM test.check");
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("Name");
			int phone=rs.getInt("Phone");
			System.out.println(id+"-"+name+"-"+phone);
		}
		
		stmt.executeUpdate("UPDATE test.check SET Name='Raj' where id='1'");
		//stmt.executeUpdate("INSERT INTO test.check(id,name,phone) VALUES('3','Singh','3333')");
		//stmt.executeUpdate("DELETE FROM test.check WHERE id='1'");
		stmt.executeUpdate("DELETE FROM test.check");
		rs.close();
		stmt.close();
		dbcon.close();
		
		
	}

}
