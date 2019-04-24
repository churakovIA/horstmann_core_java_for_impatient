package ch3.interfaces;

public class Employee implements Measurable {

    private static int counter = 0;

    private int id;
    private String name;
    private double salary;

    public Employee(double salary) {
        this.id = ++counter;
        this.salary = salary;
    }

    Employee(String name, double salary) {
        this(salary);
        this.name = name;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
