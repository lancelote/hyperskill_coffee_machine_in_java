package stage4.hw4;

import java.util.Scanner;

/**
 * A simple calculator
 * <p>
 * Write a simple calculator that reads the three values from the line: the first number, the operation,
 * and the second number.
 * <p>
 * The program should apply the operation to the numbers entered ("first number" "operation" "second number")
 * and output the result to the screen. Note that the numbers are long.
 * <p>
 * The calculator should support:
 * <p>
 * addition: "+"
 * subtraction: "-"
 * integer division: "/"
 * multiplication: "*"
 * <p>
 * If a user performs division and the second number is 0, it is necessary to output the line "Division by 0!".
 * <p>
 * If the input operator is not one from the list, the program should output "Unknown operator".
 * <p>
 * Note: it's recommended to use the switch statement in your solution.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        String op = scanner.next();
        long num2 = scanner.nextLong();

        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(num1 / num2);
                }
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}