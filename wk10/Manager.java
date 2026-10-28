public class Manager extends Employee { // implement taxable
    
	private double salary;
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        return salary / 26.0 + bonus / 26.0;
    }

    // Complete tax()
}