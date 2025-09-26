package Week3Practice;

public class TestCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Frank Allen", 15);

        System.out.println("Name: " + c1.getName());
        System.out.println("ID: " + c1.getID());
        System.out.println("Discount: " + c1.getDiscount());

        c1.setDiscount(10);
        System.out.println("New Discount: " + c1.getDiscount());

        System.out.println(c1.toString());
    }
    
}
