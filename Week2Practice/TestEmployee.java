package Week2Practice;

public class TestEmployee {
    public static void main(String[] args) {

        Employee E1 = new Employee(1,"John","Robert",4500);
        Employee E2 = new Employee(2,"James","Robert",5000);

        System.out.println();
        System.out.println(E1);
        E1.raiseSalary(20);
        System.out.println(E1);

        System.out.println();
        System.out.println(E2);
        E2.raiseSalary(20);
        System.out.println(E2);
    }
    
}
