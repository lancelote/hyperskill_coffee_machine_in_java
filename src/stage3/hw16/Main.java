package stage3.hw16;

import java.util.Scanner;

/**
 * Given a simple equation, you should output the correct value for variable "x". The equation has two numbers
 * greater than 0 and variable "x", and between these can be "+", "-" or "=". Numbers, variable "x", symbols "+",
 * "-", "=" all separated by a space.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t1 = scanner.next();
        String t2 = scanner.next();
        String t3 = scanner.next();
        String t4 = scanner.next();
        String t5 = scanner.next();

        if ("=".equals(t4)) {
            if ("x".equals(t1)) {
                if ("+".equals(t2)) {          // x + 1 = 2
                    System.out.println(Integer.parseInt(t5) - Integer.parseInt(t3));
                } else if ("-".equals(t2)) {   // x - 1 = 2
                    System.out.println(Integer.parseInt(t5) + Integer.parseInt(t3));
                }
            } else if ("x".equals(t3)) {
                if ("+".equals(t2)) {          // 1 + x = 2
                    System.out.println(Integer.parseInt(t5) - Integer.parseInt(t1));
                } else if ("-".equals(t2)) {   // 1 - x = 2
                    System.out.println(Integer.parseInt(t1) - Integer.parseInt(t5));
                }
            } else if ("x".equals(t5)) {
                if ("+".equals(t2)) {          // 1 + 2 = x
                    System.out.println(Integer.parseInt(t1) + Integer.parseInt(t3));
                } else if ("-".equals(t2)) {   // 1 - 2 = x
                    System.out.println(Integer.parseInt(t1) - Integer.parseInt(t3));
                }
            }
        } else if ("=".equals(t2)) {
            if ("x".equals(t1)) {
                if ("+".equals(t4)) {          // x = 1 + 2
                    System.out.println(Integer.parseInt(t3) + Integer.parseInt(t5));
                } else if ("-".equals(t4)) {   // x = 1 - 2
                    System.out.println(Integer.parseInt(t3) - Integer.parseInt(t5));
                }
            } else if ("x".equals(t3)) {
                if ("+".equals(t4)) {          // 1 = x + 2
                    System.out.println(Integer.parseInt(t1) - Integer.parseInt(t5));
                } else if ("-".equals(t4)) {   // 1 = x - 2
                    System.out.println(Integer.parseInt(t1) + Integer.parseInt(t5));
                }
            } else if ("x".equals(t5)) {
                if ("+".equals(t4)) {          // 1 = 2 + x
                    System.out.println(Integer.parseInt(t1) - Integer.parseInt(t3));
                } else if ("-".equals(t4)) {   // 1 = 2 - x
                    System.out.println(Integer.parseInt(t3) - Integer.parseInt(t1));
                }
            }
        } else {
            System.out.println("Unknown expression format");
        }
    }
}