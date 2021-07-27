package PackA;

public class Employee {
	String name ="Roshani";
	String city ="Pune";
	
	void displayData()
	{
		System.out.println("Names is "+name);
		System.out.println("City is "+city);
		
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.displayData();
	}
	
}
