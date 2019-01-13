package stage6.hw23;

/**
 * Given a class named Complex. It represents a complex number with a real and imaginary parts.
 * <p>
 * Write two instance methods for this class:
 * <p>
 * - add takes another complex number and add the corresponding fields to the current instance;
 * - subtract takes another complex number and subtract the corresponding fields from the current instance;
 * <p>
 * Both methods should return nothing.
 */
public class Main {
}

class Complex {

    double real;
    double image;

    public void add(Complex other) {
        this.real += other.real;
        this.image += other.image;
    }

    public void subtract(Complex other) {
        this.real -= other.real;
        this.image -= other.image;
    }
}