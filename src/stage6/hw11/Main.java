package stage6.hw11;

import java.util.Scanner;

/**
 * You have a class GeometricCube with 3-arguments constructor:
 * <p>
 * public GeometricCube(int width, int height, int length)
 * <p>
 * Write a program that reads width, height and length, creates an instance named cube and outputs the result of
 * cube.toString().
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int length = scanner.nextInt();

        GeometricCube cube = new GeometricCube(width, height, length);

        System.out.println(cube.toString());
    }
}

class GeometricCube {
    private int width;
    private int height;
    private int length;

    public GeometricCube(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Cube(" +
                "w=" + width +
                ", h=" + height +
                ", l=" + length + ')';
    }
}