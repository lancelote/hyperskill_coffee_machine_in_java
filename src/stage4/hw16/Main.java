package stage4.hw16;

import java.util.Scanner;

/**
 * Given the number N. If there is the way to divide the number into 2 parts in such a way that sum of the digits of
 * the first part equals sum of the digits of the second part, then this number is considered lucky. For a given
 * number output "YES" if this number is lucky, otherwise output "NO".
 * <p>
 * For example, 1045 is considered lucky because if you divide it between 4 and 5, the first part would be "104,"
 * the sum of whose digits equals 5, and the second part would be "5,” the sum of whose digits also equals 5.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strNum = scanner.next();
        int length = strNum.length();

        for (int border = 0; border < length; border++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < length; i++) {
                if (i < border) {
                    leftSum += Character.getNumericValue(strNum.charAt(i));
                } else {
                    rightSum += Character.getNumericValue(strNum.charAt(i));
                }
            }

            if (leftSum == rightSum) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}