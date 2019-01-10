package stage5.project;

import java.util.Scanner;

public class Main {

    /**
     * Print to stdin the given amount of resources
     */
    public static void print(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }

    /**
     * Check if there is enough resources to make a given coffee type
     */
    public static boolean isEnough(String type, int water, int milk, int beans, int cups) {
        boolean enough = false;

        int waterLimit;
        int milkLimit;
        int beansLimit;

        switch (type) {
            case "1": // espresso
                waterLimit = 250;
                milkLimit = 0;
                beansLimit = 16;
                break;
            case "2": // latte
                waterLimit = 350;
                milkLimit = 75;
                beansLimit = 20;
                break;
            case "3": // cappuccino
                waterLimit = 200;
                milkLimit = 100;
                beansLimit = 12;
                break;
            default:
                return false;
        }
        if (water < waterLimit) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < milkLimit) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < beansLimit) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            enough = true;
            System.out.println("I have enough resources, making you a coffee!");
        }

        return enough;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        while (true) {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            String command = scanner.next();
            System.out.println();

            switch (command) {
                case "buy":
                    System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                            "back - to main menu: ");
                    String type = scanner.next();
                    boolean enough = isEnough(type, water, milk, beans, cups);

                    switch (type) {
                        case "1": // espresso
                            if (enough) {
                                water -= 250;
                                beans -= 16;
                                cups -= 1;
                                money += 4;
                            }
                            break;
                        case "2": // latte
                            if (enough) {
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                cups -= 1;
                                money += 7;
                            }
                            break;
                        case "3": // cappuccino
                            if (enough) {
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                cups -= 1;
                                money += 6;
                            }
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Unknown coffee type");
                            break;
                    }
                    break;
                case "fill":
                    System.out.print("Write how many ml of water do you want to add: ");
                    water += scanner.nextInt();
                    System.out.print("Write how many ml of milk do you want to add: ");
                    milk += scanner.nextInt();
                    System.out.print("Write how many grams of coffee beans do you want to add: ");
                    beans += scanner.nextInt();
                    System.out.print("Write how many disposable cups of coffee do you want to add: ");
                    cups += scanner.nextInt();
                    break;
                case "take":
                    System.out.printf("I gave you $%s\n", money);
                    money = 0;
                    break;
                case "remaining":
                    print(water, milk, beans, cups, money);
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Unknown command");
                    break;
            }
            System.out.println();
        }
    }
}