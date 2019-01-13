package stage6.hw20;

/**
 * Given a class named Box. It has three double fields.
 * <p>
 * Write an instance method to calculate the volume of the box. The method must be named getVolume. It should take no
 * arguments and returns a double result.
 */
public class Main {
}

class Box {

    double height;
    double width;
    double length;

    public double getVolume() {
        return this.height * this.width * this.length;
    }
}