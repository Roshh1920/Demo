package day3;
import java.util.*;

public class set {

	public static void main(String[] args) {
		 String input="appleeerww";
    Set s=new TreeSet(); // RAWs
        for(char ch: input.toCharArray())
        {
            s.add(ch);
        }
    String res="";
        for(Object o : s)
        {
            res=res+o.toString();
        }

        System.out.println(res);

	}

}
