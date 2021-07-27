package jdbc;
import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class metadate {
public static void main(String[] args) {
	

	try {
   	 //load a driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//establishing a connection with DB
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
	
	Scanner sc=new Scanner(System.in);
	/*
	DatabaseMetaData dbs=con.getMetaData();
	System.out.println(dbs.getDriverName());
	System.out.println(dbs.getURL());
	System.out.println(dbs.getUserName());
	

	ResultSetMetaData rst = rs.getMetaData();
	System.out.println(rst.getColumnName(1)+" ,"+rst.getColumnName(2)+" ,"+ rst.getColumnName(3)+","+rst.getColumnName(4));
	System.out.println(rst.getColumnTypeName(1));
	System.out.println(rst.getColumnCount());
	*/
	System.out.println("Enter Table Name");
	String table = sc.next();
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("Select * from "+ table);
	ResultSetMetaData rst = rs.getMetaData();
	int tot=rst.getColumnCount();
	for(int x=1;x<tot;x++) {
		System.out.println(rst.getColumnName(x));

	}
	
	} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
	catch (SQLSyntaxErrorException ex ) {
		System.out.println("Invalid Table Name");
	}
catch(SQLException e)
{
	System.out.println(e);
}
}

}
