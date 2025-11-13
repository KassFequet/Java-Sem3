package Week10Practice;

public class MathUtils {
    public static int factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Cannot be a negative integer. Please enter a positive integer.");
        }

        if (n > 16) {
            throw new IllegalArgumentException("Cannot be a large integer. Please enter an integer less than or equal to 16.");
        }


        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }

}
