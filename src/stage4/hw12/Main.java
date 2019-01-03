package stage4.hw12;

import java.util.Scanner;

/**
 * Given the number N with an even number of digits. If the sum of the first half of the digits equals the sum of the
 * second half of the digits, then this number is considered lucky. For a given number, output "YES" if this number is
 * lucky, otherwise output "NO".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strNum = scanner.next();

        int length = strNum.length();
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < length / 2; i++) {
            rightSum += (int) strNum.charAt(i);
        }

        for (int i = length / 2; i < length; i++) {
            leftSum += (int) strNum.charAt(i);
        }

        if (leftSum == rightSum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}