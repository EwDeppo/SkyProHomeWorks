public class Book {
    String nameBook;
    Author author;
    int publishingYear;
    public Book(String nameBook, Author author, int publishingYear) {
        this.nameBook = nameBook;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getNameBook(){return this.nameBook;}
    public Author getAuthor(){return this.author;}
    public void setPublishingYear(int publishingYear) {
        if (publishingYear <= 0) {
            System.out.println("Данное число не допустимо");
        } else { this.publishingYear = publishingYear;}
    }
    public int getPublishingYear(){return this.publishingYear;}
}
