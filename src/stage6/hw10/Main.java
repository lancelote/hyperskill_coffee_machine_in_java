package stage6.hw10;

import java.util.Locale;
import java.util.Scanner;

/**
 * Write a program that checks a given string starts with the prefix "J" ignoring the case.
 * <p>
 * The program should output true or false.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string.toLowerCase(Locale.ENGLISH).startsWith("j"));
    }
}