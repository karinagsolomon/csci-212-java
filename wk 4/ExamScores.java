/*
Filtered Exam Score Average
The program named ExamScores.java reads an unknown number of test scores from
the user. Input ends when the user enters a negative number. In this exercise, a score
below 10 represents a student who was absent or whose exam score should not be
included in the class average.
Complete the method:
public static void removeInvalidScores(ArrayList<Integer>
scores)
so that it removes every score less than 10 from the original ArrayList.
After removing the invalid scores, the program should calculate and print the average of
the remaining scores.
For example, if the user enters:
85 0 3 72 6 91 88 0 79 -1
The output should be:
Original scores: [85, 0, 3, 72, 6, 91, 88, 0, 79]
Valid scores: [85, 72, 91, 88, 79]
Average: 83.0
*/
import java.util.ArrayList;
import java.util.Scanner;

public class ExamScores {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();

        System.out.println("Enter scores, terminated by a negative number:");

        while (true) {
            int score = input.nextInt();

            if (score < 0)
                break;

            scores.add(score);
        }

        System.out.println("Original scores: " + scores); 
        
        removeInvalidScores(scores); 
        
        System.out.println("Valid scores: " + scores); 
        
        int total = 0; 
        for (int score : scores) 
        	total += score; 
        
        double average = (double) total / scores.size();
        
        System.out.println("Average: " + average);

        input.close();
    }

    public static void removeInvalidScores(ArrayList<Integer> scores) { 
    	// Write this method. 
    }
}