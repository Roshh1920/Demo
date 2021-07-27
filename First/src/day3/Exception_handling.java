package day3;


public class Exception_handling {
 public static void main(String[] args) {
	 int arr[]= {10,5,0,2};
	 int res=0;
	 try
	 {
		 res =arr[0]/arr[2];
	 }
	 catch(Exception e)
	 {
		 System.out.println("Error Came : "+ e.getMessage());
	 }
	 finally {
		 System.out.println(" Result is "+res);
	 }
}
}
