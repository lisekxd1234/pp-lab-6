package company.abstracts;

import company.interfaces.Employable;

// abstrakcyjna klasa pracownika implementująca interfejs zatrudnialny
public abstract class Employee implements Employable {
    private String name;  // prywatne pole przechowujące imię pracownika
    private double salary;  // prywatne pole przechowujące wynagrodzenie pracownika
    private int id;  // prywatne pole przechowujące identyfikator pracownika
    private String hireDate;  // data zatrudnienia pracownika
    private String position;  // stanowisko pracownika

    // konstruktor klasy pracownika przyjmujący nowe pola data zatrudnienia i stanowisko
    public Employee(String name, double salary, int id, String hireDate, String position) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.hireDate = hireDate;
        this.position = position;
    }

    // metoda publiczna zwracająca imię pracownika
    public String getName() {
        return name;
    }

    // metoda publiczna zwracająca wynagrodzenie pracownika
    public double getSalary() {
        return salary;
    }

    // metoda zwracająca datę zatrudnienia pracownika
    public String getHireDate() {
        return hireDate;
    }

    // metoda zwracająca stanowisko pracownika
    public String getPosition() {
        return position;
    }

    // metoda zwracająca hash kod na podstawie id pracownika
    @Override
    public int hashCode() {
        return id;
    }

    // metoda porównująca pracowników na podstawie id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}
