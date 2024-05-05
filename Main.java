import company.models.Manager;
import company.models.Worker;

// główna klasa aplikacji
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Kowalski", 3000, 1);
        Worker worker2 = new Worker("Anna Nowak", 3500, 2);
        Worker worker3 = new Worker("Piotr Zalewski", 3200, 3);
        Manager manager = new Manager("Robert Lewandowski", 5000, 4);

        // wyświetlenie wynagrodzenia i wywołanie metody work dla każdego z pracowników
        System.out.println(worker1.getName() + " zarabia: " + worker1.getSalary());
        worker1.work();
        System.out.println(worker2.getName() + " zarabia: " + worker2.getSalary());
        worker2.work();
        System.out.println(worker3.getName() + " zarabia: " + worker3.getSalary());
        worker3.work();
        System.out.println(manager.getName() + " zarabia: " + manager.getSalary());
        manager.work();
    }
}
