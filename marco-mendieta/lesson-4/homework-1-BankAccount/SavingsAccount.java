public class SavingsAccount extends BankAccount {
    private String transfers;

    public SavingsAccount(String account, String balance, String transfers){
        super(account,balance);
        this.transfers = transfers;
    }
}
