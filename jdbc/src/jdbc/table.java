package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class table {
	public static void main(String[] args) {
		
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");   //Load Driver
		//Establishing connection with database
		
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521: XE","hr","hr");
			Statement stmt = con.createStatement();  //Creating a SQL Statement
			//stmt.executeUpdate(" Insert into ProductInfo values(900,'Colgate','Toothpaste',87) ");
			//ResultSet rSet = stmt.executeQuery("select * from ProductInfo");
			ResultSet rs =stmt.executeQuery("select * from ProductInfo");
		     ResultSetMetaData rsmd = rs.getMetaData();
		     int numberOfColumns = rsmd.getColumnCount();
			 String nameOfColumns= rsmd.getColumnName(2);
		     System.out.println(nameOfColumns);
			/*while(rSet.next()) {
				System.out.println(rSet.getString(1)+" "+rSet.getString(2)+" "+rSet.getString(3));
			}*/
	}
	
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	 catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
}
}