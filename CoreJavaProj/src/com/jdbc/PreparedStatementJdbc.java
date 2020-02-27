package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementJdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement ps1=conn.prepareStatement("INSERT INTO test.check VALUES(?,?,?)");
		ps1.setInt(1,1);
		ps1.setString(2, "Hemant");
		ps1.setInt(3,1111);
		ps1.execute();
		ps1.setInt(1,2);
		ps1.setString(2, "Hemant");
		ps1.setInt(3,1111);
		ps1.execute();
		
		PreparedStatement ps2=conn.prepareStatement("UPDATE test.check SET Name='Raj' WHERE id='2'");
		ps2.execute();
		
		PreparedStatement ps3=conn.prepareStatement("DELETE FROM test.check WHERE id='2'");
		ps3.execute();
		
		PreparedStatement ps4=conn.prepareStatement("Select * from test.check");
		ResultSet r=ps4.executeQuery();
		r.next();
		System.out.println(r.getInt("id")+"-"+r.getString("Name")+"-"+r.getInt("phone"));
	}

}
