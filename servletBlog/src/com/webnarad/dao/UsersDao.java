package com.webnarad.dao;

public interface UsersDao {
	
	public void createUser(String userName, String password);
	
	public void deleteUser(String userId);
	
	public void readUser(String userId);
}
