package stage4.hw36;

import java.util.Scanner;

/**
 * Given the method named extractInt that takes a double value and returns an integer value.
 * <p>
 * Write a body of the method. It should return only the integer part of the given value.
 */
public class Main {

    public static int extractInt(double d) {
        return (int) d;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}