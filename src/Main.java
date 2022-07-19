import java.awt.*;

/**
 * Create an employee class.
 * Attributes : name, age, salary, location
 * Behavior : raiseSalary
 * Get creative!
 *
 * as part of the challenge you have to determine which member is
 * Static or non-static
 *
 * Create a Main class for building Employee instances
 * Build two Employee instances
 * Give one Employee a raise
 * Display the salaries of both Employees
 *
 */
public class Main {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Daniel Roberts",
                "Stockholm",35000,34);

        Employee employeeTwo = new Employee("Matt Johnson",
                "Malmö",30000,32);

        employeeTwo.raiseSalary();

        System.out.println(employeeOne.salary);
        System.out.println(employeeTwo.salary);

    }
}