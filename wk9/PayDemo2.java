public class PayDemo2 {
    public static void main(String[] args) {

        Employee[] staff = {
            new Employee("Ana", 52000),
            new Manager("Bo", 96000, 13000),
            new Employee("Chen", 65000),
            new Manager("Dana", 104000, 26000)
        };

        for (Employee e : staff) {
            System.out.println(e);
            Payroll.printPay(e);

            if (e instanceof Manager) {
                Manager m = (Manager) e;
                System.out.println("Bonus: " + m.getBonus());
            }
            System.out.println();
        }
    }
}