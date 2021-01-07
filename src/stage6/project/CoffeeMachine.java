package stage6.project;

import java.util.Scanner;

enum State {
    READY,
    SHUTDOWN,
    WATER_INPUT,
    MILK_INPUT,
    BEANS_INPUT,
    CUPS_INPUT,
    BUY_CHOICE
}

public class CoffeeMachine {

    private int water;
    private int milk;
    private int beans;
    private int cups;
    private int money;
    private String input;
    private State state = State.READY;

    CoffeeMachine(int water, int milk, int beans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.money = money;
    }

    State getState() {
        return this.state;
    }

    void start() {
        ready();
    }

    void stop() {
        this.state = State.SHUTDOWN;
    }

    private void ready() {
        this.state = State.READY;
        System.out.println();
        System.out.print("Write action (buy, fill, take, remaining, exit): ");
    }

    void processInput(String input) {
        this.input = input;

        switch (this.state) {
            case READY:
                processReadyCommand();
                break;
            case WATER_INPUT:
            case MILK_INPUT:
            case BEANS_INPUT:
            case CUPS_INPUT:
                fill();
                break;
            case BUY_CHOICE:
                buy();
                break;
            default:
                System.out.println("Unknown input state");
                ready();
                break;
        }
    }

    private void processReadyCommand() {
        System.out.println();
        switch (input) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                printRemaining();
                break;
            case "exit":
                stop();
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }

    private void buy() {
        switch (this.state) {
            case READY:
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                        "back - to main menu: ");
                this.state = State.BUY_CHOICE;
                break;
            case BUY_CHOICE:
                boolean enough = isEnough(this.input);

                switch (this.input) {
                    case "1": // espresso
                        if (enough) {
                            this.water -= 250;
                            this.beans -= 16;
                            this.cups -= 1;
                            this.money += 4;
                        }
                        break;
                    case "2": // latte
                        if (enough) {
                            this.water -= 350;
                            this.milk -= 75;
                            this.beans -= 20;
                            this.cups -= 1;
                            this.money += 7;
                        }
                        break;
                    case "3": // cappuccino
                        if (enough) {
                            this.water -= 200;
                            this.milk -= 100;
                            this.beans -= 12;
                            this.cups -= 1;
                            this.money += 6;
                        }
                        break;
                    case "back":
                        break;
                    default:
                        System.out.println("Unknown buy command");
                        break;
                }
                ready();
                break;
            default:
                System.out.println("Unknown buy state");
                ready();
                break;
        }
    }

    private void fill() {
        switch (this.state) {
            case READY:
                System.out.print("Write how many ml of water do you want to add: ");
                this.state = State.WATER_INPUT;
                break;
            case WATER_INPUT:
                this.water += Integer.parseInt(this.input);
                System.out.print("Write how many ml of milk do you want to add: ");
                this.state = State.MILK_INPUT;
                break;
            case MILK_INPUT:
                this.milk += Integer.parseInt(this.input);
                System.out.print("Write how many grams of coffee beans do you want to add: ");
                this.state = State.BEANS_INPUT;
                break;
            case BEANS_INPUT:
                this.beans += Integer.parseInt(this.input);
                System.out.print("Write how many disposable cups of coffee do you want to add: ");
                this.state = State.CUPS_INPUT;
                break;
            case CUPS_INPUT:
                this.cups += Integer.parseInt(this.input);
                ready();
                break;
            default:
                System.out.println("Unknown fill state");
                ready();
                break;
        }
    }

    private void take() {
        System.out.println("I gave you $" + this.money);
        this.money = 0;
        ready();
    }

    private void printRemaining() {
        System.out.println("The coffee machine has:");
        System.out.println(this.water + " of water");
        System.out.println(this.milk + " of milk");
        System.out.println(this.beans + " of coffee beans");
        System.out.println(this.cups + " of disposable cups");
        System.out.println("$" + this.money + " of money");
        ready();
    }

    private boolean isEnough(String type) {
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
        if (this.water < waterLimit) {
            System.out.println("Sorry, not enough water!");
        } else if (this.milk < milkLimit) {
            System.out.println("Sorry, not enough milk!");
        } else if (this.beans < beansLimit) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (this.cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            enough = true;
            System.out.println("I have enough resources, making you a coffee!");
        }

        return enough;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);
        coffeeMachine.start();

        while (coffeeMachine.getState() != State.SHUTDOWN) {
            coffeeMachine.processInput(scanner.next());
        }
    }
}
