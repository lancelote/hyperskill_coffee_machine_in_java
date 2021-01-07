package stage6.hw35;

import java.util.Scanner;

public class Main {

    public static long sumInRange(int from, int to) {
        long result = 0;
        for (long i = from; i < to; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));
    }
}
