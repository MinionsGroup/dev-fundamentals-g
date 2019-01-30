public class Main {

    public static void main(String[] arg) {
        BankAccount savingAccount = new SavingsAccount("first", "100", "50");
        BankAccount checkingAccount = new CheckingAccount("second", "200", "1000");
        BankAccount certificateOfDeposit = new CertificateOfDeposit("third", "300", "01/01/2018");

        // Make sure you can access the account and balance.

        savingAccount.setAccount("firstUpdated");
        savingAccount.setBalance("1000");

        checkingAccount.setAccount("secondUpdated");
        checkingAccount.setBalance("2000");

        certificateOfDeposit.setAccount("thirdUpdated");
        certificateOfDeposit.setBalance("3000");

        System.out.println("Account: " + savingAccount.getAccount());
        System.out.println("balance: " + savingAccount.getBalance());

        System.out.println("Account: " + checkingAccount.getAccount());
        System.out.println("balance: " + checkingAccount.getBalance());

        System.out.println("Account: " + certificateOfDeposit.getAccount());
        System.out.println("balance: " + certificateOfDeposit.getBalance());
    }
}
