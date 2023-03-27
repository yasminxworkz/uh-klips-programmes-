package com.xworkz.apps.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.apps.configuration.AppConfiguration;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class SelectOperation {

	public static void main(String[] args) {
		
		
		try 
			(Connection connobj=DriverManager.getConnection("jdbc:mysql://Localhost:3306/flight", "root", "Xworkzodc@123")){
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
