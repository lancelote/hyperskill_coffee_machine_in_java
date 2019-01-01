package stage3.hw12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * There are two boxes on the table. The first box has a size of X1 x Y1 x Z1,and the second box has a size
 * of X2 x Y2 x Z2. You need to determine which box can be put inside another box. You can rotate both boxes
 * as you want.
 * <p>
 * Input contains two lines.
 * The first line contains numbers X1, Y1, Z1, the second line contains numbers X2, Y2, Z2. All numbers are
 * integers and greater than 0.
 * <p>
 * If the sizes of the boxes are equal, output "Box 1 = Box 2".
 * If the first box can be put inside the second box, output "Box 1 < Box 2".
 * If the second box can be put inside the first box, output "Box 1 > Box 2".
 * If none of the boxes can be put inside the other box, output "Incomparable".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();

        int[] box1 = {x1, y1, z1};
        Arrays.sort(box1);
        int[] box2 = {x2, y2, z2};
        Arrays.sort(box2);

        if (Arrays.equals(box1, box2)) {
            System.out.println("Box 1 = Box 2");
        } else if (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (box2[0] <= box1[0] && box2[1] <= box1[1] && box2[2] <= box1[2]) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}