package Ex7;

import java.util.ArrayList;
import utils.InputUtils;

public class Main {
    public static void main(String[] args) {
        int option, count = 1;
        ArrayList<Student> stu = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("====== Menu ======");
            System.out.println("1. Create a student");
            System.out.println("2. List students");
            System.out.println("0. Quit");
            option = InputUtils.getOption("Choose an option: ", 2);

            if (option == 0)
                break;

            if (option == 1) {
                System.out.println();
                System.out.println("Student #" + count + ":");

                Student s = new Student();
                s.setValues();
                stu.add(s);
                count++;
            }

            if (option == 2) {
                System.out.println();
                System.out.println("================================");
                System.out.println("| No | ID   | Name       | Age |");
                System.out.println("================================");

                for (int i = 0; i < stu.size(); i++) {
                    stu.get(i).display(i + 1);
                }

                System.out.println("================================");
            }
        }
    }
}

class Student {
    String id;
    String name;
    int age;

    void setValues() {
        this.id = InputUtils.getString("Id: ");
        this.name = InputUtils.getString("Name: ");
        this.age = InputUtils.getOption("Age: ", 120);
        System.out.println("A student is added to the list");
        System.out.println();
    }

    void display(int index) {
        System.out.printf("| %-2d | %-4s | %-10s | %-3d |\n", index, id, name, age);
    }
}