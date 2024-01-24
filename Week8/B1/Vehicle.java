package Week8.B1;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * Constructor.
     *
     * @param brand              brand
     * @param model              model
     * @param registrationNumber registrationNumber
     * @param owner              owner
     */
    public Vehicle(String brand, String model,
                   String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * Hien.
     */
    public abstract String getInfo();

    /**
     * Hien.
     */
    public void transferOwnership(Person newOwer) {
        this.owner.removeVehicle(this.registrationNumber);
        this.owner = newOwer;
        this.owner.addVehicle(this);
    }

    /**
     * Hien.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Hien.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Hien.
     */
    public String getModel() {
        return model;
    }

    /**
     * Hien.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Hien.
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Hien.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Hien.
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * Hien.
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
