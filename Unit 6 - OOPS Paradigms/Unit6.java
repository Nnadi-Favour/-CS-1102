/**
 * Unit6.java
 * Programming Assignment Unit 6
 * Vehicle Information System
 * Demonstrates the use of interfaces, inheritance,
 * polymorphism, encapsulation, and user interaction.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Unit6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("      Vehicle Information System");
            System.out.println("====================================");
            System.out.println("1. Add Car");
            System.out.println("2. Add Motorcycle");
            System.out.println("3. Add Truck");
            System.out.println("4. Display All Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
                System.out.print("Enter your choice: ");
            }

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\n----- Add Car -----");

                    System.out.print("Enter Make: ");
                    String carMake = input.nextLine();

                    System.out.print("Enter Model: ");
                    String carModel = input.nextLine();

                    System.out.print("Enter Year: ");
                    int carYear = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Number of Doors: ");
                    int doors = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Fuel Type (Petrol/Diesel/Electric): ");
                    String fuel = input.nextLine();

                    Car car = new Car(
                            carMake,
                            carModel,
                            carYear,
                            doors,
                            fuel);

                    vehicles.add(car);

                    System.out.println("Car added successfully.");

                    break;

                case 2:

                    System.out.println("\n----- Add Motorcycle -----");

                    System.out.print("Enter Make: ");
                    String bikeMake = input.nextLine();

                    System.out.print("Enter Model: ");
                    String bikeModel = input.nextLine();

                    System.out.print("Enter Year: ");
                    int bikeYear = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Number of Wheels: ");
                    int wheels = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Motorcycle Type (Sport/Cruiser/Off-road): ");
                    String type = input.nextLine();

                    Motorcycle motorcycle = new Motorcycle(
                            bikeMake,
                            bikeModel,
                            bikeYear,
                            wheels,
                            type);

                    vehicles.add(motorcycle);

                    System.out.println("Motorcycle added successfully.");

                    break;

                case 3:

                    System.out.println("\n----- Add Truck -----");

                    System.out.print("Enter Make: ");
                    String truckMake = input.nextLine();

                    System.out.print("Enter Model: ");
                    String truckModel = input.nextLine();

                    System.out.print("Enter Year: ");
                    int truckYear = input.nextInt();

                    System.out.print("Enter Cargo Capacity (tons): ");
                    double capacity = input.nextDouble();
                    input.nextLine();

                    System.out.print("Enter Transmission (Manual/Automatic): ");
                    String transmission = input.nextLine();

                    Truck truck = new Truck(
                            truckMake,
                            truckModel,
                            truckYear,
                            capacity,
                            transmission);

                    vehicles.add(truck);

                    System.out.println("Truck added successfully.");

                    break;

                case 4:

                    System.out.println("\n========== VEHICLE DETAILS ==========");

                    if (vehicles.isEmpty()) {

                        System.out.println("No vehicles available.");

                    } else {

                        for (Vehicle vehicle : vehicles) {

                            if (vehicle instanceof Car) {

                                ((Car) vehicle).displayDetails();

                            } else if (vehicle instanceof Motorcycle) {

                                ((Motorcycle) vehicle).displayDetails();

                            } else if (vehicle instanceof Truck) {

                                ((Truck) vehicle).displayDetails();

                            }

                            System.out.println("----------------------------------");

                        }

                    }

                    break;

                case 5:

                    System.out.println("Program terminated successfully.");
                    break;

                default:

                    System.out.println("Invalid menu choice.");

            }

        } while (choice != 5);

        input.close();

    }

}