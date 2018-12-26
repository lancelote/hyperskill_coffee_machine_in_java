package stage2.hw32;

import java.util.Scanner;

/**
 * Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down.
 * In which day the snail will reach the top of the pole?
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down = scanner.nextInt();

        System.out.println(1 + (height - down - 1) / (up - down));
    }
}