package stage4.hw3;

import java.util.Scanner;

/**
 * Write a program, which reads the number of direction (1 – up, 2 – down, 3 – left, 4 – right, 0 – stay) and outputs
 * the text «move up» (or «move down», or «move left», or «move right», or «do not move» depending on the entered
 * number). If it is a number that does not belong to any of the listed directions, the program should output: «error!»
 * <p>
 * Note: the output text should exactly match the sample, including the letters’ case and location of spaces.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int direction = scanner.nextInt();
        switch (direction) {
            case 0:
                System.out.println("do not move");
                break;
            case 1:
                System.out.println("move up");
                break;
            case 2:
                System.out.println("move down");
                break;
            case 3:
                System.out.println("move left");
                break;
            case 4:
                System.out.println("move right");
                break;
            default:
                System.out.println("error!");
                break;
        }
    }
}