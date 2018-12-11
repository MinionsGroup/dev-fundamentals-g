

public class CheckingAccount extends BankAccount {

    private double limit;

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);
        this.setLimit(limit);
    }

    public double getLimit() {
        return this.limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
