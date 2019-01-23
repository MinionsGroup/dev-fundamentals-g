package bank_exercise;

public class CertificateOfDeposit extends BankAccount {
    private String expireDate;

    public CertificateOfDeposit(String account, double balance, String expireDate) {
        super(account, balance);
        this.expireDate = expireDate;
    }
}
