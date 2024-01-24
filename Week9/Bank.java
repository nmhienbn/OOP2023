package Week9;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private final List<Customer> customerList = new ArrayList<>();

    /**
     * Hien.
     */
    public void readCustomerList(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);
        Customer customer = null;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] customerInfo = line.split(" ");
            if (customerInfo[0].charAt(0) <= '9') {
                if (customerInfo[1].equals(Account.CHECKING)) {
                    customer.addAccount(new CheckingAccount(Long.parseLong(customerInfo[0]),
                            Double.parseDouble(customerInfo[2])));
                } else if (customerInfo[1].equals(Account.SAVINGS)) {
                    customer.addAccount(new SavingsAccount(Long.parseLong(customerInfo[0]),
                            Double.parseDouble(customerInfo[2])));
                }
            } else {
                if (customer != null) {
                    customerList.add(customer);
                }
                String name = "";
                long idNumber = 0;
                for (int i = 0; i < customerInfo.length; i++) {
                    if (customerInfo[i].charAt(i) > '9') {
                        if (!name.isEmpty()) {
                            name += " ";
                        }
                        name += customerInfo[i];
                    } else {
                        idNumber = Long.parseLong(customerInfo[i]);
                    }
                }
                customer = new Customer(idNumber, name);
            }
        }
        if (customer != null) {
            customerList.add(customer);
        }
    }

    /**
     * Hien.
     */
    public String getCustomersInfoByNameOrder() {
        customerList.sort(Comparator.comparing(Customer::getFullName));
        String res = "";
        for (Customer customer : customerList) {
            res += customer.getCustomerInfo();
            res += "\n";
        }
        return res;
    }

    /**
     * Hien.
     */
    public String getCustomersInfoByIdOrder() {
        customerList.sort(Comparator.comparingLong(Customer::getIdNumber));
        String res = "";
        for (Customer customer : customerList) {
            res += customer.getCustomerInfo();
            res += "\n";
        }
        return res;
    }

    /**
     * Hien.
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }
}
