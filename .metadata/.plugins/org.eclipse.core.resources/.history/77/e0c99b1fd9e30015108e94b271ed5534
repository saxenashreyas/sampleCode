package com.webnarad.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnectionManager {
	private DataSource dataSource;

	public DBConnectionManager(String jndiname) throws Exception {
	    try {
	        dataSource = (DataSource) new InitialContext().lookup("java:comp/env/" + jndiname);
	    } catch (NamingException e) {
	        // Handle error that it's not configured in JNDI.
	        throw new Exception(jndiname + " is missing in JNDI!", e);
	    }
	}

	public Connection getConnection() {
		try(Connection connection = dataSource.getConnection();){
			return connection;
		} catch (SQLException e) {
			System.out.println("Exception encountered");
		}
	    return null;
	}
}
