package stage2.hw27;

import java.util.Scanner;

/**
 * Write a program that reads five words from the standard input and outputs each word in a new line.
 * <p>
 * First, you need to print all the words from the first line, then from the second (from the left to right).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();
        String word5 = scanner.next();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word4);
        System.out.println(word5);
    }
}