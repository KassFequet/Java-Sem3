package Week2Practice;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee (int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName (){
        return (this.firstName + " " + this.lastName);
    }

    public int getSalary(){
        return salary;
    }

    public void getSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return (this.salary * 12);
    }

    public int raiseSalary(int percent){
        double raise = this.salary * ((double)percent/100);
        this.salary = this.salary + ((int)raise);
        return this.salary;
    }

        public String toString()
    {
        return ("ID = " + this.id + " Name: " + this.getName() + " Salary = " + this.salary);
    }
    
}
