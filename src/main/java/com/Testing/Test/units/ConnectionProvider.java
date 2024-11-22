package com.Testing.Test.units;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConnectionProvider{
	
	Connection getConnection() throws SQLException;
}
/*class Base implements ConnectionProvider {
	
	@Override
	public Connection getConnection() throws SQLException {
		String jdbcUrl = "jdbc:mysql://localhost:3306/testbase";
		String username = "root";
		String password = "L0v34ll@222";
		
		Connection connection=null;
		try{
			connection=DriverManager.getConnection(jdbcUrl,username,password);
			System.out.println("Connected to database!");
			}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			 try {
				 if(connection!=null && !connection.isClosed()) {
					 connection.close();
					 System.out.println("Connection Closed");
				 }
			 }catch(SQLException e) {
				 System.out.println(e.getMessage());
			 }
		}
		
		return connection;
	}
}*/
