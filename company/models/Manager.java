package company.models;

import company.abstracts.Employee;

// klasa manager dziedzicząca po klasie employee
public class Manager extends Employee {
    public Manager(String name, double salary, int id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing...");  // metoda work dla managera
    }
}
