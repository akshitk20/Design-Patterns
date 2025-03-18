package casestudy.libmanagement;

public class BiographyBook extends Book {
    public BiographyBook(String title, String authorName, String isbn) {
        super(title, authorName, isbn);
    }

    public static class BookBuilder {
        private String title;
        private String authorName;
        private String isbn;
        private boolean isAvailable;

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public BookBuilder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder setAvailable(boolean available) {
            isAvailable = available;
            return this;
        }

        public Book build() {
            return new BiographyBook(title, authorName,isbn);
        }
    }
}
