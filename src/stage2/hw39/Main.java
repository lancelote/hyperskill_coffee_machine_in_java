package stage2.hw39;

import java.util.Scanner;

/**
 * N squirrels found K nuts and decided to divide them equally. Determine how many nuts each squirrel will get.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirrels = scanner.nextInt();
        int nuts = scanner.nextInt();
        System.out.println(nuts / squirrels);
    }
}