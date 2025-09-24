package Week3Practice;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        // MyPoint p1 = new MyPoint(3, 4);
        // MyPoint p2 = new MyPoint(3, 1);

        System.out.println(p1);
        
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2));         // distance(MyPoint another)
        System.out.println(p2.distance(p1));         // distance(MyPoint another)
        System.out.println(p1.distance(5, 6));  // distance(int x, int y)
        System.out.println(p1.distance());          // distance()
        System.out.println(p1.distance());          // distance()

        // System.out.println(p1.distance(5,6));
        // System.out.println(p1.distance(p2));
        // System.out.println(p1.distance());

    }
    
}
