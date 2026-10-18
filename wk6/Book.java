public class Book {
    private String title;
    private String isbn;
    private static int count = 0;

    // Each Book has its title and ISBN
    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }
    
    // Return the number of Book objects we have created
    public static int getCount() {
        count++;
        return count;
    }
    
    // Return the ISBN of the book
    public String getISBN() {
        return this.isbn;
    }
    
    // Return the title of the book
    public String getTitle() {
        return this.title;
    }


    // Two books are equal if their ISBNs are equal
    // Fill in the missing parameter of equals() as well
    @Override // Use @Override when overriding a superclass method is strongly recommended
    public boolean equals(String this.isbn){
        if(this.isbn.equals(isbn)) {
            return true;
        } else {
            return false;
        }
    }

    // Format: title (ISBN: ISBN)
    // Example: Java Basics (ISBN: 12345)
    @Override
    public String toString() {
        System.out.println(this.title + " (ISBN: " + this.isbn + ")");
    }
}