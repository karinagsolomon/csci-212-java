public class Payroll {

    public static void printPay(Employee e) {
        System.out.println(
            "Employee version: " + e.pay()
        );
    }

    public static void printPay(Manager m) {
        System.out.println(
            "Manager version: " + m.pay()
        );
    }
}