public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double pay();

    public String toString() {
        return name + " is paid " + pay();
    }
}