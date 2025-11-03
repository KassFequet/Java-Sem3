package Week6;

public interface AnimalInt {
    static final double g = 10.0;
    //constants
    //list of abstract methods
    //cannot have instance variables
    //default methods
    //cannot hacve concrete method definitions
    //cannot have constructors
    public abstract void move();
    void sleep();
    default static void display("Hello");

    
}
