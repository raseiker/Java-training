package ordenamiento_burbuja;

import java.util.ArrayList;
import java.util.Scanner;

import ordenamiento_burbuja.models.Employee;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        Integer userOption = -1;

        do {
            System.out.println("\n**Menu**");
            System.out.println("1. Create employee");
            System.out.println("2. Filter employee");
            System.out.println("3. Order employee");
            System.out.println("4. Increment salary");
            System.out.println("5. Clean filters");
            System.out.println("6. Exit");

            userOption = scanner.nextInt();
            scanner.nextLine();
            switch (userOption) {
                case 1:
                    Employee myEmployee = new Employee();

                    System.out.print("Specify a name: ");
                    myEmployee.setName(scanner.nextLine());

                    System.out.print("Specify an age: ");
                    myEmployee.setAge(scanner.nextInt());

                    System.out.print("Specify a salary: ");
                    myEmployee.setSalary(scanner.nextDouble());

                    System.out.print("Specify a department: ");
                    myEmployee.setDepartment(scanner.nextLine());

                    employees.add(myEmployee);

                    System.out.println("New employee has been added !");
                    break;
                case 4:
                    System.out.print("Name of the employee: ");
                    Employee result = Employee.filterByName(employees, scanner.nextLine().trim());

                    if (result == null) {
                        System.out.println("Employee with that name doesn't exist..");
                    } else {
                        System.out.println(result.getSalary());
                        System.out.print("Percentaje to increment: ");
                        result = Employee.incrementSalary(result, scanner.nextInt());

                        System.out.println("Salary was incremented successfully");
                        System.out.println(result.getSalary());

                    }
                default:
                    break;
            }
        } while (userOption != 6);

        scanner.close();
    }
}
