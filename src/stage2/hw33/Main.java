package stage2.hw33;

public class Main {
    public static void main(String[] args) {
        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);
    }
}
