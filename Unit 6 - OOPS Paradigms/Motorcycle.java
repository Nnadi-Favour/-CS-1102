/**
 * Motorcycle.java
 * Unit 6 Programming Assignment
 * Represents a Motorcycle that implements the Vehicle and MotorVehicle interfaces.
 */

public class Motorcycle implements Vehicle, MotorVehicle {

    // Common vehicle information
    private String make;
    private String model;
    private int year;

    // Motorcycle-specific information
    private int numberOfWheels;
    private String motorcycleType;

    /**
     * Constructor
     */
    public Motorcycle(String make,
                      String model,
                      int year,
                      int numberOfWheels,
                      String motorcycleType) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfWheels = numberOfWheels;
        this.motorcycleType = motorcycleType;

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

    // ==================================
    // MotorVehicle Interface Methods
    // ==================================

    @Override
    public void setNumberOfWheels(int wheels) {
        this.numberOfWheels = wheels;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void setMotorcycleType(String type) {
        this.motorcycleType = type;
    }

    @Override
    public String getMotorcycleType() {
        return motorcycleType;
    }

    /**
     * Display motorcycle details.
     */
    public void displayDetails() {

        System.out.println("\n----- Motorcycle Details -----");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Motorcycle Type: " + motorcycleType);

    }

}