package Daytwo;

class execute {
	String bankCode;
	String bankName;
	
	void deposit() {
		System.out.println("Deposit Money");
	}
	void withdraw() {
		System.out.println("Withdraw Money");
	}
		
}

class ICICIBank extends execute
{
	void setDetails() {
		//double interest=10.7;
		bankCode="hhuh";
		bankName="ICICI";
	}
	void deposit()
    {
        System.out.println("Deposit Money in ICICI");
    }
	void display() {
		System.out.println("ID "+bankCode+" BankName "+bankName);
	}
}


public class Bank {
	public static void main(String[] args) {
		   ICICIBank ic1=new ICICIBank();
	        ic1.setDetails();
	        ic1.deposit();
	        ic1.withdraw();
	        ic1.display();
}
}

