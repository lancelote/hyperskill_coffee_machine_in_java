package stage6.hw14;

/**
 * Write a class named Book. It must have three fields: string field title, int field yearOfPublishing, an array of
 * strings authors and a constructor to initialize the fields. The order of parameters in the constructor must be the
 * same as presented above.
 */
public class Main {
}

class Book {
    String title;
    int yearOfPublishing;
    String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }
}