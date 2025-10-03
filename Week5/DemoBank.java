package Week5;

public class DemoBank {
    public static void main(String[] args) {
        BankAccount BA = new BankAccount(1000);
        CheckingAccount Ch1 = new CheckingAccount(0.4, 2000);
        TransactionFeeCheckingAccount TFCA = new TransactionFeeCheckingAccount();
        TransactionFeeCheckingAccount TFCA1 = new TransactionFeeCheckingAccount(.4);
        TransactionFeeCheckingAccount TFCA2 = new TransactionFeeCheckingAccount(.4, 3000);

        System.out.println("Bank Account: " + BA);
        System.out.println("Checking Account: " + Ch1);
        System.out.println("Transaction Fee Checking Account: " + TFCA);
        System.out.println("Transaction Fee Checking Account 1: " + TFCA1);
        System.out.println("Transaction Fee Checking Account 2: " + TFCA2);
    }
}
