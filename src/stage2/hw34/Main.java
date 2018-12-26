package stage2.hw34;

import java.util.Scanner;

/**
 * Some school have decided to create three new math groups and equip classrooms for them with the new desks.
 * Only two students may sit at any desk. The number of students in each of the three groups is known.
 * Output the smallest amount of desks, which will need to be purchased. Each new group sits in its own classroom.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        result += group1 / 2 + group1 % 2;
        result += group2 / 2 + group2 % 2;
        result += group3 / 2 + group3 % 2;

        System.out.println(result);
    }
}