/**
 * Truck.java
 * Unit 6 Programming Assignment
 * Implements Vehicle and TruckVehicle interfaces
 */

public class Truck implements Vehicle, TruckVehicle {

    // Private instance variables
    private String make;
    private String model;
    private int year;
    private double cargoCapacity;
    private String transmissionType;

    // Constructor
    public Truck(String make,
                 String model,
                 int year,
                 double cargoCapacity,
                 String transmissionType) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.cargoCapacity = cargoCapacity;
        this.transmissionType = transmissionType;

    }

    // ---------------- Vehicle Interface ----------------

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    // ---------------- TruckVehicle Interface ----------------

    @Override
    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public String getTransmissionType() {
        return transmissionType;
    }

    /**
     * Display truck information.
     */
    public void displayDetails() {

        System.out.println("\n===== Truck Details =====");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Transmission Type: " + transmissionType);

    }

}