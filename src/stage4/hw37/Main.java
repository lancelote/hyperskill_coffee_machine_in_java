package stage4.hw37;

import java.util.Scanner;

/**
 * Implement a method for checking the given english letter is a vowel or not. The input may be in any case.
 * <p>
 * Do not consider the letter 'y' as a vowel.
 */
public class Main {

    public static boolean isVowel(char ch) {
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}