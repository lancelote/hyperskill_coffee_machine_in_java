package stage2.hw36;

import java.util.Scanner;

/**
 * Given a two-digit number. Print its first digit (i.e. the number of tens).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num / 10);
    }
}