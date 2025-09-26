package Week4;
import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args)
    {
        ArrayList<String> obj = new ArrayList<String>(10);
        System.out.println(obj.size());
        obj.add("One");
        System.out.println(obj.size());
        obj.add("Two");
        System.out.println(obj.size());
        ArrayList<Person> PersonList = new ArrayList<>();
        Person p1 = new Person("Kevin", "Green");
        PersonList.add(p1);
        PersonList.add(new Person("Brandon", "Maloney"));
        System.out.println(PersonList);
        PersonList.add(0, new Person("Cameron", "Boyer"));
        for(int i = 0;i<PersonList.size(); i++){
            System.out.println(PersonList.get(i));
        }

    }
    
}
