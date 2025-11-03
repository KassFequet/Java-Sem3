package Week6;

public abstract class Animal implements AnimalInt, TempInt{
    //abstract is a non access modifier
    //you cannot instantiate an abstract class
    //abstract class can can have attributes and constructors
    //can have abstract methods and regular methods

    private String name;
    private String species;
    private int age;

    Animal(String n, String s, int a)
    {
        this.name = n;
        this.species = s;
        this.age = a;
    }

    public abstract void greet();

    public abstract void eat();

    //set and get methods
    //toString
    //other methods

    public String toString()
    {
        return (this.name + " " + this.species + " " + this.age);
    }
    
    public void move(){
        System.out.println("Animals can move");
    }
    public void sleep(){
        System.out.println("All Animals sleep");
    }
}
