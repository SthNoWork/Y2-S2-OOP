package Ex2;

import utils.InputUtils;

public class Main {
    public static void main(String[] args) {
        StudentArray studentArray = new StudentArray(100);

        while (true) {
            System.out.println("\n==== Menu ====");
            System.out.println("1. View all students");
            System.out.println("2. Add a new student");
            System.out.println("3. Delete a student");
            System.out.println("0. Quit");

            // loops to accept only 0 to (parameter) here it's 3
            int choice = InputUtils.getOption("Choose an option: ", 3);

            if (choice == 1) {
                studentArray.viewAllStudents();
            } else if (choice == 2) {
                studentArray.addNewStudent();
            } else if (choice == 3) {
                studentArray.deleteStudent();
            } else if (choice == 0) {
                System.out.println("Exiting program...");
                break;
            }
        }
    }
}

