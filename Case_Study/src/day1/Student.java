package day1;

public class Student {
	private int id;
	private String name;
    private String dob;
    private static String Collegename;
    int PhoneNo[]=new int[10];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int[] getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int[] phoneNo) {
		PhoneNo = phoneNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public static String getCollegename() {
		return Collegename;
	}
	public static void setCollegename(String collegename) {
		Collegename = collegename;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
}
