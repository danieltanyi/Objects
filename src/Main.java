public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("My Self",10000);

        bankAccount.withdraw(500);
        bankAccount.deposit(8000);
        bankAccount.withdraw(4000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());

    }
}