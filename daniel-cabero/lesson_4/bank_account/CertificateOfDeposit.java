package lesson_4.bank_account;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
public class CertificateOfDeposit extends BankAccount {
    String expired;

    public CertificateOfDeposit(String dateExpired, String acctNumber, double balance) {
        super(acctNumber, balance);
        this.balance = balance;
        expired = dateExpired;

    }

    public String getExpired() {
        return expired;
    }
}
