import java.util.Scanner;

public class Ratings {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // Create an integer array that can store the number of times each rating from 1 through 5 is entered.
        int[] counts = new int[6];
        int total = 0;
        int sum = 0;
        // Repeatedly ask the user to enter a rating.
        for(int i=0; i<counts.length; i++){
            System.out.println("Enter ratings (1-5, 0 to stop):");
        }
        // If the user enters a number from 1 through 5, record the rating.
        int rating = 0;
        if (int rating)
        // Write your code here.

        /*
        1. Create an integer array that can store the number of times each rating from
            1 through 5 is entered.
        2. Repeatedly ask the user to enter a rating.
        3. If the user enters a number from 1 through 5, record the rating.
        4. If the user enters 0, stop reading input.
        5. If the user enters any other number, ignore it and continue asking for
        ratings.
        6. After input is complete, print:
        ○ The number of times each rating was entered;
        ○ The percentage of all valid ratings represented by that rating;
        ○ The average rating.
        7. Do not print ratings that were never entered.
        */

        input.close();
    }
}

