package stage4.hw35;

import java.util.Scanner;

/**
 * A bus tour of Europe has been very successful. Due to an increase in the number of people that want to go on a tour,
 * the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.
 * <p>
 * But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these
 * bridges. Can you find out if this will happen?
 * <p>
 * The first line of the input contains the height of the bus and number of bridges under which the bus passes.
 * The second line contains heights of these bridges.
 * <p>
 * You should output "Will not crash" if everything will be all right; otherwise, output "Will crash on bridge i"
 * (where i is a number of a bridge) into which the bus will crash. If the height of a bridge equals the height of the
 * bus, the bus will crash.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        boolean crashed = false;

        for (int i = 1; i <= bridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (busHeight >= bridgeHeight) {
                System.out.println("Will crash on bridge " + i);
                crashed = true;
                break;
            }
        }
        if (!crashed) {
            System.out.println("Will not crash");
        }
    }
}