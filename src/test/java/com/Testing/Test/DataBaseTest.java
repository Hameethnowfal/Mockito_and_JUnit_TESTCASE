package com.Testing.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.Testing.Test.units.ConnectionProvider;
import com.Testing.Test.units.MyDataService;

import org.junit.Test;

public class DataBaseTest {
	
	@Test
	public void testFetchDataFromDatabase() throws SQLException {
		
		ConnectionProvider connectionProvider=mock(ConnectionProvider.class);
		Connection connection=mock(Connection.class);
		PreparedStatement preparedStatement=mock(PreparedStatement.class);
		ResultSet resultSet =mock(ResultSet.class);
		
		when(connectionProvider.getConnection()).thenReturn(connection);
		when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
		when(preparedStatement.executeQuery()).thenReturn(resultSet);
		when(resultSet.next()).thenReturn(true);
		when(resultSet.getString("data")).thenReturn("MockedData");
		
		MyDataService dataService=new MyDataService(connectionProvider);
		String result=dataService.fetchDataFromDatabase();
		
		verify(connectionProvider).getConnection();
		verify(connection).prepareStatement("select * from test_table");
		verify(preparedStatement).executeQuery();
		
		assertEquals("MockedData",result);
	}
}