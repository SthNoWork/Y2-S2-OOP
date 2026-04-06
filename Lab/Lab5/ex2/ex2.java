package ex2;

import java.util.*;
import java.util.stream.IntStream;

class Student {
    String id, name, age;

    Student(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("==== Menu ===");
            System.out.println("1. Add new students");
            System.out.println("2. Delete multiple students");
            System.out.println("3. Quit");
            System.out.print("Choose an opt: ");

            int opt = Integer.parseInt(input.nextLine());

            if (opt == 1) {
                int count = 1;
                while (true) {
                    System.out.println();
                    System.out.println("Student #" + count++ + ":");
                    System.out.print("Id: ");
                    String id = input.nextLine();
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    System.out.print("Age: ");
                    String age = input.nextLine();

                    students.add(new Student(id, name, age));

                    System.out.print("Do you want to add more (y/n)?: ");
                    if (input.nextLine().equalsIgnoreCase("n"))
                        break;
                }
            } else if (opt == 2) {
                System.out.println();
                System.out.println("The following table:");
                System.out.println("========================================");
                System.out.println(" |No  | ID     | Name            | Age |");
                System.out.println("========================================");

                IntStream.range(0, students.size()).forEach(i -> {
                    System.out.printf(" |%-3d | %-6s | %-15s | %-4s| \n",
                            (i + 1),
                            students.get(i).id,
                            students.get(i).name,
                            students.get(i).age);
                });
                System.out.println("========================================");

                System.out.println();
                System.out.println("== DELETION =====");
                int count = 1;
                while (true) {
                    System.out.print("Input student #" + count++ + " ID: ");
                    String delId = input.nextLine();
                    boolean removed = students.removeIf(s -> s.id.equals(delId));

                    if (removed) {
                        System.out.println("Student with ID " + delId + " deleted");
                    } else {
                        System.out.println("Student with ID " + delId + " not found!");
                    }

                    System.out.print("Do you want to delete more (y/n)?: ");
                    if (input.nextLine().equalsIgnoreCase("n"))
                        break;
                }
            } else {
                break;
            }
        }
    }
}