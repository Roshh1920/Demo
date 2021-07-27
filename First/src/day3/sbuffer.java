package day3;
import java.util.StringTokenizer;


public class sbuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Mask");
		
		System.out.println(sb+"/"+sb.reverse());
		String fruits="apple,banana,carrot,orange";
		StringTokenizer str = new StringTokenizer(fruits,",");
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken());
		}
		
		String []frs=fruits.split("p");
		for(String f : frs) {
			System.out.println(f);
		}
	}

}
