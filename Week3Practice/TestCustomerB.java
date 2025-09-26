package Week3Practice;

public class TestCustomerB {
    public static void main(String[] args) {
        CustomerB c1 = new CustomerB(1, "Alice", 'f');
        CustomerB c2 = new CustomerB(2, "Bob", 'm');
        CustomerB c3 = new CustomerB(3, "Charlie", 'x');

        System.out.println();
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println();
        System.out.println("Name: " + c1.getName());
        System.out.println("ID: " + c1.getID());
        System.out.println("Gender: " + c1.getGender());
    }
}
