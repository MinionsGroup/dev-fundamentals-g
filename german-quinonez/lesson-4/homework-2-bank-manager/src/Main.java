import java.util.Date;

public class Main {

    public static void main(String[] arg) {
        BankAccount savingAccount = new SavingsAccount("111-222", 1000, 10);
        BankAccount checkingAccount = new CheckingAccount("333-444", 1000, 9999);
        BankAccount certificateOfDeposit = new CertificateOfDeposit("555-777", 2000, new Date());

        showAccount(savingAccount);
        showAccount(checkingAccount);
        showAccount(certificateOfDeposit);

    }

    private static void showAccount(BankAccount bankAccount) {
        System.out.println(String.format("Account number: %s", bankAccount.getAccount()));
        System.out.println(String.format("balance: s%", bankAccount.getBalance()));
    }
}
