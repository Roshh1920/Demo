package day3;

public class stringexample2 {
	
	
public static void main(String[] args) {
	String inp="123abc";
	String chars="";
	String nums ="";
	for(char c:inp.toCharArray()) {
		if(Character.isDigit(c))
			nums+=c;
		else if(Character.isLetter(c))
			chars+=c;
			
	}
	System.out.println(chars+nums);
}
}
