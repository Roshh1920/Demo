package assignment1;



public abstract class Account {
   private int accountNo= 12345;
   private float accountBalance=30000f;
   private String accountPassword="ddmmyyy";
   private String bankname="Sbi";
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public float getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(float accountBalance) {
	this.accountBalance = accountBalance;
}
public String getAccountPassword() {
	return accountPassword;
}
public void setAccountPassword(String accountPassword) {
	this.accountPassword = accountPassword;
}
public String getBankname() {
	return bankname;
}
public Account(int accountNo, float accountBalance, String accountPassword, String bankname) {
	super();
	this.accountNo = accountNo;
	this.accountBalance = accountBalance;
	this.accountPassword = accountPassword;
	this.bankname = bankname;
}
@Override
public String toString() {
	return "Account [accountNo=" + accountNo + ", accountBalance=" + accountBalance + ", accountPassword="
			+ accountPassword + ", bankname=" + bankname + "]";
}
public void setBankname(String bankname) {
	this.bankname = bankname;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}

Account display(Account acc)
{
	

    System.out.println("Account Info is ");
    System.out.println("Account No "+ acc.getAccountNo());
    System.out.println( "AccountBalance "+ acc.getAccountBalance());
    System.out.println("Account Password "+ acc.getAccountPassword());
    System.out.println("BanK Name "+ acc.getBankname());
	//	Account acc=new Account();
		acc.setAccountBalance(23456);
		acc.setAccountPassword("ddmmyyyy");
		acc.setAccountNo(25363828);
		acc.setBankname("Sbi");
		return acc;
	
}

public abstract void withdraw(int amount);
	
}
