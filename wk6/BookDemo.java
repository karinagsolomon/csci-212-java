public class BookDemo {
    public static void main(String args[]) {
        Book a = new Book("Java Basics", "12345");
        Book b = new Book("Python Basics", "12345");
        Book c = new Book("Java Basics", "67890");

        Object x = b;

        System.out.println(a); // Java Basics (ISBN: 12345)
        System.out.println(b); // Python Basics (ISBN: 12345)

        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // false

        System.out.println(x.equals(a)); // true

        System.out.println(a.getTitle()); // Java Basics
        System.out.println(c.getISBN()); // 67890

        System.out.println(Book.getCount()); // 3
    }
}