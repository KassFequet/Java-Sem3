package PracticeWeek1;
import java.util.Scanner;

public class LabTask14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    int sum = 0;
    int count = 0;

    System.out.print("Enter a number (-999 to end program): ");
    num = input.nextInt();


    while (num != -999) {
        sum += num;
        count += 1;
        System.out.print("Enter a number (-999 to end program): ");
        num = input.nextInt();
}

    int average =  sum / count;

    System.out.println("Sum of all numbers: " + sum);
    System.out.println("Rounded average of all numbers: " + average);


    input.close();
    }
}
