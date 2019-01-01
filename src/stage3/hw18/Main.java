package stage3.hw18;

import java.util.Scanner;

/**
 * In a computer game, each gamer has an army of units.
 * <p>
 * Write a program that will classify the army of your enemies corresponding to the following rules:
 * <p>
 * Units:  Category
 * less than 1: no army
 * from 1 to 4: few
 * from 5 to 9: several
 * from 10 to 19: pack
 * from 20 to 49: lots
 * from 50 to 99: horde
 * from 100 to 249: throng
 * from 250 to 499: swarm
 * from 500 to 999: zounds
 * 1000 and more: legion
 * <p>
 * The program should read the number of units and output the corresponding category.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        if (units < 1) {
            System.out.println("no army");
        } else if (units < 5) {
            System.out.println("few");
        } else if (units < 10) {
            System.out.println("several");
        } else if (units < 20) {
            System.out.println("pack");
        } else if (units < 50) {
            System.out.println("lots");
        } else if (units < 100) {
            System.out.println("horde");
        } else if (units < 250) {
            System.out.println("throng");
        } else if (units < 500) {
            System.out.println("swarm");
        } else if (units < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}