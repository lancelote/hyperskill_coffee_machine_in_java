package stage3.hw14;

import java.util.Scanner;

/**
 * Ann watched a TV program about health and learned that it is recommended to sleep at least AA hours per day,
 * but oversleeping is also not healthy, and you should not sleep more than BB hours. Now Ann sleeps HH hours per day.
 * If Ann's sleep schedule complies with the requirements of that TV program – print "Normal".
 * If Ann sleeps less than AA hours, output “Deficiency”, and if she sleeps more than BB hours, output “Excess”.
 * <p>
 * Input to this program are the three strings with variables in the following order: AAA, BBB, HHH. AAA is always
 * less than or equal to BBB.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int recommended = scanner.nextInt();
        int oversleeping = scanner.nextInt();
        int sleep = scanner.nextInt();

        if (sleep >= recommended && sleep <= oversleeping) {
            System.out.println("Normal");
        } else if (sleep < recommended) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }
    }
}