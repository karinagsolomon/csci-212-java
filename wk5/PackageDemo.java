/*
Write the Class Package
Write complete Java code for a class called Package.
The class should have exactly two private instance variables:
String label
double weight
The class should have these methods:
1. Constructors with two parameters, label and weight. It should also be
possible to create a Package by providing only the label; in that case, weight
should default to 0.0.
2. getLabel() — returns the package label.
3. getWeight() — returns the package weight.
4. setWeight(double weight) — changes the weight only if the new weight is
greater than or equal to 0.
5. shippingCost() — returns the shipping cost as a double.
○ If the weight is less than or equal to 5, the cost is $5.00.
○ Otherwise, the cost is $5.00 + $1.50 for each pound above 5.
6. toString() — returns a String in the form mentioned in the output example
PackageDemo class is given and should not be modified, which output should be:
Books
8.0
9.5
Books weighs 4.0 pound(s)
5.0
Letter weighs 0.0 pound(s)
*/

public class PackageDemo {
    public static void main(String args[]) {
        Package p = new Package("Books", 8.0);
        Package q = new Package("Letter");

        System.out.println(p.getLabel());
        System.out.println(p.getWeight());
        System.out.println(p.shippingCost());

        p.setWeight(4.0);

        System.out.println(p);
        System.out.println(p.shippingCost());
        
        System.out.println(q);
    }
}