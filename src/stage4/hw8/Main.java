package stage4.hw8;

import java.util.Scanner;

/**
 * Write a program that emulates a string processor. It reads two strings and an operation and outputs a result.
 * <p>
 * There are three possible operations:
 * <p>
 * concat - it appends the second string to the first string;
 * remove - it removes all occurrences of the second string in the first string;
 * contains - it tests if the first string contains the second string, and the result is true or false.
 * <p>
 * The program should output the result as a string. If the operation is unknown, the program should print
 * "Unknown operation".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String op = scanner.next();
        String str2 = scanner.next();

        switch (op) {
            case "concat":
                System.out.println(str1 + str2);
                break;
            case "remove":
                System.out.println(str1.replaceAll(str2, ""));
                break;
            case "contains":
                System.out.println(str1.contains(str2));
                break;
            default:
                System.out.println("Unknown operation");
                break;
        }
    }
}