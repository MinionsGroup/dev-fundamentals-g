package bank_exercise;

public class SavingsAccount extends BankAccount {
    private int transfers;

    public SavingsAccount(String account, double balance, int transfers) {
        super(account, balance);
        this.transfers = transfers;
    }
}
