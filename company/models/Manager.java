package company.models;

import company.abstracts.Employee;

// klasa manager dziedzicząca po klasie employee
public class Manager extends Employee {
    public Manager(String name, double salary, int id, String hireDate, String position) {
        super(name, salary, id, hireDate, position);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing...");  // metoda work dla managera
    }
}
