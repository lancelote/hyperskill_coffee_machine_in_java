package stage3.hw7;

import java.util.Scanner;

/**
 * Groundhogs like to throw fun parties, and at their parties, they like to eat Reeses peanut butter cups.
 * But not too many Reeses or they feel sick! A successful groundhog party will have between 10 and 20 Reeses
 * peanut butter cups, inclusive unless it is the weekend, in which case they will need 15 to 25 Reeses peanut
 * butter cups, inclusive.
 * <p>
 * Write a Java program that reads two values:
 * <p>
 * the first is the number of Reeses peanut butter cups;
 * the second is a boolean representing whether it is the weekend.
 * <p>
 * The program must print the boolean value - the party is successful or not.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean success = day >= 15 && day <= 25 && isWeekend || day >= 10 && day <= 20 && !isWeekend;
        System.out.println(success);
    }
}