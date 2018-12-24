package stage2.hw25;

import java.util.Scanner;

/**
 * Write a program that reads three strings and outputs them in the reverse order, each in a new line.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();

        System.out.println(string3);
        System.out.println(string2);
        System.out.println(string1);
    }
}
