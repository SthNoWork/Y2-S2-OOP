package Ex6;

class Employee {
    int employeeID;
    String name;
    char gender;
    int age;
    double salary;
    String department;

    Employee(int employeeID, String name, char gender, int age, double salary, String department) {
        this.employeeID = employeeID;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
}

class Car {
    String brand;
    String model;
    int year;
    String color;
    double price;
    int mileage;

    Car(String brand, String model, int year, String color, double price, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
    }
}

class BankAccount {
    int accountID;
    String ownerName;
    char accountType;
    double balance;
    int pin;
    String currency;

    BankAccount(int accountID, String ownerName, char accountType, double balance, int pin, String currency) {
        this.accountID = accountID;
        this.ownerName = ownerName;
        this.accountType = accountType;
        this.balance = balance;
        this.pin = pin;
        this.currency = currency;
    }
}

class Video {
    int videoID;
    String title;
    String genre;
    double duration;
    int releaseYear;
    char rating;

    Video(int videoID, String title, String genre, double duration, int releaseYear, char rating) {
        this.videoID = videoID;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1001, "Alice", 'F', 30, 3500.50, "Engineering");
        Employee emp2 = new Employee(1002, "Bob",   'M', 45, 5200.00, "Management");

        Car car1 = new Car("Toyota", "Corolla", 2020, "White", 20000.00, 15000);
        Car car2 = new Car("Honda",  "Civic",   2022, "Black", 23000.00, 5000);

        BankAccount acc1 = new BankAccount(3001, "Charlie", 'S', 15000.75, 1234, "USD");
        BankAccount acc2 = new BankAccount(3002, "Diana",   'C', 52000.00, 5678, "EUR");

        Video vid1 = new Video(5001, "Inception",       "Sci-Fi", 148.0, 2010, 'A');
        Video vid2 = new Video(5002, "The Dark Knight", "Action", 152.5, 2008, 'A');
    }
}
