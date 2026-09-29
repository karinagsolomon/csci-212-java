import java.util.Scanner;

public class SwapWordsSol {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some words: ");
        String line = input.nextLine();

        String[] words = line.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() <= 1) {
                System.out.print(word + " ");
            }
            else {
                String changed =
                    word.charAt(word.length() - 1)
                    + word.substring(1, word.length() - 1)
                    + word.charAt(0);

                System.out.print(changed + " ");
            }
        }

        System.out.println();
        input.close();
    }
}
