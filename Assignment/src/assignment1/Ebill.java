package assignment1;
import java.util.Scanner;

public class Ebill {

	public static void main(String[] args){
		float stdprice = 1.20F;
		System.out.println("Enter Unit:");
		Scanner sc = new Scanner(System.in);
		int unit = sc.nextInt();
		sc.close();
		if(unit < 100) {
			System.out.println("Electricity Bill "+ unit*stdprice);
		}
		else if(unit>100 && unit<=300) {
			System.out.println("Electricity Bill "+ (unit-100)*2 + unit*stdprice);
		}
		else {
			System.out.println("Electricity Bill "+ (unit-100)*2 + unit*stdprice + (unit-300)*3);
		}
		}
	
}
