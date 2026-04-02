package Ex3;

import utils.InputUtils;

public class Main {
    private static final int MAX_BOOKS = 100;

    public static void main(String[] args) {
        Book[] books = new Book[MAX_BOOKS];
        int size = 0;

        while (true) {
            printMenu();
            int option = InputUtils.getOption("Choose an option: ", 4);

            switch (option) {
                case 1:
                    viewAllBooks(books, size);
                    break;
                case 2:
                    size = addNewBook(books, size);
                    break;
                case 3:
                    updateBook(books, size);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("==== Menu ===");
        System.out.println("1. View all books");
        System.out.println("2. Add a new book");
        System.out.println("3. Update a book");
        System.out.println("4. Quit");
    }

    private static void viewAllBooks(Book[] books, int size) {
        System.out.println("==== View all books ====");

        if (size == 0) {
            System.out.println("No books found.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Book #" + (i + 1));
            System.out.println("ISBN: " + books[i].isbn);
            System.out.println("Title: " + books[i].title);
            System.out.println("Price: " + books[i].price);
            System.out.println("Author: " + books[i].author);
            System.out.println();
        }
    }

    private static int addNewBook(Book[] books, int size) {
        System.out.println("==== Add a new book ====");

        if (size >= books.length) {
            System.out.println("Book list is full. Cannot add more books.");
            return size;
        }

        String isbn;
        while (true) {
            isbn = InputUtils.getString("ISBN: ");
            if (findBookIndexByIsbn(books, size, isbn) == -1) {
                break;
            }
            System.out.println("ISBN already exists. Please input another ISBN.");
        }

        String title = InputUtils.getString("Title: ");
        double price = InputUtils.getDouble("Price: ");
        String author = InputUtils.getString("Author: ");

        books[size] = new Book(isbn, title, price, author);
        System.out.println("Added new book successfully.");
        return size + 1;
    }

    private static void updateBook(Book[] books, int size) {
        System.out.println("==== Update a book ====");

        if (size == 0) {
            System.out.println("No books to update.");
            return;
        }

        int index;
        while (true) {
            String isbn = InputUtils.getString("Input ISBN: ");
            index = findBookIndexByIsbn(books, size, isbn);

            if (index != -1) {
                break;
            }

            System.out.println("Book is not found. Try again");
        }

        System.out.println("Please update the following:");
        books[index].isbn = InputUtils.getString("ISBN: ");
        books[index].title = InputUtils.getString("Title: ");
        books[index].price = InputUtils.getDouble("Price: ");
        books[index].author = InputUtils.getString("Author: ");
        System.out.println("Book updated successfully.");
    }

    private static int findBookIndexByIsbn(Book[] books, int size, String isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].isbn.equals(isbn)) {
                return i;
            }
        }
        return -1;
    }
}
