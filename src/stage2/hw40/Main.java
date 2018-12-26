package stage2.hw40;

import java.util.Scanner;

/**
 * N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after each of the
 * squirrels takes the equal amount of nuts.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();
        System.out.println(nuts % squirrels);
    }
}