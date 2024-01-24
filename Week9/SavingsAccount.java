package Week9;

public class SavingsAccount extends Account {
    /**
     * Hien.
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Hien.
     */
    @Override
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);
            if (amount > 1000) {
                throw new InvalidFundingAmountException(amount);
            }
            if (this.getBalance() < 5000) {
                throw new InsufficientFundsException(amount);
            }
            addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
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
            addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                    amount, balance, balance + amount));
            balance += amount;
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
