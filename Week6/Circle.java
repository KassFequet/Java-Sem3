package Week6;

public abstract class Circle extends GeometricObject {
    private double radius;

    //constructors
    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    //get and set radius

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void getRadius(double radius){
        this.radius = radius;
    }

    public void getDiameter(){
        2 * this.radius;
    }
    
    //toString
    public double getArea(){
        return (Math.PI * this.radius * this.radius);
    }


}
