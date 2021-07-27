package Daytwo;
import java.util.Scanner;
public class Sum {
	
	

	
	public static void main(String[] args)
	{
	int sum=0;
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	for (int i=0;i<a.length();i++)
	{
	if (Character.isDigit(a.charAt(i)))
	{
	int j=Character.getNumericValue(a.charAt(i));
	sum=sum+j;
	}
	}
	System.out.println("Sum " +sum);

	//sc.close();
	}

	}

