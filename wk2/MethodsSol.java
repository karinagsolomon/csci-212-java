
public class MethodsSol {
    public static void main(String args[]) {
    	int x = 5, y = 8;
        double a = 2.5, b = 4.0;

        System.out.println(add(x, y));              // prints 13
        System.out.println(average(a, b));          // prints 3.25

        if (isLarger(y, x))                        
            System.out.println("Yes");
        
        double result = calculate(x, average(a, b)); 

        f(average(a, b), calculate(x, f(20, a - b)));   
    }
    
    // Write the best title line for each method.
    // The method bodies is not needed.
    
    public static int add(int x, int y)
    
    public static double average(double a, double b)
    
    public static boolean isLarger(int x, int y)
    
    public static double calculate(int a, double b)
    
    public static double f(double a, double b)
    
} 