package Daytwo;
import java.util.Scanner;

public class Dry {
	int empno;
	String name;
	double salary;
	
	void accept()
	{

		System.out.println("Enter empno,name,salary");
		Scanner sc=new Scanner(System.in);
		empno = sc.nextInt();
		name = sc.next();
		salary=sc.nextDouble();
		sc.close();
	
	}
	void display() {
		System.out.println("Data are");
		System.out.println(empno+" " + name+" "+salary);
	}
	
	public static void main(String[] args)
	{
		Dry d=new Dry();
		d.display();
		d.accept();
	}
	
}
