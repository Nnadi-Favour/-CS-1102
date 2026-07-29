/**
 * CarVehicle.java
 * Unit 6 Programming Assignment
 * Interface containing methods specific to cars.
 */

public interface CarVehicle {

    /**
     * Set the number of doors.
     */
    void setNumberOfDoors(int doors);

    /**
     * Get the number of doors.
     */
    int getNumberOfDoors();

    /**
     * Set the fuel type.
     */
    void setFuelType(String fuelType);

    /**
     * Get the fuel type.
     */
    String getFuelType();

}