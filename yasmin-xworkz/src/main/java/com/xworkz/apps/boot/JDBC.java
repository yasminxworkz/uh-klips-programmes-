package com.xworkz.apps.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.apps.configuration.AppConfiguration;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class JDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
				Connection connobj=DriverManager.getConnection("jdbc:mysql://Localhost:3306/flight", "root", "Xworkzodc@123");
			
				String insertQuery="insert into foodapp values(0,'ashirwad','foodapp',40,500,'swastik')";
				
				Statement statement=connobj.createStatement();
				
				int rowsAffected=statement.executeUpdate(insertQuery);
				log.info("rowsAffected "+rowsAffected);
				connobj.close();
		} catch (ClassNotFoundException e) {
			System.err.println("ClassNotFoundException problem loading driver, class name");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.err.println("SQLException connecting to DB, either URL,UN or pwd is wrong "+e.getMessage());
			e.printStackTrace();
		}

	}

}
