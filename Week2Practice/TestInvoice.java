package Week2Practice;

public class TestInvoice {
    public static void main(String[] args) {
        Invoice inv1 = new Invoice("1", "Milk", 5, 4.99);
        Invoice inv2 = new Invoice("2", "Apple", 2, 0.99);
        Invoice inv3 = new Invoice("3", "Bread", 6, 3.99);
        Invoice inv4 = new Invoice("4", "Bananas", 5, 2.99);
        Invoice inv5 = new Invoice(inv4);

        System.out.println();
        System.out.println(inv1);
        System.out.println(inv2);
        System.out.println(inv3);
        System.out.println(inv4);
        System.out.println();
        System.out.println(inv5);

        System.out.println();
        System.out.println("Total invoices: " + Invoice.InvoiceCount());
    }
}
