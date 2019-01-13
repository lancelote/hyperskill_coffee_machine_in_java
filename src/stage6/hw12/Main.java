package stage6.hw12;

/**
 * Write a class named Account. It must have three fields: a long field balance, string field ownerName, and boolean
 * flag locked, and a constructor with three parameters to initialize these fields. The order of parameters in the
 * constructor must be the same as presented above.
 */
public class Main {
}

class Account {
    long balance;
    String ownerName;
    boolean locked;

    public Account(long balance, String ownerName, boolean locked) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.locked = locked;
    }
}