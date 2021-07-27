package day2;
import  java.util.Scanner;

public class AppMain {
	 
    public static void main(String[] args) {

        System.out.println("Welcome To Student App");
        Scanner sc=new Scanner(System.in);

        Student students[]=new Student[10];
        int studcount=0;
        Course course[]=new Course[5];
        int coursecount=0;
        Enroll enroll[]=new Enroll[10];
        int enrollcount=0;

        while(true)
        {
            System.out.println("...Menu...");
            System.out.println("1.New Student");
            System.out.println("2.Show Students");
            System.out.println("3.New Course");
            System.out.println("4.Show Courses");
            System.out.println("5.Enroll Student");
            System.out.println("6.Show Entrollments");
            System.out.println("0.Exit");
            System.out.println("Enter Your Choice");
            int choice=sc.nextInt();

            switch(choice)
            {
            case 1:
                    //Call AppEngine.register method.
                    //students=new AppEngine().register(students,studcount);
                StudentDAO sa=new StudentDAO();
                
                sa.addStudent();  
            	break;
            case 2:
                    new AppEngine().listOfStudents(students);
                    break;
            case 3:       
            	 course=new AppEngine().introduce(course,coursecount);
                 break;
            case 4:
            	 new AppEngine().listOfCourses(course,coursecount);
                 break;
            case 5:
            	 enroll=new AppEngine().enroll(enroll,students,course,enrollcount);
                 break;
            case 6:
            	new AppEngine().listOfEnrollments(enroll);
                break;
            case 0:
                System.exit(0);

            }
        }
 
    }
 
}
