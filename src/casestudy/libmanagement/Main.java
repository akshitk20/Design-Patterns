package casestudy.libmanagement;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Relentless","Tim Grover","123");
        Book book1 = new Book("Atomic Habits", "BOB", "1234");
        library.addBook(book);
        library.addBook(book1);

        Patron patron = new Patron(1, "BOB");
        Checkout checkout = new Checkout(5);
        checkout.checkout(book, patron);
        checkout.checkout(book1, patron);
        checkout.returnBook(book, patron);
    }
}
