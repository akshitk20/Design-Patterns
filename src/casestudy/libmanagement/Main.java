package casestudy.libmanagement;

public class Main {
    public static void main(String[] args) {
        Library library = Library.getLibrary();
        BookFactory bookFactory = new BookFactory();
        Book book = bookFactory.getBook("Biography","Relentless","Tim Grover","123");
        Book book1 = bookFactory.getBook("Biography","Atomic Habits","BOB","1234");

        library.addBook(book);
        library.addBook(book1);

        Patron patron = new Patron(1, "BOB");
        Checkout checkout = new Checkout(5, new LateFineCalculationStrategy(5));
        checkout.checkout(book, patron);
        checkout.checkout(book1, patron);
        checkout.returnBook(book, patron);
    }
}
