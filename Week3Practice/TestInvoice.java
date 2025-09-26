package Week3Practice;

public class TestInvoice {
    public static void main(String[] args) {
        Customer C1 = new Customer(100, "Alice Mutton", 25);
        Customer C2 = new Customer (101, "Bob Smith", 15);
        Invoice I1 = new Invoice(200, C1, 400.00);

        System.out.println("Invoice ID: " + I1.getID());
        System.out.println("Customer Name: " + I1.getCustomerName());
        System.out.println("Amount before discount: $" + I1.getAmount());
        System.out.println("Amount after discount: $" + I1.getAmountAfterDiscount());

        I1.setCustomer(C2);

        System.out.println("New Customer ID: " + I1.getCustomer().getID());
        System.out.println("New Customer Name: " + I1.getCustomerName());
        System.out.println("Amount before discount: $" + I1.getAmount());
        System.out.println("Amount after discount: $" + I1.getAmountAfterDiscount());

        I1.setAmount(200.00);
        System.out.println("New Amount after discount: $" + I1.getAmountAfterDiscount());
    }
    
}
