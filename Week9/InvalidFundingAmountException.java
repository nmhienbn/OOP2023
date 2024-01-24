package Week9;

public class InvalidFundingAmountException extends BankException {
    /** Hien. */
    public InvalidFundingAmountException(double amount) {
        super(String.format("Số tiền không hợp lệ: $%.2f", amount));
    }
}
