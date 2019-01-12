package stage6.hw6;

import java.util.Scanner;

/**
 * Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.
 * <p>
 * The program should output the resulting string.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(str.replaceAll("a", "b"));
    }
}