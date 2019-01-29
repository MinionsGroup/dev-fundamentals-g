
public class SavingsAccount extends BankAccount {

  private int transfers;

  public SavingsAccount(String account, double balance, int transfers) {
    super(account, balance);
    this.setTransfers(transfers);
  }

  public int getTransfers() {
    return transfers;
  }

  public void setTransfers(int transfers) {
    this.transfers = transfers;
  }
}
