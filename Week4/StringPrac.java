package Week4;

public class StringPrac {
    public static void main(String[] args) {
        String st1 = "Hello World";
        String message = new String("Welcome to Java");
        String s = new String();

        String s1 = new String("Welcome");
        String s2 = "welcome";
        String s3 = "Welcome";

        // if (s3.equals(s2)){
        //     System.out.println("Contents are same");
        // }

        // if (s3 == s2){
        //     System.out.println("References are same");
        // }

        if (s1.compareTo(s2) > 0)
        System.out.println("s1 is greater than s2");
        else if (s1.compareTo(s2) == 0){
            System.out.println("s1 is equal to s2");
        }
        else{
            System.out.println("s1 is less than s2");
        }
    }
    
}
