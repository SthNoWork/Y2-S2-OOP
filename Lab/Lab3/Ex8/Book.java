package Ex8;

class Book {
    int id;
    String title;
    double price;
    int pages;
    Author author;

    void display() {
        System.out.println(title + " | " + author.name);
    }
}
