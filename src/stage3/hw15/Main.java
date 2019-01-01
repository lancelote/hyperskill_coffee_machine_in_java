package stage3.hw15;

import java.util.Scanner;

/**
 * Given an integer as input. Output True if its value is within the interval (−15,12]∪(14,17)∪[19,+∞),
 * and False otherwise (case sensitive).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > -15 && num <= 12 || num > 14 && num < 17 || num >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}