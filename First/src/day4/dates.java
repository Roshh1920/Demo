package day4;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class dates {
 public static void main(String[] args) throws ParseException {
	 
	/*  
	Date d = new Date();
	System.out.println(d);

	DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.US);
	String fo = df.format(d);
	System.out.println(fo);
	//Date to String
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	String d1 = df.format(d);
	System.out.println(d1);
	//String to date
	SimpleDateFormat sd2 = new SimpleDateFormat("dd-MM-yyyy");
	Date obj =null;
	try {
		obj=sd2.parse("14/11/1983");
	}catch (ParseException e) {
		e.printStackTrace();
	}
	System.out.println(obj);
	
	SimpleDateFormat sd = new SimpleDateFormat("EEEE");
	String d2 = df.format(d);
	System.out.println(d2);
	*/
	  String var="15-07-2021";
      SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
      Date obj=null;
      obj=sdf1.parse(var);

      SimpleDateFormat sdf2=new SimpleDateFormat("EEEE");
      String dayName=sdf2.format(obj);
      System.out.println(dayName);
	
	
	
}
}