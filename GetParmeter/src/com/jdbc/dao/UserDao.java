package com.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.util.DatabaseConnecton;

public class UserDao {
	public static boolean find(String name, String passworld) {
		boolean isFind = false;
		Connection connection = null;
		Statement statement = null;
		ResultSet executeQuery = null;
		
		try {
			connection = DatabaseConnecton.getConnection();
			StringBuilder sqlStringBuilder = new StringBuilder();
			sqlStringBuilder.append("SELECT * FROM `user` WHERE `user`.`name` = '" + name + "' AND `user`.`password` = '" + passworld + "';");
			
			statement = DatabaseConnecton.getStatement(connection);
			
			executeQuery = statement.executeQuery(sqlStringBuilder.toString());
			
			if (executeQuery.next() && null != executeQuery) isFind = true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DatabaseConnecton.close(connection, statement, executeQuery);
		}
		
		return isFind;
	}
}
