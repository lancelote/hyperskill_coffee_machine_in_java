package stage3.hw10;

import java.util.Scanner;

/**
 * You are given coordinates of two queens on a chess board. Find out whether or not they hit each other.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean horizontal = y1 == y2;
        boolean vertical = x1 == x2;
        boolean rightDiagonal = x1 + y1 == x2 + y2;
        boolean leftDiagonal = x1 - y1 == x2 - y2;

        if (horizontal || vertical || rightDiagonal || leftDiagonal) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}