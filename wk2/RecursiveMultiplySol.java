public class RecursiveMultiplySol {
    public static int multiply(int a, int b) {
        // Write your recursive method here
        if (b == 0)
            return 0; // base case
        return a + multiply(a, b - 1); // add one time, the remaining time (b) -1
    }

    public static void main(String args[]) {
        System.out.println(multiply(7, 4));  // prints 28
        System.out.println(multiply(5, 3));  // prints 15
        System.out.println(multiply(8, 0));  // prints 0
    }
}
