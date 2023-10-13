package com.Test.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Delete {

	public static void main(String[] args)throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String dbURL = "jdbc:mysql://192.168.0.168:3306/codebegun";
		String user = "root";
		String password = "rootroot";
		String qurey = "Delete from student_info where ID=?";
		try {
				
			connection = DriverManager.getConnection(dbURL, user, password);
			preparedStatement = connection.prepareStatement(qurey);
			
			preparedStatement.setInt(1, 11);
			
			int result = preparedStatement.executeUpdate();
			System.out.println("result is :"+ result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
			preparedStatement.close();
		}
	}

}
