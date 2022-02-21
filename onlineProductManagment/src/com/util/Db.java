package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Db {
	
	private Db() {
		
	}
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
		
	
	ResourceBundle rb =ResourceBundle.getBundle("db");
	Class.forName(rb.getString("driver"));
	Connection con=DriverManager.getConnection(rb.getString("con"),rb.getString("user"),rb.getString("password"));
	return con;
	}
}
