package assignment1;

public class Currentaccount extends Account {
	int overdraftLimitAccount=2000;
	public void show_current_account() {
		System.out.println(" Over draft Limit Account " + overdraftLimitAccount);
	}
	public void withdraw(int amount) {
		int bal=overdraftLimitAccount - amount;
		System.out.println("Account balance is "+bal );
	}
}
