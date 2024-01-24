package Week9;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    /**
     * Hien.
     */
    public Account() {
    }

    /**
     * Hien.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Hien.
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Hien.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Hien.
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }
    }

    /**
     * Hien.
     */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        }
    }

    /**
     * Hien.
     */
    public abstract void withdraw(double amount);

    /**
     * Hien.
     */
    public abstract void deposit(double amount);

    /**
     * Hien.
     */
    public String getTransactionHistory() {
        String result = "Lịch sử giao dịch của tài khoản " + accountNumber + ":\n";
        for (int i = 0; i < transactionList.size(); i++) {
            result += "- " + transactionList.get(i).getTransactionSummary() + "\n";
        }
        return result;
    }

    /**
     * Hien.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * Hien.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Account)) {
            return false;
        }
        Account account = (Account) o;
        return accountNumber == account.accountNumber;
    }
}
