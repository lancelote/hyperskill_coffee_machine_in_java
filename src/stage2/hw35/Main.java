package stage2.hw35;

import java.util.Scanner;

/**
 * Given the values of the two moments in time in the same day: hours, minutes and seconds for each of the time
 * moments. It is known that the second moment in time happened not earlier than the first one. Find how many seconds
 * passed between these two moments of time.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int result = hours2 * 3600 + minutes2 * 60 + seconds2 - hours1 * 3600 - minutes1 * 60 - seconds1;
        System.out.println(result);
    }
}