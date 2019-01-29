
public class BankAccount {
	protected int account;
	protected int balance;

	public BankAccount() {
		account = 0;
		balance = 0;
	}
	
	public void printAccount(){
		System.out.println("Account:"+account+" Balance:"+balance);
	}
}
