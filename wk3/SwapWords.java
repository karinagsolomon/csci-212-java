import java.util.Scanner;
/*
Write a complete Java program named SwapWords.java.
The program should ask the user to enter a line containing several words. For each
word, create a new word in which the first and last characters are exchanged.
● A word with only one character should remain unchanged.
● Print all of the modified words in the same order as the original input.
● You may assume that words are separated by a single space.
For example:
Enter some words: Java is very easy
aavJ si yerv yase
Another example:
Enter some words: I like CSCI212
I eikl 2SCI21C
*/
public class SwapWords {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some words: ");
        String line = input.nextLine();
        String[] words = line.split(" ");

         // Write your code here.
        String[] newWord = new String[];
        for (words : word) {
            char a[] = word[i];
        }
        System.out.println(newWord);
        input.close();
    }
}
