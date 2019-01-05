package stage4.hw30;

import java.util.Scanner;

/**
 * A user inputs a long number M. You need to find out what is the smallest long number n such that n! > M.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long limit = scanner.nextLong();
        long factorial = 1;
        int num = 1;
        while (factorial <= limit) {
            num += 1;
            factorial *= num;
        }
        System.out.println(num);
    }
}