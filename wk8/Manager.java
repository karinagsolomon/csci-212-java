public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double pay() {
    	// You can not directly access employee's salary since it is private
        return super.pay() + bonus / 26.0;  
    }
}