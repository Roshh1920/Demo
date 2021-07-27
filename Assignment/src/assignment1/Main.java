package assignment1;



public class Main {
public static void main(String[] args) {
		System.out.println("----------Assignment 1-------------");
		Account acc = new Account() {
			
			@Override
			public void withdraw(int amount) {
				// TODO Auto-generated method stub
				
			}
		};
		//setbankdetails s= new setbankdetails();
		//acc=s.setdetails(acc);
		acc.display(acc);
		System.out.println("----------Assignment 2-------------");
		Savingsaccount sa = new Savingsaccount();
		sa.show_savings_account();
		sa.display(acc);
		Currentaccount ca = new Currentaccount();
		ca.display(acc);
		ca.show_current_account();
		sa.withdraw(500);
		ca.withdraw(200);
		sbiatm sbi = new sbiatm();
		sbi.withdraw(3452678, 10000);
		sbi.checkBalance();
		sbi.changePassword(345678, "123@45678", "ddmmyy");
		iciciatm icici = new iciciatm();
		icici.withdraw(0, 0);
		icici.checkBalance();
		icici.changePassword(0, null, null);
		
		
}

}
