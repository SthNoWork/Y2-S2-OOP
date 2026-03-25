/*
❖Lab03.8.  Class diagrams to Java class
Create a model following class diagrams and objects:
▪ Phone shop:  Product and Category
▪ Youtube: User and Video
▪ Book Store: Book and Author
1. Create a class diagram to represent relationship of two classes
2. Implement each Java Class with at least 5 attributes defined
3. Create at least 1 objects of related Class
4. Create at least 3 objects with values assigned
5. Create an array and put all objects to that array
6. Create a loop to display all object in that array
*/

package Ex8;

public class Main {
    public static void main(String[] args) {

        // ===== Phone Shop =====
        Category c = new Category();
        c.id = 1;
        c.name = "Phones";
        c.description = "Smartphones";
        c.active = true;
        c.createdDate = "2026";

        Product p1 = new Product();
        p1.id = 101;
        p1.name = "iPhone";
        p1.price = 999;
        p1.stock = 10;
        p1.category = c;

        Product p2 = new Product();
        p2.id = 102;
        p2.name = "Samsung";
        p2.price = 800;
        p2.stock = 20;
        p2.category = c;

        Product[] products = { p1, p2 };

        for (Product p : products) {
            p.display();
        }

        System.out.println();

        // ===== YouTube =====
        User u = new User();
        u.id = 1;
        u.name = "Dara";
        u.email = "dara@gmail.com";
        u.subscribers = 1000;
        u.country = "Cambodia";

        Video v1 = new Video();
        v1.id = 201;
        v1.title = "Java Tutorial";
        v1.views = 5000;
        v1.likes = 300;
        v1.user = u;

        Video v2 = new Video();
        v2.id = 202;
        v2.title = "C++ Tutorial";
        v2.views = 4000;
        v2.likes = 200;
        v2.user = u;

        Video[] videos = { v1, v2 };

        for (Video v : videos) {
            v.display();
        }

        System.out.println();

        // ===== Book Store =====
        Author a = new Author();
        a.id = 1;
        a.name = "John";
        a.nationality = "USA";
        a.age = 40;
        a.email = "john@mail.com";

        Book b1 = new Book();
        b1.id = 301;
        b1.title = "Java Basics";
        b1.price = 20;
        b1.pages = 200;
        b1.author = a;

        Book b2 = new Book();
        b2.id = 302;
        b2.title = "Advanced Java";
        b2.price = 30;
        b2.pages = 350;
        b2.author = a;

        Book[] books = { b1, b2 };

        for (Book b : books) {
            b.display();
        }
    }
}