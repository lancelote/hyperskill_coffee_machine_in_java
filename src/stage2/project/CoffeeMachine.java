package stage2.project;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " of coffee you will need:");
        System.out.println(200 * cups + " ml of water");
        System.out.println(50 * cups + " ml of milk");
        System.out.println(15 * cups + " g of coffee beans");
    }
}
