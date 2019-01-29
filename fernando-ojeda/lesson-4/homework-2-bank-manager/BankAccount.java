package bank;

public class BankAccount {
    protected String account;
    protected double balance;

    public BankAccount(String account, double balance){
        this.account = account;
        this.balance = balance;
    }

    public String getAccount(){
        return this.account;
    }

    public double getBalance(){
        return this.balance;
    }
}
