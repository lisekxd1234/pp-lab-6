import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

// główna klasa aplikacji
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();  // lista przechowująca obiekty pracowników
        employees.add(new Worker("Jan Kowalski", 3000, 1, "2024-01-01", "Developer"));
        employees.add(new Worker("Anna Nowak", 3500, 2, "2023-12-01", "Designer"));
        employees.add(new Worker("Piotr Zalewski", 3200, 3, "2024-02-01", "Tester"));
        employees.add(new Manager("Robert Lewandowski", 5000, 4, "2022-05-01", "Team Leader"));

        // obliczanie całkowitej sumy pensji wszystkich pracowników
        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("całkowita suma pensji wszystkich pracowników: " + totalSalary);

        // obliczanie sumy pensji wszystkich workerów
        double totalWorkerSalary = employees.stream()
            .filter(e -> e instanceof Worker)
            .mapToDouble(Employee::getSalary)
            .sum();
        System.out.println("suma pensji wszystkich workerów: " + totalWorkerSalary);

        // obliczanie sumy pensji wszystkich managerów
        double totalManagerSalary = employees.stream()
            .filter(e -> e instanceof Manager)
            .mapToDouble(Employee::getSalary)
            .sum();
        System.out.println("suma pensji wszystkich managerów: " + totalManagerSalary);

        // wyświetla w terminalu informacje o tych kowatach, będzie wyszukiwał wszystkie instancje obiektu, które mają swój odpowiednik w kolekcji (posiadają to samo id)
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).hashCode() == employees.get(j).hashCode()) {
                    System.out.println("pracownicy o tym samym id: " + employees.get(i).getName() + " i " + employees.get(j).getName());
                }
            }
        }
    }
}
