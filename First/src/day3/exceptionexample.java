package day3;
import java.util.Scanner;
class SalaryNegativeException extends Exception
{
	public SalaryNegativeException(String message) 
	{
		super(message);
	}
}
class SalaryRangeBreakException extends Exception
{
	public SalaryRangeBreakException(String message) 
	{
		super(message);
	}
}
class VerifySalary
{
	void verify(int salary) throws SalaryNegativeException,SalaryRangeBreakException {
		if(salary<0)
			throw new SalaryNegativeException("Salary can't be negative");
		else if(salary > 5000)
			throw new SalaryRangeBreakException("Salary can't be above 5000");
		else
			System.out.println("Salary is correct");
		
	}
}


public class exceptionexample {
 public static void main(String[] args) {
	 VerifySalary va=new VerifySalary(); 
	 Scanner sc= new Scanner(System.in);
     try {
    	 System.out.println("Enter Salary :");
         va.verify(sc.nextInt());
     } catch (SalaryNegativeException e)
     {
     System.out.println(e.getMessage());
     }
     catch (SalaryRangeBreakException f)
     {
     System.out.println(f.getMessage());
     }
}
}
