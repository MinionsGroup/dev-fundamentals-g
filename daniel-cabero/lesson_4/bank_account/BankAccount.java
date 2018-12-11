package lesson_4.bank_account;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
public class BankAccount {
    String acctNumber;
    double balance;

    public BankAccount(String acctNumber, double balance) {
        this.acctNumber = acctNumber;
        this.balance = balance;

    }

    public String getAcctNumber() {
        return acctNumber;
    }

    public double getBalance() {
        return balance;
    }
}
