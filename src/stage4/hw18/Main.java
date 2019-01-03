package stage4.hw18;

import java.util.Scanner;

/**
 * A detector compares the size of parts produced by a machine with the reference standard.
 * <p>
 * If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
 * If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
 * If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.
 * <p>
 * Write a program, which takes the number of parts n as input, and then the sequence of detector prints. The program
 * should output numbers in a single line containing the number of parts ready to be shipped, the number of parts to
 * be fixed, and the number of rejects.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();

        int perfect = 0;
        int larger = 0;
        int smaller = 0;

        for (int i = 0; i < total; i++) {
            int part = scanner.nextInt();
            switch (part) {
                case 0:
                    perfect += 1;
                    break;
                case 1:
                    larger += 1;
                    break;
                case -1:
                    smaller += 1;
                    break;
                default:
                    System.out.println("Unknown size format");
                    break;
            }
        }
        System.out.printf("%s %s %s", perfect, larger, smaller);
    }
}