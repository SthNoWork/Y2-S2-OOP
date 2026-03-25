package Ex8;

class Product {
    int id;
    String name;
    double price;
    int stock;
    Category category;

    void display() {
        System.out.println(name + " | $" + price + " | " + category.name);
    }
}
