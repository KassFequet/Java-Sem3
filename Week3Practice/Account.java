package Week3Practice;

public class Account {
    private int ID;
    private CustomerB customer;
    private double balance = 0.0;

    public Account(int ID, CustomerB customer, double balance){
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int ID, CustomerB customer){
        this.ID = ID;
        this.customer = customer;
    }

    public int getID(){
        return ID;
    }

    public CustomerB getCustomer(){
        return customer;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public String toString(){
        return ("Customer Name: " + getCustomerName() + " Customer ID: " + customer.getID() + " Account ID: " + ID + " Balance: $" + String.format("%.2f", balance));
    }

    public Account deposit(double amount){
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount deposited must be positive!");
        }
        return this;
    }

    public Account withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }
    
}
