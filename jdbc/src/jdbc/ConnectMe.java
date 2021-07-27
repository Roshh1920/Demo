package jdbc;
import java.sql.*;

public class ConnectMe {

	public static void main(String[] args) {
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");   //Load Driver
		//Establishing connection with database
		
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521: XE","hr","hr");
			Statement stmtStatement = con.createStatement();  //Creating a SQL Statement
			ResultSet rSet = stmtStatement.executeQuery("select * from Employees");
			
			while(rSet.next()) {
				System.out.println(rSet.getString(1)+" "+rSet.getString(2)+" "+rSet.getString(3));
			}
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

