package Daytwo;

public class wrapper {

	public static void main(String[] args) {
		int  num =100;
		Integer n=new Integer(num);
		Integer m=num;  // Autoboxing
		int x =n.intValue(); //unwrapping //unboxing
		
		System.out.println(n);
		String no ="1000";
		
		int r= Integer.parseInt(no);
		
		System.out.println();
		int x1=100;
		String a= Integer.toString(x1); //way1
		String b=String.valueOf(x1); //way 2
		String c=""+x1; //way3
				
		
	}
	
}
