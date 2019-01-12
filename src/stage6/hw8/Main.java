package stage6.hw8;

import java.util.Scanner;

/**
 * Write a program that reads two strings and compares them without whitespaces. The program should prints true if
 * both strings are equal, otherwise - false.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String str1WithoutSpaces = str1.replaceAll(" ", "");
        String str2WithoutSpaces = str2.replaceAll(" ", "");

        System.out.println(str1WithoutSpaces.equals(str2WithoutSpaces));
    }
}