public class BookSol {
    private String title;
    private String isbn;
    private static int count = 0;

    // Each Book has its title and ISBN
    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
        count++;
    }
    
    // Return the number of Book objects we have created
    public static int getCount() {
        return count;
    }
    
    // Return the ISBN of the book
    public String getISBN() {
        return isbn;
    }
    
    // Return the title of the book
    public String getTitle() {
        return title;
    }


    // Two books are equal if their ISBNs are equal  
    // Fill in the missing parameter of equals() as well
    @Override // Use @Override when overriding a superclass method is strongly recommended
    public boolean equals(Object obj) {
        if (!(obj instanceof Book))
            return false;

        Book other = (Book) obj;
        return isbn.equals(other.isbn);
    }

    // Format: title (ISBN: ISBN)
    // Example: Java Basics (ISBN: 12345)
    @Override
    public String toString() {
        return title + " (ISBN: " + isbn + ")";
    }
}