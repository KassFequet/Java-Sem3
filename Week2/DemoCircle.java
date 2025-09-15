package Week2;

public class DemoCircle {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        // System.out.println(C1.toString());
        Circle C2 = new Circle(5);
        // System.out.println(C2.toString());
        
        Circle C3 = new Circle(5,"yellow");
        Circle C4 = new Circle("Pink");
        Circle C5 = new Circle();
        Circle C6 = new Circle(C5);

        System.out.println(C1);
        System.out.println(C2);
                System.out.println(C3);
        System.out.println(C4);
                System.out.println(C5);
        System.out.println(C6);

        Circle.display();

        System.out.println(C1.getArea());
        System.out.println(C2.getArea());
    }
    
}
