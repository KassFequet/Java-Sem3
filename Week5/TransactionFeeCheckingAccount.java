package Week5;

public class TransactionFeeCheckingAccount  extends CheckingAccount {

    private static final double FEE = 2.00;

    public TransactionFeeCheckingAccount() {
    }

    public TransactionFeeCheckingAccount(double interest) {
        super(interest);
    }

        public TransactionFeeCheckingAccount(double interest, double amount) {
        super(interest, amount);
    }

    public void chargeFee(){
        withdraw(FEE);
    }

    public void deposit(double amount)
    {
        if((super.getBalance()+amount) >= FEE)
        {
            this.chargeFee();
            super.deposit(amount);
        }
        else System.out.println("Not enough funds to cover fee");
    }

    public void withdraw(double amount){
        super.withdraw(amount + FEE);
    }

    public String toString(){
        return ("TFCA " + super.toString() + " TFCA Fee: " + FEE );
    }

    
}
