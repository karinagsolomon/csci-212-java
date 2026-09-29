public class Package {
    private String label;
    private double weight;

    public Package(String label, double weight) {
        this.label = label;
        this.weight = weight;
    }
    
    // When only providing the label
    public Package(String label) {
        this.label = label;
        this.weight = 0.0;
    }

    public String getLabel() {
        return label;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0)
            this.weight = weight;
    }

    public double shippingCost() {
        if (weight <= 5)
            return 5.0;

        return 5.0 + (weight - 5) * 1.5;
    }

    public String toString() {
        return label + " weighs " + weight + " pound(s)";
    }
}