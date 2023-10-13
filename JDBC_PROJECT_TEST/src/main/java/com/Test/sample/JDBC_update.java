package com.Test.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_update {

	public static void main(String[] args)throws SQLException {
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		String dbURL = "jdbc:mysql://192.168.0.168:3306/codebegun";
		String user = "root";
		String password = "rootroot";
		String qurey = "update student_info set STATUS_OF_STUDENT=? where Id=?";
		try {
			connection = DriverManager.getConnection(dbURL, user, password);
			preparedstatement = connection.prepareStatement(qurey);
			
			preparedstatement.setString(1, "Not-active");
			preparedstatement.setInt(2, 11);
			
			int result = preparedstatement.executeUpdate();
			System.out.println("your column is ::"+result);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
			preparedstatement.close();
		}
	}

}
