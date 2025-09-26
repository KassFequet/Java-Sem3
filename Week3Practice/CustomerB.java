package Week3Practice;

public class CustomerB {
    private int ID;
    private String name;
    private char gender;

public CustomerB(int ID, String name, char gender){
    this.ID = ID;
    this.name = name;
    if (gender == 'm' || gender == 'f') {
        this.gender = gender;
    } else {
        System.out.println("Invalid gender - Set to 'm' or 'f' only - Setting to 'x' as invalid");
        this.gender = 'x';
    }
}

    public int getID(){
        return ID;
    }

    public String getName(){
        return name;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        return ("Customer Name: " + name + " Customer ID: " + ID + " Customer Gender: " + gender);
    }

}
