package lesson_4.bank_account;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
public class Main {

    public static void main(String[] args){
        BankAccount checkinAccount = new CheckingAccount(2,"12",100);
        BankAccount savingsAccount= new SavingsAccount(6,"20",3);
        BankAccount certificateOfDeposit = new CertificateOfDeposit("1-1-2018","3",200);

        System.out.println(checkinAccount.acctNumber);
        System.out.println(savingsAccount.acctNumber);
        System.out.println(certificateOfDeposit.acctNumber);

    }
}
