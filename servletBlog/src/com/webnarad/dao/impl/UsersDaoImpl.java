package com.webnarad.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.webnarad.dao.DBConnectionManager;
import com.webnarad.dao.UsersDao;

public class UsersDaoImpl implements UsersDao {
	
	private DBConnectionManager dbConnMgr;

	public UsersDaoImpl(){
		try{
			dbConnMgr = new DBConnectionManager("jdbc/db");
		} catch(Exception e) {
			System.out.println("Error in Connection Manager!!");
		}
	}
	
	@Override
	public void createUser(String userName, String password) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readUser(String userId) {
		
		try (
			Connection conn = dbConnMgr.getConnection();
			PreparedStatement stmt = conn.prepareStatement("select * from users where user_id=?");
		) {
			stmt.setInt(1, Integer.parseInt(userId));
			try (ResultSet rs = stmt.executeQuery()){
				if(rs.next()){
					System.out.println("User - " + rs.getString("user_name") + "/" + rs.getString("password"));
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
