import java.util.Date;

public class CertificateOfDeposit extends BankAccount {

    private Date expiry;

    public CertificateOfDeposit(String account, double balance, Date expiry) {
        super(account, balance);
        this.expiry = expiry;
    }

    public Date getExpiry() {
        return this.expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}
