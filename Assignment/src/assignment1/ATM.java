package assignment1;

public interface ATM {
	public abstract void withdraw(int accountNumber,double amount);
	public abstract void changePassword(int accountNumber,String oldPassword,String newPassword);
	public abstract void checkBalance();

}
