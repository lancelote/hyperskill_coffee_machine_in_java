package stage6.hw26;

enum Secret {
    STAR, CRASH, // ...
}

/**
 * Given an enum named Secret with some constants in uppercase.
 * <p>
 * Write a program that counts a number of constants starting with "STAR".
 */
public class Main {

    public static void main(String[] args) {
        int count = 0;
        Secret[] values = Secret.values();
        for (Secret value : values) {
            if (value.name().startsWith("STAR")) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}