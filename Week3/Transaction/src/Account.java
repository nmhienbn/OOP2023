import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * Deposit money.
     */
    private final void deposit(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
        }
    }

    /**
     * Withdraw money.
     */
    private final void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
        }
    }

    /**
     * Add a transaction.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Print all transactions.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            System.out.printf("Giao dich %d: %s tien $%.2f. So du luc nay: $%.2f.\n",
                    i + 1, transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)
                            ? "Nap" : "Rut",
                    transitionList.get(i).getAmount(), transitionList.get(i).getBalance());
        }
    }
}
