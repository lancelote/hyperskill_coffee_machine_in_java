package stage6.hw9;

import java.util.Scanner;

/**
 * Write a program that reads the name of a city and check the name ends with "burg".
 * <p>
 * Keep in mind, a city can have a short name.
 * <p>
 * The program should output true or false.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stadt = scanner.nextLine();
        System.out.println(stadt.endsWith("burg"));
    }
}