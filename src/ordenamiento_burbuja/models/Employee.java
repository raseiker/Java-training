package ordenamiento_burbuja.models;

import java.util.ArrayList;

public class Employee {
    private String name;
    private Integer age;
    private String department;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, Integer age, String department, Double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public void showEmployees(ArrayList<Employee> employees) {
        String result = "N° | Name        | Salary    | Department";
        result += "\n";

        for (int i = 0; i < employees.size(); i++) {
            result += (i + 1) + "| " + employees.get(i).name + "| " + employees.get(i).salary + "| "
                    + employees.get(i).department;
            result += "\n";
        }
    }

    public ArrayList<Employee> filterEmployee(ArrayList<Employee> employees, String nameOrDepartment,
            Double salaryOrAge) {
        ArrayList<Employee> filteredEmployees = new ArrayList<>();

        for (Employee employee : employees) {   
            if (nameOrDepartment.equals(employee.name) || nameOrDepartment.equals(employee.department)) {
                filteredEmployees.add(employee);
            }
        }
        //filter from age and salary is missing
        return filteredEmployees;            
    }

    public static Employee filterByName(ArrayList<Employee> employees, String name) {
        Employee employeeFiltered = null;

        for (Employee employee : employees) {
            if (name.equals(employee.name)) {
                employeeFiltered = employee;
                break;
            }
        }

        return employeeFiltered;
    }

    public static Employee incrementSalary(Employee employee, Integer percentage) {
        employee.salary =  employee.salary * (1 + (percentage/100));
        return employee;
    }

}
