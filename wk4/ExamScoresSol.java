
import java.util.ArrayList;
import java.util.Scanner;

public class ExamScoresSol {
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
    	for (int i = scores.size() - 1; i >= 0; i--) {  // From end to beginning
            if (scores.get(i) < 10)
                scores.remove(i);
        }
    }
}