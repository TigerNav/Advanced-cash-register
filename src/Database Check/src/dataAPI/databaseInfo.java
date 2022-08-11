package dataAPI;

import java.sql.Connection;
import java.sql.DriverManager;

public class databaseInfo {

	String url = "jdbc:mysql://localhost:3306/StoreInfo";
	String username = "root";
	String password = "tigernav";
	public static Connection connection;
	
	public databaseInfo() {
		
		try{
			connection = DriverManager.getConnection(url, username, password);
			
			System.out.println("Connected");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
