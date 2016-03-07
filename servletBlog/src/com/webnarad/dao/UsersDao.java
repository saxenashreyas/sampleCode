package com.webnarad.dao;

import com.webnarad.domain.User;

public interface UsersDao {
	
	public void createUser(String userName, String password);
	
	public void deleteUser(String userId);
	
	public User readUser(String userId);
}
