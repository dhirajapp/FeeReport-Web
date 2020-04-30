package com.neerjeet.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.neerjeet.dao.DFINFO;

public class DB {

	static Connection connection=null;
	
	 static Connection getDB(){
		try{
			Class.forName(DFINFO.Dirver);
			
			connection=(Connection) DriverManager.getConnection(DFINFO.URL,DFINFO.USER, DFINFO.PASSWORD);
		 
		}catch (Exception e) {
			System.out.println("Dbconnection : "+e);
		}
		return connection;
	}

		//public static void main(String[] args) {
			//System.out.println(DB.getDB());
		//}

		
	
}
