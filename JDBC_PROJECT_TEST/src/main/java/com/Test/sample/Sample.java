package com.Test.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args)throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
	  //String dbURL = "jdbc:mysql://192.168.29.73:3306/codebegun";
		String dbURL = "jdbc:mysql://192.168.0.168:3306/codebegun";
		String userName = "root";
		String password = "rootroot";
		String query = "select * from STUDENT_INFO";
		
		
		try {
			connection = DriverManager.getConnection(dbURL, userName, password);
			statement  = connection.createStatement();
			resultSet = statement.executeQuery(query);
			 ArrayList<User_Info> list = new ArrayList<>();
			
			while(resultSet.next()) {
				
				/*
				 * System.out.println(resultSet.getString("ID"));
				 * System.out.println(resultSet.getString("FIRST_NAME"));
				 * System.out.println(resultSet.getString("LAST_NAME"));
				 * System.out.println(resultSet.getString("GENDER"));
				 * System.out.println(resultSet.getString("COURSE"));
				 * System.out.println(resultSet.getString("STATUS_OF_STUDENT"));
				 * System.out.println(resultSet.getString("CREATED_DATE"));
				 * System.out.println(resultSet.getString("CREATED_USER"));
				 * System.out.println(resultSet.getString("UPDATED_DATE"));
				 * System.out.println("=====================================");
				 */
				 
				
				
				  User_Info user_info = new User_Info();
				  
					
					  user_info.setID(resultSet.getInt("ID"));
					  user_info.setFIRST_NAME(resultSet.getString("FIRST_NAME"));
					  user_info.setLAST_NAME(resultSet.getString("LAST_NAME"));
					  user_info.setGENDER(resultSet.getString("GENDER"));
					  user_info.setCOURSE(resultSet.getString("COURSE"));
					  user_info.setSTATUS_OF_STUDENT(resultSet.getString("STATUS_OF_STUDENT"));
					  user_info.setCREATED_DATE(resultSet.getDate("CREATED_DATE"));
					  user_info.setCREATED_USER(resultSet.getString("CREATED_USER"));
					  user_info.setUPDATED_DATE(resultSet.getDate("UPDATED_DATE"));
						/*
						 * 
						 * System.out.println(user.ID); System.out.println(user.FIRST_NAME);
						 * System.out.println(user.LAST_NAME); System.out.println(user.GENDER);
						 * System.out.println(user.COURSE); System.out.println(user.STATUS_OF_STUDENT);
						 * System.out.println(user.CREATED_DATE); System.out.println(user.CREATED_USER);
						 * System.out.println(user.UPDATED_DATE);
						 * System.out.println("====================");
						 */
					 
				 // user_info.setID(resultSet.getInt("ID"));
				 
					 //System.out.println(user.ID);
					
					
					 
						/*
						 * list.add(resultSet.getString("ID"));
						 * list.add(resultSet.getString("FIRST_NAME"));
						 * list.add(resultSet.getString("LAST_NAME"));
						 * list.add(resultSet.getString("GENDER"));
						 * list.add(resultSet.getString("COURSE"));
						 * list.add(resultSet.getString("STATUS_OF_STUDENT"));
						 * list.add(resultSet.getString("CREATED_DATE"));
						 * list.add(resultSet.getString("CREATED_USER"));
						 * list.add(resultSet.getString("UPDATED_DATE"));
						 */
					  //System.out.println(list.get(1));
//					  System.out.println(resultSet.getInt("ID"));
					  
				  list.add(user_info);
				  for(User_Info userinfo : list) {
					  System.out.println(userinfo.ID);
				  }
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
				resultSet.close();
				statement.close();
				connection.close();
			
		}
		
	}

}
