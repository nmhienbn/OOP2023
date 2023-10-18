public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * Getter.
     */
    public String getSchool() {
        return school;
    }

    /**
     * Setter.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * Getter.
     */
    public double getPay() {
        return pay;
    }

    /**
     * Setter.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff["
                + super.toString()
                + ",school=" + school
                + ",pay=" + pay
                + ']';
    }
}
