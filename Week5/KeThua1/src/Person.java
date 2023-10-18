public class Person {
    private String name;
    private String address;

    /**
     * Constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Get name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person["
                + "name=" + name
                + ",address=" + address
                + ']';
    }
}