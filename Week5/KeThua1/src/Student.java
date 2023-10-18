public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * Getter.
     */
    public String getProgram() {
        return program;
    }

    /**
     * Setter.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Getter.
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getter.
     */
    public double getFee() {
        return fee;
    }

    /**
     * Setter.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student["
                + super.toString()
                + ",program=" + program
                + ",year=" + year
                + ",fee=" + fee
                + ']';
    }
}
