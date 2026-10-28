public class HourlyEmployee extends Employee implements Taxable {

    private double rate;
    private double hours;

    public HourlyEmployee(String name, double rate, double hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double pay() {
        return rate * hours;
    }

    @Override
    public double tax() {
        return pay() * 0.15;
    }
}