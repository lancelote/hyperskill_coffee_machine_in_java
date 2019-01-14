package stage6.hw24;

enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

/**
 * Declare an enum named DayOfWeek. It should include all days of weak in uppercase: SUNDAY, MONDAY, TUESDAY,
 * WEDNESDAY, THURSDAY, FRIDAY, SATURDAY.
 */
public class Main {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}