package stage6.hw21;

/**
 * Given a class named Counter. Write two instance methods:
 * <p>
 * - inc to increase the value of the field current by one;
 * - getCurrent returns the current value;
 */
public class Main {
}

class Counter {

    int current;

    public void inc() {
        this.current += 1;
    }

    public int getCurrent() {
        return this.current;
    }
}