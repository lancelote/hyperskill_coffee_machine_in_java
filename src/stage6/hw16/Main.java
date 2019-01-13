package stage6.hw16;

/**
 * Given a class named Patient. It has one string field name.
 * <p>
 * You must add the method say. The method prints the text containing the name of a patient (instead of "...") and
 * his desire to see a doctor:
 * <p>
 * "Hello, my name is ..., I need a doctor."
 * <p>
 * The method doesn't take any parameters and returns nothing.
 */
public class Main {
}

class Patient {
    String name;

    public void say() {
        System.out.printf("Hello, my name is %s, I need a doctor.", this.name);
    }
}