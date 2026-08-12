# Unit 8 – Function Interface and Streams in Java

## Overview

This project is the Unit 8 Programming Assignment for CS 1102. It demonstrates the use of Java's `Function` interface and Stream API to process an employee dataset.

The program stores employee information in an `ArrayList` and uses functional programming techniques to transform, filter, and analyze the data.

## Learning Objectives

This project demonstrates how to:

- Create and use the `Function` interface.
- Use lambda expressions in Java.
- Process collections using streams.
- Transform objects using `map()`.
- Filter objects using `filter()`.
- Calculate numerical results using `mapToDouble()` and `average()`.
- Collect stream results into a new collection.
- Process employee information efficiently and clearly.

## Employee Dataset

Each employee contains the following information:

- Name
- Age
- Department
- Salary

The program contains eight sample employees.

## Function Interface

The program uses:

```java
Function<Employee, String> employeeDetails =
        employee -> employee.getName()
                + " - "
                + employee.getDepartment();