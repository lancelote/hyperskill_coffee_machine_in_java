package stage4.hw9;

import java.util.Scanner;

/**
 * We need your help to improve an adaptive system. Write a program that asks learners what programming language they
 * are learning. I hope you know which answer is correct.
 * <p>
 * Question: what programming language do you learn here?
 * <p>
 * 1. Java
 * 2. Kotlin
 * 3. Scala
 * 4. Python
 * <p>
 * The program should read the answer’s number from the standard input and output the result of the test: "Yes!",
 * "No!" or "Unknown number".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }
}