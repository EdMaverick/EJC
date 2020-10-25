package ex4;

public class Book {

    private String nameOfBook;
    private String nameOfAuthor;

    public Book(String nameOfBook, String nameOfAuthor) {
        this.nameOfBook = nameOfBook;
        this.nameOfAuthor = nameOfAuthor;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }
}
