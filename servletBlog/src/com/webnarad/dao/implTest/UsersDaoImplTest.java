package com.webnarad.dao.implTest;

import org.junit.Test;

import com.webnarad.dao.UsersDao;
import com.webnarad.dao.impl.UsersDaoImpl;

public class UsersDaoImplTest {

	@Test
	public void testReadUser(){
		UsersDao usersDao = new UsersDaoImpl();
		usersDao.readUser("1");
	}
}
