package lesson_4.bank_account;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
public class CheckingAccount extends BankAccount  {
    int limit;

    public CheckingAccount(int limit,String acctNumber,double balance) {
        super(acctNumber, balance);
        this.balance = balance;
        this.limit = limit;


    }

    public int getLimit() {
        return limit;
    }
}
