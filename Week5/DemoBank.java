package Week5;

public class DemoBank {
    public static void main(String[] args) {

        SuperClass sup = new SuperClass();
        SubClass = sub = new SubClass();
        System.out.println(sup.message);
        System.out.println(sub.message);

        // BankAccount b2 = new CheckingAccount(0.06);
        // System.out.println(b2.getBalance());
        // Object o = new BackAccount();
        // b2.getInterest(); // This line will cause a compile-time error
        // CheckingAccount ch = new BankAccount(); // This line will cause a compile-time error


        // BankAccount BA = new BankAccount(1000);
        // CheckingAccount Ch1 = new CheckingAccount(0.4, 2000);
        // TransactionFeeCheckingAccount TFCA = new TransactionFeeCheckingAccount();
        // TransactionFeeCheckingAccount TFCA1 = new TransactionFeeCheckingAccount(.4);
        // TransactionFeeCheckingAccount TFCA2 = new TransactionFeeCheckingAccount(.4, 3000);

        // System.out.println("Bank Account: " + BA);
        // System.out.println("Checking Account: " + Ch1);
        // System.out.println("Transaction Fee Checking Account: " + TFCA);
        // System.out.println("Transaction Fee Checking Account 1: " + TFCA1);
        // System.out.println("Transaction Fee Checking Account 2: " + TFCA2);
    }
}
