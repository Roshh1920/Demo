package day3;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class prac {
	List ar=new ArrayList();
	List getNames(String input ) {
		
		StringTokenizer arr = new StringTokenizer(input,",");
		while(arr.hasMoreTokens())
		{
			String text = arr.nextToken();
			text=text.substring(0,1).toUpperCase()+text.substring(1);
			ar.add(text);
		}
		
		
		return ar;
	}
	
String getname2(String input) {
	getNames(input);
	String result=" ";
	for(int x=0;x<ar.size()-1;x++) {
			 result=result+ar.get(x)+",";
    }
    result=result+ar.get(ar.size()-1);
    return result;    
	
}
	
public static void main(String[] args) {
	String input="ram,rahim,robert,farhan,aditi,reshma";
	System.out.println(new prac().getNames(input));
	System.out.println(new prac().getname2(input));
}
}
