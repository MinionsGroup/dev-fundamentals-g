public class BankAccount {
    private String account;
    private String balance;

    public BankAccount(String account, String balance){
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public String getBalance() {
        return balance;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
