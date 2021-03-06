package day4;
import java.util.*;
public class maps {
	
	Map<Character,Integer> getCharCount(String input){
		 Map<Character,Integer> res=new TreeMap<Character,Integer>();
		 for(char ch: input.toCharArray()) {
			 if(res.containsKey(ch))
				res.put(ch, res.get(ch)+1);
			 else
				 res.put(ch, 1);			 
		 }
		 
		 return res;
	}
	
	
	

	   List<String> getStudentNames(Map<String,Integer> input)
	    {
	//Logic to get a map as input , find the students who scored more than 70 and return their names
	        //as an arraylist.
	        List<String> names=new ArrayList<String>();
	        Set<String> keys=input.keySet();
	        for(String k:keys)
	        {
	            if(input.get(k)>70)
	                names.add(k);
	        }

	 

	        return names;
	    }
	    Map<String,String> evaluate(Map<String,Integer> input)
	    {
	//Logic to get a map as input, find the students who scored nore than 70 and return their names and 
	        //status  PASS/FAIL as a map . Names should be ordered. 
	        Map<String,String> res=new TreeMap<String, String>();
	        Set<String> keys=input.keySet();
	        for(String k:keys)
	        {
	            if(input.get(k)>70)
	                res.put(k, "PASS");
	            else
	                res.put(k, "FAIL");
	        }
	        return res;
	    }
	    
	    
	    
	
	public static void main(String[] args) {
		Map<String,Integer> data = new HashMap<String,Integer>();
		data.put("Hrithik", 90);
		data.put("Madhuri", 87);
		data.put("Fida", 67);
		data.put("Raunak", 56);
		data.put("Karthik", 75);
		System.out.println(new maps().getStudentNames(data));
		System.out.println(new maps().evaluate(data));
		System.out.println(new maps().getCharCount("Roshh"));

	}

	

}
