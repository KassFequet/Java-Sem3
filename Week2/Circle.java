package Week2;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private static int count = 0;
    public static final double PI = 3.14;

    //if you havent provided any constructor than default constructor is used//

    //no argument constructor//
    public Circle()
    {
        this.radius = 1.0;
        this.color = "red";
        count++;
    }
    //parameterized constructor//
    public Circle(double r){
        this.radius = r;
        this.color = null;
        count++;
    }//copy constructor

    public Circle(Circle c)
    {this.color = c.color;
    this.radius = c.radius;
    count++;
}

    // //parameterized constructor//
    // public Circle(double r){
    //     this.radius = r;
    //     this.color = null;
            // count++;
    // }

    // //parameterized constructor//
    // public Circle(String c){
    //     this.color = c;
            // count++;
    // }

    public double getRadius()
    {
        return this.radius;
    }

    public double getArea()
    {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle C1 = new Circle();
        Circle C2 = new Circle(5.0);

        System.out.println("Area of c1: " + C1.getArea());
        System.out.println("Area of c2: " + C2.getArea());
    }
    public static void display()
    {
        System.out.println(count);
    }
    public String toString()
    {
        return("Circle radius: " + this.radius + " and color is: " + this.color + " Count = " + count);
    }


}
