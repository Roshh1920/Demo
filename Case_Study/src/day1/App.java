package day1;
import java.util.Scanner;

public class App {
	
		
		 void scenario1()
		{
			Student student=new Student();
			Info dis = new Info();
			dis.display(student);		
		}
		
		
		void scenario2()
		{
			Student stu[]=new Student[2];
			stu[0]=new Student();
			stu[0].setId(101);
			stu[0].setName("John");
			stu[0].setDob("14/10/1999");
			stu[0].setPhoneNo(null);
			Info in = new Info();
			stu[1]=new Student(102,"Rashi","19/3/1998");
			for(Student x:stu) {
				in.display(x);
			}
		}
		
		
		
		void scenario3() {
			Scanner s = new Scanner(System.in);
			Student stu[]=new Student[2];
			for( Student x:stu) {
			System.out.println("Enter Id,name and dob");
			int Id =s.nextInt();
			String name = s.next();
			String dob = s.next();
			}
			Info in = new Info();
			for(Student x:stu) {
				in.display(x);
			}
			
	       
	
		}
		}
