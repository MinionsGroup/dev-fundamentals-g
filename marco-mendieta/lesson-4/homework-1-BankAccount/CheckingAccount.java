public class CheckingAccount extends BankAccount {
    private String limit;

    public CheckingAccount(String account, String balance, String limit){
        super(account,balance);
        this.limit = limit;
    }
}
