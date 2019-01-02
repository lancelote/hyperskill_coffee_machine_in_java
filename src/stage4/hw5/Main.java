package stage4.hw5;

import java.util.Scanner;

/**
 * Residents of the country of Malevia often experiment with the plan of their rooms. Rooms can be triangular,
 * rectangular, and round. To quickly calculate the floorage it is required to write a program that gets the type
 * of the room shape and the relevant parameters as input. The program should output the area of the resulting room.
 * <p>
 * The value of 3.14 is used instead of the number π in Malevia.
 */
public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double p;
        double r;
        double square;

        Scanner scanner = new Scanner(System.in);
        String form = scanner.next();

        switch (form) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                p = (a + b + c) / 2;
                square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(square);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                square = a * b;
                System.out.println(square);
                break;
            case "circle":
                r = scanner.nextDouble();
                square = 3.14 * r * r;
                System.out.println(square);
                break;
            default:
                System.out.println("Unknown form");
                break;
        }
    }
}