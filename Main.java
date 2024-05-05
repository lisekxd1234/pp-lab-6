import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

// główna klasa aplikacji
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();  // lista przechowująca obiekty employee
        employees.add(new Worker("Jan Kowalski", 3000, 1, "2024-01-01", "Developer"));
        employees.add(new Worker("Anna Nowak", 3500, 2, "2023-12-01", "Designer"));
        employees.add(new Worker("Piotr Zalewski", 3200, 3, "2024-02-01", "Tester"));
        employees.add(new Manager("Robert Lewandowski", 5000, 4, "2022-05-01", "Team Leader"));

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " (ID: " + employee.hashCode() + "), Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary());
            employee.work();
        }
    }
}
