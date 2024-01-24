package Week8.B1;

public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructor.
     *
     * @param brand              brand
     * @param model              model
     * @param registrationNumber registrationNumber
     * @param owner              owner
     * @param numberOfDoors      numberOfDoors
     */
    public Car(String brand, String model,
               String registrationNumber, Person owner,
               int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Hien.
     */
    @Override
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + brand + "\n"
                + "\tModel: " + model + "\n"
                + "\tRegistration Number: " + registrationNumber + "\n"
                + "\tNumber of Doors: " + numberOfDoors + "\n"
                + "\tBelongs to " + owner.getName()
                + " - " + owner.getAddress();
    }

    /**
     * Hien.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Hien.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
