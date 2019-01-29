package bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] arg) {
        BankAccount savingAccount = new SavingsAccount("123-456", 999, 3 / 6);
        BankAccount checkingAccount = new CheckingAccount("333-111", 500, 9000);
        BankAccount certificateOfDeposit = new CertificateOfDeposit("975-579", 12000, getDate());

        System.out.printf("Saving Account: \n" + "account = " + savingAccount.getAccount() + " , " + " balance = " +
                savingAccount.getBalance() + " , " + " transfers = " + ((SavingsAccount) savingAccount).getTransfers() + "\n");

        System.out.printf("Cheching Account: \n" + "account = " + checkingAccount.getAccount() + " , " + " balance = " +
                checkingAccount.getBalance() + " , " + " limit = " + ((CheckingAccount) checkingAccount).getLimit() + "\n");

        System.out.printf("Saving Account: \n" + "account = " + certificateOfDeposit.getAccount() + " , " +
                " balance = " + certificateOfDeposit.getBalance() + " , " + " expiry = " +
                ((CertificateOfDeposit) certificateOfDeposit).getExpiry() + "\n");
    }

    private static Date getDate() {
        Date fechaConHora = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String stringFechaConHora = "2018-09-15";
        try {
            fechaConHora = sdf.parse(stringFechaConHora);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fechaConHora;
    }
}
