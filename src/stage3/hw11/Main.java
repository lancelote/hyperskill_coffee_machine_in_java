package stage3.hw11;

import java.util.Scanner;

/**
 * A chocolate bar has the shape of a rectangle, divided into NxM segments. You can break down this chocolate bar
 * into two parts by a single straight line (only once). Find whether you can break off exactly K segments from the
 * chocolate. Each segment is 1x1.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int segments = scanner.nextInt();
        if (width * height >= segments && (segments % height == 0 || segments % width == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}