package stage6.hw27;

enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int level;

    DangerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }
}

/**
 * Add an integer field to store danger level and associate the number to each constant:
 * <p>
 * HIGH - 3
 * MEDIUM - 2
 * LOW - 1
 * <p>
 * Also, you should add the instance method getLevel that returns the associated integer number.
 */
public class Main {
    public static void main(String[] args) {
        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;

        System.out.println(high.getLevel() > medium.getLevel()); // true
    }
}