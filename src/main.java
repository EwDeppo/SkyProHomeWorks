public class main {
    public static void main(String[]args) {
        Author author1 = new Author("Ivan", "Turgenev");
        Book book1 = new Book("Mu-Mu", author1, 1852);
        Author author2 = new Author("Dmitriy", "Gluhovskiy");
        Book book2 = new Book("METRO 2033", author2, 2002);
        System.out.println(book2.getPublishingYear());
        book2.setPublishingYear(202);
        System.out.println(book2.publishingYear);
    }
}
