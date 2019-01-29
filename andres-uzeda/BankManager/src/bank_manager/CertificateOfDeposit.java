package bank_manager;

import java.util.Date;

public class CertificateOfDeposit extends BankAccount {
    private Date expires;

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }
}
