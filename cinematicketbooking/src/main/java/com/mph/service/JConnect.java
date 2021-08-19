package com.mph.service;

import java.sql.*;

import org.springframework.stereotype.Service;




@Service
public class JConnect{
/*
	public static final String URL="jdbc:mysql://localhost:3306/bookmymovie";
	public static final String USR="root";
	public static final String PWD="password";
*/
	
	public static Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
		return con;
		}catch(Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}
	
	public static Statement getStatement() {
		try {
		return (Statement) getConnection().createStatement();
		}catch(SQLException exception){
			exception.printStackTrace();
			return null;
		}
		}
	
	public static PreparedStatement getPreparedStatement(String sql) {
		try {
			return (PreparedStatement) getConnection().prepareStatement(sql);
		}catch(SQLException exception) {
			exception.printStackTrace();
			return null;
		}
	}
}
	