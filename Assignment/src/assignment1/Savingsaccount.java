package assignment1;

public  class Savingsaccount extends Account{
	int minimumbalance = 1000;
	
	public void show_savings_account() {

		System.out.println("Minimum Balance" + minimumbalance);
	}
	public void withdraw(int amount) {
		int balance=minimumbalance - amount;
		System.out.println("Account balance is "+balance );
	}

}
