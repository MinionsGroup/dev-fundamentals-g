package bank_exercise;

public class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;
    }
}
