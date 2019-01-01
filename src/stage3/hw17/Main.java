package stage3.hw17;

import java.util.Scanner;

/**
 * Given a four-digit number. Determine whether its decimal notation is symmetric. If the number is symmetric,
 * output 1; otherwise output any other integer. The number may have less than four digits; in this case you should
 * assume that its decimal notation is complemented by insignificant zeros on the left.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n1 = num / 1000;
        int n2 = num % 1000 / 100;
        int n3 = num % 100 / 10;
        int n4 = num % 10;
        if (n1 == n4 && n2 == n3) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}