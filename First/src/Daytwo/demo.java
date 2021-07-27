package Daytwo;

public class demo {
	public static void main(String[] args) {
		 String pat ="A001";
		 int num =Integer.parseInt(String.valueOf(pat.charAt(3)));
		 for(int x=1;x<=5;x++)
		 {
			 System.out.println("A00"+(num+x));
		 }
		 
		 
		 String inp="ABC1234";
		 int sum=0;
		 for(char ch:inp.toCharArray())
		 {
			 if(Character.isDigit(ch)) {
				 sum=sum+Character.getNumericValue(ch);
			 }
		 }
		 
		 System.out.println("Sum is"+sum);
		 char ch;
		 for(int x=0;x<inp.length();x++){
			 ch=inp.charAt(x);
		 }
		 
	}
}
