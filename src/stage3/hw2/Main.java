package stage3.hw2;

import java.util.Scanner;

/**
 * Suppose there are three boys in a sports class.
 * <p>
 * You need to write a program that checks the boys are arranged in the ascending or descending order by height.
 * The program must read three integer numbers h1, h2, h3 and outputs true or false. If boys have the same height,
 * they are considered as correctly arranged.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boy1 = scanner.nextInt();
        int boy2 = scanner.nextInt();
        int boy3 = scanner.nextInt();
        boolean ascending = boy1 <= boy2 && boy2 <= boy3;
        boolean descending = boy1 >= boy2 && boy2 >= boy3;
        System.out.println(ascending || descending);
    }
}