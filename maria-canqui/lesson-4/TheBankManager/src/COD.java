public class COD extends BankAccount {
    private double limit;
    public COD(double limit, String account, double balance) {
        super(account, balance);
        this.limit = limit;
    }
}
