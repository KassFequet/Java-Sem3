//A first program in java

import java.util.Scanner;
public class Welcome{


    public static void main(String[] args) {

        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        a = input.nextInt();
        System.out.println("Enter another integer: ");
        b = input.nextInt();
        c = a+b;
        System.out.println("Sum = " + c );
        input.close();
        
        //System.out.println("Hello world");

        int num1 = 10;
        int num2 = 20;

        int result = 0;

        result = num1 + num2;
        System.out.println(result);
        System.out.printf("Sum = %d",num1,num2, result);

        //double String float char
 

    }

}