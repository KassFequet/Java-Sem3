package Week4Practice;
import java.util.*;

public class ArrayListExample {

   public static void main(String args[]) {

      /*Creation of ArrayList: I'm going to add String

       *elements so I made it of string type */

  ArrayList<String> obj = new ArrayList<String>();

  /*This is how elements should be added to the array list*/

  obj.add("Ajeet");

  obj.add("Harry");

  obj.add("Chaitanya");

  obj.add("Steve");

  obj.add("Anuj");

 

  /* Displaying array list elements */ 

  System.out.println("Currently the array list has following elements:"+obj); 

 

  /*Add element at the given index*/ 

  obj.add(0, "Rahul"); 

  obj.add(1, "Justin"); 

 

  /*Remove elements from array list like this*/ 

  obj.remove("Chaitanya"); 

  obj.remove("Harry"); 

 

  System.out.println("Current array list is:"+obj); 

 

  /*Remove element from the given index*/ 

  obj.remove(1); 

 

  System.out.println("Current array list is:"+obj);

  /* Used for updating an element. It replaces the element present at the specified index with the object o.*/
  obj.set(0, "Jamie");
  obj.set(1, "Ralph");

  System.out.println("Current array list is:"+obj);

    /* Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. */
  int indexOfSteve = obj.indexOf("Steve"); // returns 3
  int indexOfAjeet = obj.indexOf("Ajeet"); // returns -1 as it is not in the list

  System.out.println("Index of Steve is : " + indexOfSteve);
  System.out.println("Index of Ajeet is : " + indexOfAjeet);

/* Returns the element at the specified position in this list. and assigns it to str */
  String str = obj.get(2); // returns the element at index 2

    System.out.println("Element at index 2 is : " + str);

    int numberOfItems = obj.size(); // returns the number of elements in the list
    System.out.println("Number of elements in the list is : " + numberOfItems);

    boolean containsSteve = obj.contains("Steve"); // returns true if the list contains the specified element
    System.out.println("List contains Steve or not : " + containsSteve);

    obj.clear(); // removes all the elements from the list
    System.out.println("Current array list is:"+obj);

   } 

}
