package Week2Practice;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10.0f, 20.0f);
        Rectangle r2 = new Rectangle(13.0f, 7.0f);

        System.out.println();
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println();
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
        System.out.println();
    }
}

