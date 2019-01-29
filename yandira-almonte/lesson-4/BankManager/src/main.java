
public class main {
	public static void main(String[] args) {
	CheckingAccount checkAcc=new CheckingAccount();
	COD cod= new COD();
	SavingAccount saveAcc=new SavingAccount();
	
	checkAcc.account=10;
	checkAcc.balance=100;
	
	cod.account=123;
	cod.balance=192;
	
	saveAcc.account=1039;
	saveAcc.balance=900;
	
	checkAcc.printAccount();
	cod.printAccount();
	saveAcc.printAccount();
	
	}
}
