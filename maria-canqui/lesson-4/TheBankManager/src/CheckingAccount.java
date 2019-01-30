public class CheckingAccount extends BankAccount {
    private double limit;
    public CheckingAccount(double limit, String account, double balance) {
        super(account, balance);
        this.limit = limit;
    }
}
