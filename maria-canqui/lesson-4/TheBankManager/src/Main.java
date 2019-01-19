public class Main {
    public static void main (String [] args) {
        SavingAccount saving = new SavingAccount(9000,"123-456", 999);
        COD cod = new COD(9000,"123-456", 999);
        CheckingAccount checking = new CheckingAccount(9000,"123-456", 999);

        saving.setAccount("789-456");
        saving.setBalance(1000);
        System.out.println("Account: "+saving.getAccount()+" Balance: "+saving.getBalance());

        cod.setAccount("789-456");
        cod.setBalance(1000);
        System.out.println("Account: "+cod.getAccount()+" Balance: "+cod.getBalance());

        checking.setAccount("789-456");
        checking.setBalance(1000);
        System.out.println("Account: "+checking.getAccount()+" Balance: "+checking.getBalance());
    }
}
