/**
 * MotorVehicle.java
 * Unit 6 Programming Assignment
 * Interface containing methods specific to motorcycles.
 */

public interface MotorVehicle {

    /**
     * Set the number of wheels.
     */
    void setNumberOfWheels(int wheels);

    /**
     * Get the number of wheels.
     */
    int getNumberOfWheels();

    /**
     * Set the motorcycle type.
     */
    void setMotorcycleType(String type);

    /**
     * Get the motorcycle type.
     */
    String getMotorcycleType();

}