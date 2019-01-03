package stage4.hw15;

import java.util.Scanner;

/**
 * Find the number of "Ds", "Cs", "Bs" and "As" for the last test on informatics in a class consisting of n students.
 * The program gets number n as input, and then gets the grades themselves (one by one). The program should output four
 * numbers in a single line - the number of "D", the number of "C", the number of "B" and the number of "A" grades.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ds = 0;
        int cs = 0;
        int bs = 0;
        int as = 0;

        for (int i = 0; i < n; i++) {
            int mark = scanner.nextInt();
            switch (mark) {
                case 2:
                    ds += 1;
                    break;
                case 3:
                    cs += 1;
                    break;
                case 4:
                    bs += 1;
                    break;
                case 5:
                    as += 1;
                    break;
                default:
                    System.out.println("Unknown mark");
                    break;
            }
        }
        System.out.printf("%s %s %s %s", ds, cs, bs, as);
    }
}