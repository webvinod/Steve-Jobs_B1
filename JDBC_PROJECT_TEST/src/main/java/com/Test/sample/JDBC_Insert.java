package com.Test.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Insert {
	public static void main(String [] args)throws SQLException {
		Connection connection = null;
		PreparedStatement preparedstatement = null; 
		String dbURL = "jdbc:mysql://192.168.0.168:3306/codebegun";
		String user = "root";
		String password = "rootroot";
		String qurey = "insert into student_info(FIRST_NAME,LAST_NAME,GENDER,COURSE, STATUS_OF_STUDENT, CREATED_DATE, CREATED_USER, UPDATED_DATE)\n"
				+ "VALUES(?,?,?,?,?,?,?,?)";
		try {
			connection = DriverManager.getConnection(dbURL, user, password);
			preparedstatement = connection.prepareStatement(qurey);
			
			preparedstatement.setString(1,"vishnu");
			preparedstatement.setString(2,"bana");
			preparedstatement.setString(3,"M");
			preparedstatement.setString(4,"java");
			preparedstatement.setString(5,"Active");
			preparedstatement.setString(6,"2023-10-09");
			preparedstatement.setString(7,"root");
			preparedstatement.setString(8,"2023-10-12");
			
			int result = preparedstatement.executeUpdate();
			System.out.println("your column is ::"+result);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			connection.close();
			preparedstatement.close();
		}
	}
}
