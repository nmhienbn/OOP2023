package Week9;

public class CheckingAccount extends Account {
    /**
     * Hien.
     */
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Hien.
     */
    @Override
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);
            addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_CHECKING,
                    amount, balance, balance - amount));
            balance -= amount;
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Hien.
     */
    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_CHECKING,
                    amount, balance, balance + amount));
            balance += amount;
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
