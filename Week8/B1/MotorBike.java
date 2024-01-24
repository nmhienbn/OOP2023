package Week8.B1;

public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * Constructor.
     *
     * @param brand              brand
     * @param model              model
     * @param registrationNumber registrationNumber
     * @param owner              owner
     * @param hasSidecar         hasSidecar
     */
    public MotorBike(String brand, String model,
                     String registrationNumber, Person owner,
                     boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Hien.
     */
    @Override
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + brand + "\n"
                + "\tModel: " + model + "\n"
                + "\tRegistration Number: " + registrationNumber + "\n"
                + "\tHas Side Car: " + hasSidecar + "\n"
                + "\tBelongs to " + owner.getName()
                + " - " + owner.getAddress();
    }

    /**
     * Hien.
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * Hien.
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
