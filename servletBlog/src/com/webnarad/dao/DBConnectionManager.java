package com.webnarad.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBConnectionManager {
	static Logger log = LogManager.getLogger(DBConnectionManager.class);
	
	private DataSource dataSource;

	public DBConnectionManager(String jndiname) throws Exception {
		log.info("Creating a new datasource");
	    try {
	        dataSource = (DataSource) new InitialContext().lookup("java:comp/env/" + jndiname);
	    } catch (NamingException e) {
	        // Handle error that it's not configured in JNDI.
	        throw new Exception(jndiname + " is missing in JNDI!", e);
	    }
	}

	public Connection getConnection() {
		log.info("Creating a new DB Connection");
		Connection connection;
		try{
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			log.error("Exception encountered");
			return null;
		}
		return connection;
	}
}
