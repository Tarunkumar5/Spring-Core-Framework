package com.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class StudentDAO {
//	private String driver = "com.mysql.jdbc.Driver";
//
//	private String url = "jdbc:mysql://localhost:3306/spring";
//
//	private String userName = "root";
//
//	private String password = "Tarunkumar5@";

	private String driver;

	private String url;

	private String userName;

	private String password;
	
	Connection con;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		System.out.println("inside the custom init method");
		createDBConnection();
	}

	
	public void createDBConnection() throws ClassNotFoundException, SQLException {
		
		System.out.println("inside connection method");

		// load driver
		Class.forName(driver);

		// get a connection
		con = DriverManager.getConnection(url, userName, password);
	}


	public void selectAllRows() throws ClassNotFoundException, SQLException {

//		// load driver
//		Class.forName(driver);
//
//		// get a connection
//		Connection con = DriverManager.getConnection(url, userName, password);
		
		System.out.println("inside selectrows method");
		
		//execute query
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM `hibernate-morning`.song");

		while (rs.next()) {
			int songId = rs.getInt(1);
			String songName = rs.getString(2);
			String singer = rs.getString(3);

			System.out.println(songId + " " + songName + " " + singer);
		}
		
//		//closing the connection
//		con.close();

	}

	public void deleteSongs(int songId) throws ClassNotFoundException, SQLException {
		
//		// load driver
//		Class.forName(driver);
//
//		// get a connection
//		Connection con = DriverManager.getConnection(url, userName, password);

	
		// execute query
		Statement stmt = con.createStatement();

		stmt.executeUpdate("delete from `hibernate-morning`.song where songId = " + songId);

		System.out.println("Record deleted with the id " + songId);
		
//		//closing the connection
//		con.close();

	}

	
	public void closeConnection() throws SQLException {
		
		//closing the connection
		con.close();
	}
	
	//@PreDestroy
	public void destroy() throws SQLException {
		System.out.println("Destroying connection");
		//closing the connection
		closeConnection();
	}

}
