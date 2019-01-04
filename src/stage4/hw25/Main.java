package stage4.hw25;

import java.util.Scanner;

/**
 * Ann put M M M money in the bank. The bank increases Ann's deposit by P P P percent every year. Ann wants to know how many years should pass until her deposit in the bank reaches K K K money. Can you help her to answer this question?
 * <p>
 * Input contains three integers - M,P,K M, P, K M,P,K. It is guaranteed that all numbers are positive and K≥M K \geq M K≥M.
 * Output the answer to Ann's question.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        double percent = scanner.nextDouble();
        double desired = scanner.nextDouble();
        int years = 0;

        while (money < desired) {
            years += 1;
            money += money * percent / 100;
        }
        System.out.println(years);
    }
}