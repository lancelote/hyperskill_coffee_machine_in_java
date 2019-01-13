package stage6.hw13;


/**
 * There are two classes: Account with three fields (code, balance, owner) and User with three fields (login,
 * firstName, lastName). Both classes have parameterized constructors. See full declarations of these classes in the
 * code template. Do not afraid the static keyword. It's not important now.
 * <p>
 * In the main method, create an instance of the Account class and pass it to the process method by calling
 * process(account).
 * <p>
 * The instance must have the next values of the fields:
 * <p>
 * code = "123456",
 * balance = 1000,
 * owner = (login = "demo-user", firstName = "Alexander", lastName = "Schmidt").
 * <p>
 * Note, the owner is an instance of the User class.
 * <p>
 * All strings should be without "".
 * <p>
 * See provided template, do not change it.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("demo-user", "Alexander", "Schmidt");
        Account account = new Account("123456", 1000L, user);

        process(account);
    }

    static void process(Account account) {
    }

    static class Account {

        private String code;
        private Long balance;
        private User owner;

        public Account(String code, Long balance, User owner) {
            this.code = code;
            this.balance = balance;
            this.owner = owner;
        }

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public User getOwner() {
            return owner;
        }
    }

    static class User {

        private String login;
        private String firstName;
        private String lastName;

        public User(String login, String firstName, String lastName) {
            this.login = login;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getLogin() {
            return login;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}