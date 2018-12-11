package bank_manager;

public class Main {
    public static void main(String[] args){
        CertificateOfDeposit certificate = new CertificateOfDeposit();
        SavingsAccount savingAcct = new SavingsAccount();
        CheckingAccount checkAcct = new CheckingAccount();
        certificate.setAccountNumber("abc123");
        savingAcct.setAccountNumber("def456");
        checkAcct.setAccountNumber("ghi789");
        certificate.setBalance(123);
        savingAcct.setBalance(456);
        checkAcct.setBalance(789);
    }
}
