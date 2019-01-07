package stage4.project;

import java.util.Scanner;

public class Main {

    public static void print(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    public static void buy(Scanner scanner, int water, int milk, int beans, int cups, int money) {
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int type = scanner.nextInt();

        switch (type) {
            case 1: // espresso
                water -= 250;
                beans -= 16;
                cups -= 1;
                money += 4;
                break;
            case 2: // latte
                water -= 350;
                milk -= 75;
                beans -= 20;
                cups -= 1;
                money += 7;
                break;
            case 3: // cappuccino
                water -= 200;
                milk -= 100;
                beans -= 12;
                cups -= 1;
                money += 6;
                break;
            default:
                System.out.println("Unknown coffee type");
                break;
        }

        System.out.println();
        print(water, milk, beans, cups, money);
    }

    public static void fill(Scanner scanner, int water, int milk, int beans, int cups, int money) {
        System.out.print("Write how many ml of water do you want to add: ");
        water += scanner.nextInt();
        System.out.print("Write how many ml of milk do you want to add: ");
        milk += scanner.nextInt();
        System.out.print("Write how many grams of coffee beans do you want to add: ");
        beans += scanner.nextInt();
        System.out.print("Write how many disposable cups of coffee do you want to add: ");
        cups += scanner.nextInt();

        System.out.println();
        print(water, milk, beans, cups, money);
    }

    public static void take(int water, int milk, int beans, int cups, int money) {
        System.out.printf("I gave you %s$\n", money);
        money = 0;

        System.out.println();
        print(water, milk, beans, cups, money);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 1200;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        print(water, milk, beans, cups, money);
        System.out.println();

        System.out.print("Write action (buy, fill, take): ");
        String command = scanner.next();

        switch (command) {
            case "buy":
                buy(scanner, water, milk, beans, cups, money);
                break;
            case "fill":
                fill(scanner, water, milk, beans, cups, money);
                break;
            case "take":
                take(water, milk, beans, cups, money);
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }
}