package day3;
import java.util.Scanner;

public class stringexample {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String vowels="aeiouAEIOU";
		for(int i=0;i<str.length();i++) {
		String x=str.substring(i, i+1);
		int y=str.charAt(i);
		if(vowels.contains(x)) {
		System.out.print(x);
		}else if(y==90 || y==122){
		System.out.print((char)(y-25));
		}else {
		System.out.print((char)(y+1));
		}
		}
		}

	  	}


