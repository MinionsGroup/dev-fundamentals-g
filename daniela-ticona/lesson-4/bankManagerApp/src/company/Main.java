package company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CheckingAccount chekingA = new CheckingAccount();
        SavingsAccount savingA = new SavingsAccount();
        CertificateOfDeposit certificateOD = new CertificateOfDeposit();


        System.out.println(chekingA.account);
        System.out.println(savingA.balance);

    }
}
