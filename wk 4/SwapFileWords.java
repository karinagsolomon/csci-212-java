/*
Swap Words in a File
Modify the SwapWords.java from the previous lab to SwapFileWords.java so that
it reads text from a file named words.txt instead of from the keyboard.
For each word, exchange its first and last characters.
● A word containing only one character should remain unchanged.
● Preserve the order of the words.
● Process every line in the input file.
● Write the result to a new file named swapped.txt.
● Close both the input and output files when finished.
For example, if words.txt contains:
Java is very easy
I like CSCI212
Then swapped.txt should contain:
aavJ si yerv yase
I eikl 2SCI21C
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SwapFileWords {
    public static void main(String args[]) throws FileNotFoundException {

        Scanner input = new Scanner(new File("words.txt"));
        PrintWriter output = new PrintWriter(new File("swapped.txt"));

        while (input.hasNextLine()) {
        	// same as original SwapWords from keyboard input
            String line = input.nextLine();
            String[] words = line.split(" ");

            for (int i = 0; i < words.length; i++) {
                String word = words[i];

                if (word.length() <= 1) {
                    output.print(word);
                }
                else {
                    String changed =
                        word.charAt(word.length() - 1)
                        + word.substring(1, word.length() - 1)
                        + word.charAt(0);

                    output.print(changed);
                }

                if (i < words.length - 1)
                    output.print(" "); // make the + " " in line 21 and line 29 to here, actually same
            }

            output.println();
        }

        // do not forget to close!
        input.close();
        output.close();
    }
}