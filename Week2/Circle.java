package Week2;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private static int count = 0;

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
        double Area = Math.PI * this.radius * this.radius;
        display();
        return (Area);
    }

    // public static void main(String[] args) {
    //     Circle C1 = new Circle();
    //     Circle C2 = new Circle(5);
    //     C1.color = "orange";
    // }
    public static void display()
    {
        System.out.println(count);
    }
    public String toString()
    {
        return("Circle radius: " + this.radius + " and color is: " + this.color + " Count = " + count);
    }


}
