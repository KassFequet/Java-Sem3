package PracticeWeek1;
import java.util.Scanner;

public class LabTask11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a one-digit number: ");
        num = input.nextInt();

if (num < 0 || num > 9) {
    System.out.println("Error - must be a 1 digit number");
} else {
    switch (num) {
        case 0: System.out.println("Zero"); break;
        case 1: System.out.println("One"); break;
        case 2: System.out.println("Two"); break;
        case 3: System.out.println("Three"); break;
        case 4: System.out.println("Four"); break;
        case 5: System.out.println("Five"); break;
        case 6: System.out.println("Six"); break;
        case 7: System.out.println("Seven"); break;
        case 8: System.out.println("Eight"); break;
        case 9: System.out.println("Nine"); break;
    }}
    input.close();
    }
    
}
