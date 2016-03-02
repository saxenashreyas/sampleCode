package com.webnarad.dao;

public interface BlogDao {
	
	public void createBlog(String title, String authId);
	
	public void deleteBlog(String blogId);
	
	public void readBlog(String blogId);
}
