package Week9;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private final List<Account> accountList = new ArrayList<>();

    /**
     * Hien.
     */
    public Customer() {
    }

    /**
     * Hien.
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * Hien.
     */
    public String getCustomerInfo() {
        return "Số CMND: " + idNumber + ". "
                + "Họ tên: " + fullName + ".";
    }

    /**
     * Hien.
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * Hien.
     */
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    /**
     * Hien.
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * Hien.
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Hien.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Hien.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Hien.
     */
    public List<Account> getAccountList() {
        return accountList;
    }
}
