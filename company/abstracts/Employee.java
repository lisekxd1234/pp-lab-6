package company.abstracts;

import company.interfaces.Employable;

// abstrakcyjna klasa employee implementująca interfejs employable
public abstract class Employee implements Employable {
    private String name;  // prywatne pole przechowujące imię pracownika
    private double salary;  // prywatne pole przechowujące wynagrodzenie pracownika
    private int id;  // prywatne pole przechowujące identyfikator pracownika

    // konstruktor klasy employee
    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    // metoda publiczna zwracająca imię pracownika
    public String getName() {
        return name;
    }

    // metoda publiczna zwracająca wynagrodzenie pracownika
    public double getSalary() {
        return salary;
    }
}
