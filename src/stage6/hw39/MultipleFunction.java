package stage6.hw39;

import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if (x <= 0) {
            return f1(x);
        } else if (0 < x && x < 1) {
            return f2(x);
        } else {
            return f3(x);
        }
    }

    public static double f1(double x) {
        return x * x + 1;
    }

    public static double f2(double x) {
        return 1 / (x * x);
    }

    public static double f3(double x) {
        return x * x - 1;
    }
}
