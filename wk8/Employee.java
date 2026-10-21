public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { 
    	return name; 
    }

    public double pay() { 
    	return salary / 26.0; 
    }

    public String toString() { 
    	return name + " is paid " + pay(); 
    }
}

class Manager extends Employee {
    private String name;
    private double salary;
    private double bonus;

    public Manager(String name, double salary, double bonus){
        super(name, salary);
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() { 
    	return name; 
    }

    // public double pay() { 
    // 	return salary / 26.0; 
    // }

    // Add a getter for bonus.
    public double getBonus(){
        return bonus / 26.0;
    }

    // Override pay() so that a manager receives the normal employee pay plus bonus / 26.0.
    @Override
    public double pay(){
        return super.pay() + getBonus();
    }

    public String toString() { 
    	return name + " is paid $" + pay() + " plus a bonus of $" + getBonus(); 
    }

}