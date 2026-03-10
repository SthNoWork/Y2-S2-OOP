package Ex11;

class Book {
    int id;
    String title;
    String author;
    int year;
    double price;
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();

        b1.id = 1;
        b1.title = "Java Basics";
        b1.author = "John";
        b1.year = 2020;
        b1.price = 25.5;

        b2.id = 2;
        b2.title = "Data Structures";
        b2.author = "Alice";
        b2.year = 2021;
        b2.price = 30.0;

        b3.id = 3;
        b3.title = "Algorithms";
        b3.author = "Bob";
        b3.year = 2019;
        b3.price = 28.0;

        Book[] bookArr = new Book[3];

        bookArr[0] = b1;
        bookArr[1] = b2;
        bookArr[2] = b3;
    }
}