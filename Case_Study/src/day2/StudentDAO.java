package day2;
import java.sql.*;
import java.util.List;

public class StudentDAO
{
        Connection con;
        StudentDAO()
        {
            // Set Connection
        	
        	try {
        		Class.forName("oracle.jdbc.driver.OracleDriver");   //Load Driver
        		//Establishing connection with database
        		
        			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521: XE","hr","hr");
        	}

   		 catch (SQLException e) {
   			e.printStackTrace();
   		}
   			
        	catch (ClassNotFoundException e) {
        		e.printStackTrace();
        	}
        }
        String addStudent(Student s) throws SQLException
        {
            //save student to db
        	PreparedStatement ps= con.prepareStatement("insert into Student values(?,?,?,?)");
    	    ps.setInt(1, s.getId());
    	    ps.setString(2, s.getName());
    	    ps.setString(3, s.getDob());
    	    ps.setString(4, s.getCollegeName());
    	   int count= ps.executeUpdate();
    	    if(count>0) {
    			 return "Data Saved Successfully..."; 
    		  }
    		    return "Invalid ProductID";
            
        }
        List<Student> getStudents()
        {
            //get all student data, store them in List and return
            return null;
        }
boolean addCourse(Course c) throws SQLException {
	PreparedStatement ps= con.prepareStatement("insert into Course values(?,?,?,?)");
    ps.setInt(1, c.getId());
    ps.setString(2, c.getName());
    ps.setInt(3, c.getDuration());
    ps.setInt(4, c.getFees());
   int count= ps.executeUpdate();
   if(count>0) {
		 return true; 
	  }
	    return false;
  
	//return false;
}

}