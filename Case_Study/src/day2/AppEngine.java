package day2;
import java.util.Scanner;
public class AppEngine 
{
	  Scanner sc= new Scanner(System.in);
      public Course[] introduce(Course course[],int pos) 
      {
          //Read Course details from the user ,
    	

    	  Course c=new Course();
    	  
    		  System.out.println("Enter Course Id");
    		  c.setId(sc.nextInt());
    		  System.out.println("Enter Course Name");
    		  c.setName(sc.next());
    		  System.out.println("Enter duration");
    		  c.setDuration(sc.nextInt());
    		  System.out.println("Enter Fees");
    		  c.setFees(sc.nextInt());
    		  course[pos]=c;
    		
    	  
    	     //add Course Object to the array and return 
    	  

        return course; 
      }
 
      public Student[] register(Student student[],int pos)
      { 
          //Read Student details from the user ,
    	  Student so = new Student();
          System.out.println("Enter Student ID");
          so.setId( sc.nextInt());
          System.out.println("Enter Student Name");
          so.setName(sc.next());
          System.out.println("Enter Dob");
          so.setDob(sc.next());
          System.out.println("Enter Student College Name");
          so.setCollegeName(sc.next());
          student[pos] = so;
          //add Student Object to the array and return 

        return null; 
      }
 
      public void listOfStudents(Student[] students)
      { 
          //Display the students array passed as arguments
    	  System.out.println("<----List of Courses---->");
    	  for( Student i :students){
    		  if((i!=null)) {
        		  System.out.println(i.toString());
    	  }
      }
      }

      public void listOfCourses(Course[] courses,int pos)
      {
        //Display the courses array passed as arguments
    	  System.out.println("<----List of Courses---->");
    	  for( Course i :courses){
    		  if((i!=null)) {
        		  System.out.println(i.toString());
    	  }
      }
      }
      public Enroll[] enroll(Enroll[] enrollments , Student[] student, Course[] course,int pos)
      {
        // Add the Student and Course to enrollment array and return  
        return null;

      }
 
      public void listOfEnrollments(Enroll[] enrollments) 
      {
        //Display the enrollment array passed as arguments
    	  for(int i=0;i<5;i++) {
    		  
    	  }
      }
}
