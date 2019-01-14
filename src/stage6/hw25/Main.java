package stage6.hw25;

import java.util.Scanner;

public class Main {

    /**
     * The method change the balance of the given account according to an operation.
     *
     * @param account
     * @param operation
     * @return true if the balance has changed, otherwise - false.
     */
    public static boolean changeBalance(Account account, Operation operation, Long sum) {
        switch (operation) {
            case DEPOSIT:
                account.setBalance(account.getBalance() + sum);
                return true;
            case WITHDRAW:
                if (account.getBalance() < sum) {
                    System.out.println("Not enough money to withdraw.");
                    return false;
                } else {
                    account.setBalance(account.getBalance() - sum);
                    return true;
                }
            default:
                System.out.println("Unknown operation");
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account account = new Account();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }

    /* Do not change code below */
    enum Operation {
        /**
         * deposit (add) an amount into an Account
         */
        DEPOSIT,
        /**
         * withdraw (subtract) an amount from an Account
         */
        WITHDRAW
    }

    static class Account {

        private String code;
        private Long balance;

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long balance) {
            this.balance = balance;
        }
    }
}