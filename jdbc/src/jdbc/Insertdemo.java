package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insertdemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ProductDetails");
	System.out.println("ProdID");
	int ProdID= sc.nextInt();
	System.out.println("Prod Name");
	String ProdName= sc.next();
	System.out.println("Category");
	String Category= sc.next();
	System.out.println("Price");
	int Price= sc.nextInt();

	try {
   	 //load a driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establishing a connection with DB
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		/*
		Statement stmt= con.createStatement();
		String qry="insert into ProductInfo values("+ProdID+",'"+ProdName+"','"+Category+"',"+Price+")";
	    stmt.executeUpdate(qry);
		//it is difficult to write so use below statement
		
		/*
		 //PreparedStatement
		PreparedStatement ps= con.prepareStatement("insert into ProductInfo values(?,?,?,?)");
	    ps.setInt(1, ProdID);
	    ps.setString(2, ProdName);
	    ps.setString(3, Category);
	    ps.setInt(4, Price);
	    
	    
       
	    //Prepare Statement

	    PreparedStatement ps = con.prepareStatement("update ProductInfo set ProdName=?,"+ "Price=?,Category=? where ProdID=?");
	    ps.setString(1, ProdName);
	    ps.setInt(2, Price);
	    ps.setString(3, Category);
	    ps.setInt(4, ProdID);
	    
	  int count = ps.executeUpdate();
	  if(count>0) {
		 System.out.println("Data Saved Successfully..."); 
	  }
	    System.out.println("Invalid ProductID");
		 
	    PreparedStatement ps1 = con.prepareStatement("delete from ProductInfo where ProdName=?");
	    ps1.setInt(1, ProdID);
	   
	    
	  int count1 = ps1.executeUpdate();
	  if(count1>0) {
		  System.out.println("Data deleted Successfully..."); 
	  }
	    System.out.println("Invalid ProductID");
	   */
		   CallableStatement cbs=con.prepareCall("{ call insertProd(?,?,?,?)}");
	       cbs.setInt(1, ProdID);
	       cbs.setString(2, ProdName);
	       cbs.setString(3, Category);
	       cbs.setInt(4, Price);

	       cbs.execute();

	       System.out.println("Data Saved...");
		
    } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    catch(SQLException e)
    {
   	 //e.printStackTrace();
   	// System.out.println("ProductID Existing...");
    	System.out.println(e);
    }
}
}
