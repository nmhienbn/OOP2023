

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;

    List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param name    name
     * @param address address
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Hien.
     */
    public void addVehicle(Vehicle vehicle) {
        for (Vehicle value : vehicleList) {
            if (value.getRegistrationNumber().equals(vehicle.getRegistrationNumber())) {
                return;
            }
        }
        vehicleList.add(vehicle);
    }

    /**
     * Hien.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(i);
                break;
            }
        }
    }

    /**
     * Hien.
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        }
        StringBuilder result = new StringBuilder();
        result.append(name).append(" has:\n\n");
        for (Vehicle vehicle : vehicleList) {
            result.append(vehicle.getInfo()).append("\n");
        }
        return result.toString();
    }

    /**
     * Hien.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Hien.
     */
    public String getName() {
        return name;
    }

    /**
     * Hien.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Hien.
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
