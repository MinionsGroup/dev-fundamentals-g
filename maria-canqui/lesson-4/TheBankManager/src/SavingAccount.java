public class SavingAccount extends BankAccount {
    private double limit;
    public SavingAccount(double limit, String account, double balance) {
        super(account, balance);
        this.limit = limit;
    }
}
