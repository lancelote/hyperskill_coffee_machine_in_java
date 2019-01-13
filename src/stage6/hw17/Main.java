package stage6.hw17;

/**
 * Given a class named Car containing three fields: the int field yearModel, the string field make, and the int field
 * speed. Add the following instance methods to the class:
 * <p>
 * - accelerate adds 5 to the speed each time it's called;
 * - brake subtracts 5 from the speed field each time it's called, the speed cannot be less than zero.
 */
public class Main {
}

class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        this.speed += 5;
    }

    public void brake() {
        if (this.speed >= 5) {
            this.speed -= 5;
        }
    }
}