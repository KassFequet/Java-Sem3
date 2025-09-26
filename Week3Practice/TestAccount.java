package Week3Practice;

public class TestAccount {
    public static void main(String[] args) {
        CustomerB c1 = new CustomerB(1, "John Doe", 'm');
        Account a1 = new Account(13, c1, 400.0);

        System.out.println(a1.toString());
        System.out.println("Name: " + a1.getCustomerName());
        System.out.println("Account ID: " + a1.getID());
        System.out.println("Balance: $" + String.format("%.2f", a1.getBalance()));
        System.out.println(a1.getCustomer());

        a1.setBalance(500.00);
        System.out.println("New Balance: $" + String.format("%.2f", a1.getBalance()));

        a1.deposit(100.00);
        System.out.println("After Deposit Balance: $" + String.format("%.2f", a1.getBalance()));

        a1.withdraw(100.00);
        System.out.println("After Withdraw Balance: $" + String.format("%.2f", a1.getBalance()));

    }
    
}
