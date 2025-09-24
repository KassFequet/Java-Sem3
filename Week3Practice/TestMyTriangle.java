package Week3Practice;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(2, 3, 3, 1, 1, 2);
        MyTriangle t2 = new MyTriangle(new MyPoint(4, 5), new MyPoint(5, 7), new MyPoint(1, 5));

        System.out.println("Triangle 1 = " + t1);
        System.out.println("Triangle 2 = " + t2);

        System.out.println("Triangle 1 Perimeter = " + t1.getPerimeter());
        System.out.println("Triangle 2 Perimeter = " + t2.getPerimeter());

        System.out.println("Triangle 1 Type = " + t1.getType());
        System.out.println("Triangle 2 Type = " + t2.getType());
    }
}
