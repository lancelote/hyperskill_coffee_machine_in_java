package stage3.hw19;

import java.util.Scanner;

/**
 * Given three natural numbers A, B, C. Determine if a triangle with these sides can exist.
 * <p>
 * If the triangle exists - output the YES string, otherwise - output NO.
 * <p>
 * Note, a triangle is formed by three connected points that are not located on a single straight line.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}