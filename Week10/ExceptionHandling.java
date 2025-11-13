// class ExceptionDemo1 {
//     public static void main(String args[])
//     {

//     try{

//     int num1=30, num2=0;
//     int output=num1/num2;
//     System.out.println ("Result = " +output);
//     }catch(ArithmeticException e){

//         System.out.println ("Arithmetic Exception: You can't divide an integer by 0");

// }

// }

// }

// class Example1 {
//     public static void main(String args[]) {

//         int num1, num2;

//         try {
//             // Try block to handle code that may cause exception
//             num1 = 0;
//             num2 = 62 / num1;
//             System.out.println("Try block message");
//         } catch (ArithmeticException e) {
//             // This block is to catch divide-by-zero error
//             System.out.println("Error: Don't divide a number by zero");
//         }
//         System.out.println("I'm out of try-catch block in Java.");
//     }

// }

// class ExceptionDemo2
// {
//     public static void main(String args[])

//     {
//         try {
//             int a[] = new int[10];
//             // Array has only 10 elements
//             a[11] = 9;
//         }
//         catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBounds");
//         }
//     }

// }

// class Example2 {

//     public static void main(String args[]) {
//         try {
//             int a[] = new int[7];
//             a[8] = 30 / 0;
//             System.out.println("First print statement in try block");
//         }
//         catch (ArithmeticException e) {
//             System.out.println("Warning: ArithmeticException");
//         }
//         catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Warning: ArrayIndexOutOfBoundsException");
//         }
//         catch (Exception e) {
//             System.out.println("Warning: Some Other exception");
//         }
//         System.out.println("Out of try-catch block...");

//     }

// }

// class ExceptionDemo3

// {
//     public static void main(String args[])

//     {
//         try {
//             int num = Integer.parseInt("XYZ");
//             System.out.println(num);
//         } catch (NumberFormatException e) {
//             System.out.println("Number format exception occurred");
//         }
//     }

// }

// class ExceptionDemo4

// {

//     public static void main(String args[])

//     {
//         try {
//             String str = "easysteps2buildwebsite";
//             System.out.println(str.length());
//             ;
//             char c = str.charAt(0);
//             c = str.charAt(40);
//             System.out.println(c);
//         } catch (StringIndexOutOfBoundsException e) {
//             System.out.println("StringIndexOutOfBoundsException!!");
//         }

//     }

// }

// package beginnersbook.com;

// class Exception2

// {
//     public static void main(String args[])

//     {
//         try {
//             String str = null;
//             System.out.println(str.length());
//         } catch (NullPointerException e) {
//             System.out.println("NullPointerException..");
//             e.printStackTrace();
//         }
//     }

// }

//

//

// class Nest {

//     public static void main(String args[]) {

//         // Parent try block

//         try {

//             // Child try block1

//             try {
//                 System.out.println("Inside block1");
//                 int b = 45 / 0;
//                 System.out.println(b);
//             }

//             catch (ArithmeticException e1) {
//                 System.out.println("Exception: e1");
//             }

//             // Child try block2
//             try {
//                 System.out.println("Inside block2");
//                 int b = 45 / 0;
//                 System.out.println(b);
//             }

//             catch (ArrayIndexOutOfBoundsException e2) {
//                 System.out.println("Exception: e2");
//             }

//             System.out.println("Just other statement");

//         }

//         catch (ArithmeticException e3) {
//             System.out.println("Arithmetic Exception");
//             System.out.println("Inside parent try catch block");
//         }

//         catch (ArrayIndexOutOfBoundsException e4) {
//             System.out.println("ArrayIndexOutOfBoundsException");
//             System.out.println("Inside parent try catch block");
//         }

//         catch (Exception e5) {
//             System.out.println("Exception");
//             System.out.println("Inside parent try catch block");
//         }

//         System.out.println("Next statement..");

//     }

// }

public class ExceptionHandling {
    public static void main(String[] args) {

        // int age = 0;

        // try {
        // if (age < 18)
        // throw new MyOwnException("Age cannot be less than 18");
        // else
        // System.out.println("Input is valid");
        // } catch (MyOwnException e) {
        // System.out.println("Caught the exception");
        // System.out.println(e.getMessage());
        // }

        //     try {
        //         StudentAge(19, 0);
        //     } catch (MyOwnException e) {
        //         System.out.println(e.getMessage());
        //     } catch (ArithmeticException e) {
        //         System.out.println(e.getMessage());
        //     }

        // }

        // public static void StudentAge(int age, int denominator) throws MyOwnException, ArithmeticException {

        //     int a = 15 / denominator;

        //     if (age < 18) {
        //         throw new MyOwnException("Student Age cannot be less than 18");
        //     } else {
        //         System.out.println("Age is valid");
        //     }

        // int numerator = 30;
        // int denominator = 0;

        // try {
        //     System.out.println(numerator / denominator);
        //     System.out.println("This text will not be printed");
        // } catch (java.lang.ArithmeticException e) {
        //     System.out.println("This text will be printed");
        // } finally {
        //     System.out.println("This text will also be printed");
        // }


    }

}