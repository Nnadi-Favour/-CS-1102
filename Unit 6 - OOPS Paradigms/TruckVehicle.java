/**
 * TruckVehicle.java
 * Unit 6 Programming Assignment
 * Interface containing methods specific to trucks.
 */

public interface TruckVehicle {

    /**
     * Set cargo capacity.
     */
    void setCargoCapacity(double capacity);

    /**
     * Get cargo capacity.
     */
    double getCargoCapacity();

    /**
     * Set transmission type.
     */
    void setTransmissionType(String transmission);

    /**
     * Get transmission type.
     */
    String getTransmissionType();

}