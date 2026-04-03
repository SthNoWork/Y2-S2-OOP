package ex6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class auth {
    private static final String USER_FILE = "ex6/user.txt";

    static void register(Scanner input) {
        System.out.println("==== Register a new user ====");
        System.out.print("First Name: ");
        String firstName = input.nextLine();
        System.out.print("Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        if (duplicateEmail(email)) {
            System.out.println("Email already exists.");
            return;
        }

        new File("ex6").mkdirs();
        User user = new User(firstName, lastName, username, email, password);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE, true))) {
            writer.write(user.toRecord());
            writer.newLine();
            System.out.println("You are successfully registered~");
        } catch (IOException e) {
        }
    }

    static void login(Scanner input) {
        System.out.println("==== Login ====");

        while (true) {
            System.out.print("Email or Username: ");
            String identity = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();

            User user = findUser(identity, password);
            if (user == null) {
                System.out.println("User not found. Please try again");
                continue;
            }

            System.out.println("=========== User Info ===========");
            System.out.println("Hi " + user.getFirstName() + " " + user.getLastName() + ",");
            System.out.println("Your username is: " + user.getUsername());
            System.out.println("Your email is: " + user.getEmail());
            break;
        }
    }

    private static User findUser(String identity, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                User user = User.fromRecord(line);
                if ((user.getEmail().equals(identity) || user.getUsername().equals(identity)) && user.getPassword().equals(password)) {
                    return user;
                }
            }
        } catch (IOException e) {
        }
        return null;
    }

    private static boolean duplicateEmail(String targetEmail) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                User user = User.fromRecord(line);
                if (user.getEmail().equals(targetEmail)) {
                    return true;
                }
            }
        } catch (IOException e) {
        }
        return false;
    }
}
