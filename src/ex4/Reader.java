package ex4;

import java.util.Date;

public class Reader {

    private String name;
    private String faculty;
    private String phoneNumber;
    private int ticketNumber;
    private Date dob;

    public Reader(String name) {
        this.name = name;
    }

    public Reader(String name, String faculty, String phoneNumber, int ticketNumber, Date dob) {
        this.name = name;
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
        this.ticketNumber = ticketNumber;
        this.dob = dob;
    }

    public void takeBook() {
    }

    public void returnBook() {
    }

    public void readerDB(Reader... readers) {
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(name + " взял " + numberOfBooks + " книг.");
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(name + " вернул " + numberOfBooks + " книг.");
    }

    public void takeBook(String... bookName) {
        if (bookName.length != 0) {
            System.out.print(name + " взял книги:");
            for (int i = 0; i < bookName.length; i++) {
                if (i != bookName.length - 1) {
                    System.out.print(" " + bookName[i] + ",");
                } else {
                    System.out.println(" " + bookName[i] + ".");
                }
            }
        }
    }

    public void returnBook(String... bookName) {
        if (bookName.length != 0) {
            System.out.print(name + " вернул книги:");
            for (int i = 0; i < bookName.length; i++) {
                if (i != bookName.length - 1) {
                    System.out.print(" " + bookName[i] + ",");
                } else {
                    System.out.println(" " + bookName[i] + ".");
                }
            }
        }
    }

    public void takeBook(Book... books) {
        System.out.print(name + " взял книги:");
        for (Book b : books) {
            System.out.print(" " + b.getNameOfBook());
        }
        System.out.println(".");
    }

    public void returnBook(Book... books) {
        System.out.print(name + " вернул книги:");
        for (Book b : books) {
            System.out.print(" " + b.getNameOfBook());
        }
        System.out.println(".");
    }
}
