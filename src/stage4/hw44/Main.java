package stage4.hw44;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implement a method for reversing a given array of strings. The array can have any size.
 * <p>
 * The method may reverse and return the existing array or returns a new array.
 */
public class Main {

    public static String[] reverse(String... words) {
        for (int i = 0; i < words.length / 2; i++) {
            String tmp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = tmp;
        }
        return words;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        String[] reversed = reverse(words);
        Arrays.stream(reversed).forEach(e -> System.out.print(e + " "));
    }
}