public class PayDemo {
    public static void main(String args[]) {
        Employee e = new Employee("Ana", 52000);
        Employee m = new Manager("Bo", 96000, 13000);

        System.out.println(e);
        System.out.println(m);
    }
}