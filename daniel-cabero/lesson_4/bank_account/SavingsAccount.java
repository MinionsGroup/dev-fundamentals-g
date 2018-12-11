package lesson_4.bank_account;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
public class SavingsAccount extends BankAccount {
    int transfer;

    public SavingsAccount(int transfer,String acctNumber,double balance) {
        super(acctNumber, balance);
        this.balance = balance;
        this.transfer = transfer;

    }

    public int getTransfer() {
        return transfer;
    }
}
