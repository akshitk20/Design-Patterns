package casestudy.libmanagement;

public class BookFactory {

    public Book getBook(String genre, String title, String authorName, String isbn) {
        if (genre.equals("Thriller")) {
            return new ThrillerBook(title, authorName, isbn);
        } else if (genre.equals("Biography")) {
            return new BiographyBook(title, authorName, isbn);
        }
        return null;
    }
}
