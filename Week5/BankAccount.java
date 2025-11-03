package Week5;

public class BankAccount {
    private double myBal;
    private static int count;
    public BankAccount() {myBal = 0;}
    public BankAccount(double amount) {this.myBal = amount;}
    public double getBalance() {return myBal;}
    public String toString() {return ("Balance: " + this.myBal);}

    public void deposit(double amount)
    {
        int count = 0;
        count ++;
        this.myBal += amount;
    }

    public void withdraw(double amount)
    {
    if (this.myBal>= amount) this.myBal -= amount;
    else System.out.println("Insufficient Funds");
    }
    
}
