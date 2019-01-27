public class MainTask1 {
    public static void main (String[] args) {
        CertificateOfDeposit cop = new CertificateOfDeposit();
        CheckingAccount checking = new CheckingAccount();
        SavingsAccount saving = new SavingsAccount();

        cop.account = "123-456-79";
        cop.balance = 521.1;

        checking.account = "147-258-369";
        checking.balance = 852.2;

        saving.account = "789-456-132";
        saving.balance = 789.5;

        System.out.println("CertificateOfDeposit account: " + cop.account);
        System.out.println("CertificateOfDeposit balance: " + cop.balance);
        System.out.println("CheckingAccount account: " + checking.account);
        System.out.println("CheckingAccount balance: " + checking.balance);
        System.out.println("SavingsAccount account: " + saving.account);
        System.out.println("SavingsAccount balance: " + saving.balance);
    }
}
