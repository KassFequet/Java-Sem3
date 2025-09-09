package PracticeWeek1;
import java.util.Scanner;

public class LabTask15 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        System.out.print("Enter an operator (+,-,*,/): ");
        String operatorInput = input.next();
        char operator = operatorInput.charAt(0);

        switch (operator) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, (num1 + num2));
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, (num1 - num2));
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, (num1 / num2));
                } else {
                    System.out.println("Error - Must not divide by zero");
                }
                break;
            default:
                System.out.println("Error - Must be a valid operator");
                break;
            }
    input.close();
    }
}
