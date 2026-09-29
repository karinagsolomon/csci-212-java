import java.util.Scanner;

public class RatingsSol {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int[] counts = new int[6];
        int total = 0;
        int sum = 0;

        System.out.println("Enter ratings (1-5, 0 to stop):");

        int rating = input.nextInt();

        while (rating != 0) {
            if (rating >= 1 && rating <= 5) {
                counts[rating]++;
                total++;
            }

            rating = input.nextInt();
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            if (counts[i] > 0) {
            	sum = sum + counts[i]*i;
                double percentage = counts[i] * 100.0 / total;

                System.out.println(
                    "Rating " + i + ": "
                    + counts[i] + " time(s), "
                    + percentage + "%"
                );
            }
        }
        System.out.println("Average Rating: " + (double)sum/total);

        input.close();
    }
}

