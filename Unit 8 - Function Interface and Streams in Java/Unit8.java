import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Unit 8 Programming Assignment
 *
 * This program demonstrates the use of the Function interface
 * and Java Streams to process employee data.
 */
public class Unit8 {

    /**
     * Employee class representing an employee in the company.
     */
    static class Employee {
        private String name;
        private int age;
        private String department;
        private double salary;

        // Constructor
        public Employee(String name, int age, String department, double salary) {
            this.name = name;
            this.age = age;
            this.department = department;
            this.salary = salary;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // STEP 1: Create and store the employee dataset
        // ---------------------------------------------------------

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice Johnson", 28,
                "Human Resources", 45000));

        employees.add(new Employee("Brian Smith", 35,
                "Information Technology", 65000));

        employees.add(new Employee("Catherine Williams", 42,
                "Finance", 72000));

        employees.add(new Employee("David Brown", 31,
                "Marketing", 58000));

        employees.add(new Employee("Emma Davis", 26,
                "Sales", 42000));

        employees.add(new Employee("Frank Wilson", 39,
                "Information Technology", 68000));

        employees.add(new Employee("Grace Taylor", 33,
                "Human Resources", 54000));

        employees.add(new Employee("Henry Moore", 29,
                "Finance", 50000));


        // ---------------------------------------------------------
        // STEP 2: Create a Function using the Function interface
        // ---------------------------------------------------------

        /*
         * Function<Employee, String> means:
         *
         * Input  = Employee
         * Output = String
         *
         * The function takes an Employee object and returns
         * the employee's name and department as one string.
         */
        Function<Employee, String> employeeDetails =
                employee -> employee.getName()
                        + " - "
                        + employee.getDepartment();


        // ---------------------------------------------------------
        // STEP 3: Use a Stream to create a collection of strings
        // ---------------------------------------------------------

        List<String> employeeDetailsList = employees.stream()
                .map(employeeDetails)
                .collect(Collectors.toList());


        // ---------------------------------------------------------
        // STEP 4: Calculate the average salary of all employees
        // ---------------------------------------------------------

        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);


        // ---------------------------------------------------------
        // STEP 5: Filter employees whose age is above 30
        // ---------------------------------------------------------

        int ageThreshold = 30;

        List<Employee> employeesAbove30 = employees.stream()
                .filter(employee -> employee.getAge() > ageThreshold)
                .collect(Collectors.toList());


        // ---------------------------------------------------------
        // BONUS: Calculate average salary of employees above 30
        // ---------------------------------------------------------

        double averageSalaryAbove30 = employees.stream()
                .filter(employee -> employee.getAge() > ageThreshold)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);


        // ---------------------------------------------------------
        // STEP 6: Display the results
        // ---------------------------------------------------------

        System.out.println("==================================================");
        System.out.println("       EMPLOYEE STREAM PROCESSING PROGRAM");
        System.out.println("==================================================");

        System.out.println("\nEmployee Name and Department:");
        System.out.println("------------------------------------------");

        int count = 1;

        for (String details : employeeDetailsList) {
            System.out.println(count + ". " + details);
            count++;
        }


        System.out.println("\nAverage Salary of All Employees:");
        System.out.printf("$%,.2f%n", averageSalary);


        System.out.println("\nEmployees Above Age " + ageThreshold + ":");
        System.out.println("------------------------------------------");

        for (Employee employee : employeesAbove30) {
            System.out.printf(
                    "%s | Age: %d | Department: %s | Salary: $%,.2f%n",
                    employee.getName(),
                    employee.getAge(),
                    employee.getDepartment(),
                    employee.getSalary()
            );
        }


        System.out.println("\nAverage Salary of Employees Above Age "
                + ageThreshold + ":");
        System.out.printf("$%,.2f%n", averageSalaryAbove30);


        System.out.println("\nSummary:");
        System.out.println("------------------------------------------");
        System.out.println("Total Employees: " + employees.size());
        System.out.println(
                "Employees Above Age " + ageThreshold + ": "
                        + employeesAbove30.size()
        );


        System.out.println("\n==================================================");
        System.out.println("       PROGRAM COMPLETED SUCCESSFULLY");
        System.out.println("==================================================");
    }
}