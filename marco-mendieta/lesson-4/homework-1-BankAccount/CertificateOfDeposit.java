public class CertificateOfDeposit extends BankAccount {
    public String expires;
    public CertificateOfDeposit(String account, String balance, String expires){
        super(account,balance);
        this.expires = expires;
    }
}
