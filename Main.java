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
        Manager manager = new Manager("Robert Lewandowski", 5000, 4, "2022-05-01", "Team Leader");

        // wyświetlanie kodu hash i porównywanie pracowników
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " ma kod: " + employee.hashCode());
        }

        // Sprawdzanie równości pracowników
        Employee firstWorker = employees.get(0);
        for (int i = 1; i < employees.size(); i++) {
            System.out.println("Porównanie " + firstWorker.getName() + " z " + employees.get(i).getName() + ": " + firstWorker.equals(employees.get(i)));
        }
    }
}
