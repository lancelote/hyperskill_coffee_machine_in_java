package stage6.hw19;

/**
 * Given a class named Application with one string field name.
 * <p>
 * Add an instance method named run that takes an array of strings and returns nothing. The method should output the
 * name of the application and then all arguments, each in a new line.
 * <p>
 * Here is an output example after calling the method:
 * <p>
 * SimpleApplication
 * arg1
 * arg2
 * arg3
 */
public class Main {
}

class Application {

    String name;

    public void run(String[] args) {
        System.out.println(this.name);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}