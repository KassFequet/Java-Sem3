package Week3Practice;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c = new MyCircle(1, 2, 3);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Center: " + c.getCenter());
        System.out.println("CenterX: " + c.getCenterX());
        System.out.println("CenterY: " + c.getCenterY());
        int[] xy = c.getCenterXY();
        System.out.println("CenterXY: (" + xy[0] + ", " + xy[1] + ")");

        c.setRadius(13);
        c.setCenter(new MyPoint(7, 9));
        c.setCenterX(7);
        c.setCenterY(8);
        c.setCenterXY(9, 10);

        System.out.println("After setting values:");
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Center: " + c.getCenter());
        System.out.println("CenterX: " + c.getCenterX());
        System.out.println("CenterY: " + c.getCenterY());
        xy = c.getCenterXY();
        System.out.println("CenterXY: (" + xy[0] + ", " + xy[1] + ")");

        System.out.println("toString: " + c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());

        MyCircle c2 = new MyCircle(4, 8, 8);
        System.out.println("Distance to another circle: " + c.distance(c2));
    }
}
