public class PayDemo {
    public static void main(String[] args) {

        Employee[] staff = {
            new Manager("Bo", 96000, 13000),
            new HourlyEmployee("Ana", 30, 80)
        };
        
        Taxable[] payer = { // both works
        		new HourlyEmployee("Chen", 30, 75),
                new Manager("Dana", 104000, 26000)
            };

        for (Employee e : staff) {
            System.out.println(e);
        }
        
        for (Taxable p : payer) {
            System.out.println(p + " with tax: " + p.tax());
        }
    }
}