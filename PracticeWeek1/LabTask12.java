package PracticeWeek1;
import java.util.Scanner;

public class LabTask12 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1, num2, num3 ,num4, num5;

    System.out.print("Enter the first number: ");
    num1 = input.nextInt();
    System.out.print("Enter the second number: ");
    num2 = input.nextInt();
    System.out.print("Enter the third number: ");
    num3 = input.nextInt();
    System.out.print("Enter the fourth number: ");
    num4 = input.nextInt();
    System.out.print("Enter the fifth number: ");
    num5 = input.nextInt();

    int largest = num1;
    if (num2 > largest) largest = num2;
    if (num3 > largest) largest = num3;
    if (num4 > largest) largest = num4;
    if (num5 > largest) largest = num5;

    System.out.println("The largest number is: " + largest);

    input.close();
    }
    
}
