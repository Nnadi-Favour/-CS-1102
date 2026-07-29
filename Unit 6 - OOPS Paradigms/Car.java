/**
 * Car.java
 * Unit 6 Programming Assignment
 * Represents a Car that implements the Vehicle and CarVehicle interfaces.
 */

public class Car implements Vehicle, CarVehicle {

    // Common vehicle information
    private String make;
    private String model;
    private int year;

    // Car-specific information
    private int numberOfDoors;
    private String fuelType;

    /**
     * Constructor
     */
    public Car(String make,
               String model,
               int year,
               int numberOfDoors,
               String fuelType) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;

    }

    // =========================
    // Vehicle Interface Methods
    // =========================

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

    // ============================
    // CarVehicle Interface Methods
    // ============================

    @Override
    public void setNumberOfDoors(int doors) {
        this.numberOfDoors = doors;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Display car details.
     */
    public void displayDetails() {

        System.out.println("\n----- Car Details -----");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);

    }

}