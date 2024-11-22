package com.Testing.Test.units;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDataService {
	
	private ConnectionProvider connectionProvider;
	
	public MyDataService(ConnectionProvider connectionProvider) {
		this.connectionProvider=connectionProvider;
	}
	
	public String fetchDataFromDatabase() throws SQLException{
		try (Connection connection = connectionProvider.getConnection();
				PreparedStatement statement =connection.prepareStatement("select * from test_table");
				ResultSet resultSet=statement.executeQuery()){
			if(resultSet.next()) {
				return resultSet.getString("data");
			}
		}
		return null;
	}
}