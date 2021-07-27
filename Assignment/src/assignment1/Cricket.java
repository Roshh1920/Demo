package assignment1;
import java.util.Scanner;

public class Cricket {
	int balls[] = new int[30];
	int[] freq = new int[30];
	int count,s=0;
	Scanner sc = new Scanner(System.in); 
	
	 void inningstatistics() {
		 System.out.println("Enter runs : ");
		 for(int i=0;i<30;i++){
			 balls[i]=sc.nextInt();
			 s+=balls[i];
			 }
	 }
	 
	
	 
	 void count() {
		 int i;
		int visited =-1;
		 for( i=0;i<30;i++) {
			 count=1;
			 for(int j=i+1;j<30;j++) {
				 if(balls[i]==balls[j]) {
					 count++;
					freq[j]=visited; 
				 }
			}
			 
			if(freq[i]!=visited) {
			 freq[i]=count;
		 }
		 }
		 
		 for(int k=0;k<30;k++) {
				if(freq[k]!=visited) {
			System.out.println(balls[k]+ "  : " + freq[k]+ " times ");
			}
	 }
	 }
	 
	 public static void main(String[] args) {
		Cricket c= new Cricket();
		c.inningstatistics();
		System.out.println("Total runs Scored :  "+c.s);
		c.count();
		System.out.println("Runs per ball :" +c.s/30);
		
		}
	
	
}
