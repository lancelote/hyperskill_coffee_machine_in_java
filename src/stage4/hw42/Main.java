package stage4.hw42;

import java.util.Scanner;

/**
 * Given the method named getNumberOfMaxParam that takes three integer numbers. It should return the number of the
 * first max in the order of the method parameters.
 * <p>
 * The first parameter has the number 1, the second one is 2, the third one is 3.
 */
public class Main {
    public static int getNumberOfMaxParam(int a, int b, int c) {
        if (a >= b && a >= c) {
            return 1;
        } else if (b >= a && b >= c) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}