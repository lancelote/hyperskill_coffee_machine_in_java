package stage4.hw29;

import java.util.Scanner;

/**
 * For its input, the program gets a sequence of non-negative integers; each integer is written in a separate line.
 * The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of the
 * sequence (not counting the final 0).
 * <p>
 * Don’t read numbers following the number 0.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int length = -1;
        do {
            num = scanner.nextInt();
            length += 1;
        } while (num != 0);
        System.out.println(length);
    }
}