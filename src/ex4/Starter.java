package ex4;

public class Starter {

    public static void main(String[] args) {
        Reader reader1 = new Reader("reader1");
        Book book1 = new Book("bookName1", "bookAuthor1");
        Book book2 = new Book("bookName2", "bookAuthor2");

        reader1.takeBook(2);
        reader1.returnBook(2);

        reader1.takeBook("book1", "book2");
        reader1.returnBook("book1", "book2");

        reader1.takeBook(book1, book2);
        reader1.returnBook(book1, book2);
    }
}
