
public class Counter {
	public static void main(String args[]) {
	    for (int n = 5; n > 0; n--) {
	    	System.out.print(n + "... ");
        }
        System.out.println("Go!");

	    int count = 0;
	    for (int i = 0; i <= 20; i++) {
	        if (i != 0) // can not use if(i)
	            count++;
	    }

	    System.out.println("Number of not zero numbers from 0 to 20: " + count);
	    System.out.println("Count plus 2: " + (count + 2)); // need parentheses here to make the count add instead of concat
	}

}
