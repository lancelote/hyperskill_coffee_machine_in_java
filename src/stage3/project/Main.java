package stage3.project;

import java.util.Scanner;

/**
 * A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big
 * number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.
 * <p>
 * In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee
 * beans that your coffee machine has at the moment.
 * <p>
 * If the coffee machine has enough supplies to make the specified amount of coffee, the program should print
 * "Yes, I can make that amount of coffee". If the coffee machine can make more than that, the program should output
 * "Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of
 * coffee that the coffee machine can make. If the amount of resources is not enough to make the specified amount of
 * coffee, the program should output "No, I can make only N cup(s) of coffee".
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();
        System.out.print("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int waterCups = water / 200;
        int milkCups = milk / 50;
        int beansCups = beans / 15;

        int limit = Math.min(waterCups, Math.min(milkCups, beansCups));

        if (cups > limit) {
            System.out.println("No, I can make only " + limit + " cup(s) of coffee");
        } else if (cups == limit) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            int extra = limit - cups;
            System.out.println("Yes, I can make that amount of coffee (and even " + extra + " more than that)");
        }
    }
}