import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int publishingYear;

    public Book(String nameBook, Author author, int publishingYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear <= 0) {
            System.out.println("Данное число не допустимо.");
        } else {
            this.publishingYear = publishingYear;
        }
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author=" + author +
                ", publishingYear=" + publishingYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, publishingYear);
    }
}
