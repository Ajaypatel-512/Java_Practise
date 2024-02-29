package com.practise.jdbc.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class AccountDao {
	
	public static void main(String[] args) {
		try {
			
			/**
			 * Connection, Statement, ResultSet --> Interfaces
			 * can also add these in try block to avoid explicitly close connections
			 * executeUpdate Statement interface is used to execute DML statements.
			 * executeUpdate method of the Statement interface return number of rows affected
			 * executeQuery Statement interface is used to execute DQL statements
			 * */
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","12345678");
			System.out.println(connection);
			
			Statement statement = connection.createStatement();
			//int result = statement.executeUpdate("insert into account values(1, 'ajay', 'patel',100000)");
			//System.out.println(result + " rows got inserted");
			
//			int result = statement.executeUpdate("update account set bal=200000 where firstname = 'patel'");
//			System.out.println(result + " rows got inserted");
			
			
//			int result = statement.executeUpdate("delete from account where firstname = 'patel'");
//			System.out.println(result + " rows got inserted");
			
			
			ResultSet result = statement.executeQuery("select * from account");
			
			while(result.next()) {
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getInt(4));
			}
			
			result.close();
			statement.close();
			connection.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} 
		
	}

}
