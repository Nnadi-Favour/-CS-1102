# Unit 6 – Interfaces and Polymorphism

## Overview

This project is a console-based Java application that demonstrates the implementation of interfaces, encapsulation, and polymorphism in object-oriented programming. The application simulates a Vehicle Information System that allows users to create and manage different types of vehicles, including cars, motorcycles, and trucks.

The project emphasizes code reusability by defining common behaviors through interfaces while allowing each vehicle class to provide its own implementation. It also demonstrates runtime polymorphism by storing different vehicle objects in a common collection.

---

## Learning Objectives

This project demonstrates:

- Interfaces
- Encapsulation
- Polymorphism
- Method Overriding
- Dynamic Binding
- Abstraction
- ArrayList Collections
- Object-Oriented Design
- User Interaction using Scanner
- Input Validation

---

## Features

- Add a Car
- Add a Motorcycle
- Add a Truck
- Display all vehicle details
- Interactive menu-driven application
- Interface implementation
- Runtime polymorphism
- Encapsulation using private variables
- Basic error handling for invalid menu input

---

## Technologies

- Java
- Interfaces
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner
- Java Collections Framework

---

## Project Structure

- `Vehicle.java` – Base interface defining common vehicle methods.
- `CarVehicle.java` – Interface containing car-specific methods.
- `MotorVehicle.java` – Interface containing motorcycle-specific methods.
- `TruckVehicle.java` – Interface containing truck-specific methods.
- `Car.java` – Implements `Vehicle` and `CarVehicle`.
- `Motorcycle.java` – Implements `Vehicle` and `MotorVehicle`.
- `Truck.java` – Implements `Vehicle` and `TruckVehicle`.
- `Unit6.java` – Main program containing the interactive menu system.

---

## How to Run

1. Open the project in GitHub Codespaces or any Java IDE.
2. Compile all Java files:

```bash
javac *.java
```

3. Run the application:

```bash
java Unit6
```

4. Use the interactive menu to:
   - Add a Car
   - Add a Motorcycle
   - Add a Truck
   - Display all vehicle details
   - Exit the program

---

## Sample Output

```text
====================================
      Vehicle Information System
====================================
1. Add Car
2. Add Motorcycle
3. Add Truck
4. Display All Vehicles
5. Exit
```

---

## Author

**Nnadi Favour Iheoma**

