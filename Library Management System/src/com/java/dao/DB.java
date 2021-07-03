package com.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@BHASKAR:1521:xe","bhaskar","tumram");
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
