package stage3.project;

import java.util.Scanner;

public class CoffeeMachine {
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
