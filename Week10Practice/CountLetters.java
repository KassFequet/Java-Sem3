package Week10Practice;

import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        // get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // convert to all upper case
        word = word.toUpperCase();

        // count frequency of each letter in string
        try {
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if (!Character.isLetter(currentChar)) {
                    System.out.println("Invalid character: " + currentChar);
                } else {
                    counts[currentChar - 'A']++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error occurred while processing the input.");
        }

        // print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++)
            if (counts[i] != 0)
                System.out.println((char) (i + 'A') + ": " + counts[i]);

    }

}
