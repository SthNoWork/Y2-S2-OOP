package Ex1;

import java.util.ArrayList;
import utils.InputUtils;

public class Main {

    static class Student {
        int id;
        String name;
        int age;

        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();
        int count = 1;

        while (true) {
            System.out.println();
            System.out.println("Student #" + count + ":");
            int id = InputUtils.getInteger("Id: ");
            String name = InputUtils.getString("Name: ");
            int age = InputUtils.getInteger("Age: ");

            stu.add(new Student(id, name, age));

            if (!InputUtils.getYesOrNo("Do you want to add more? (Y/N): ")) {
                break;
            }
            count++;
        }

        String line = "===========================================";
        System.out.println("\n" + line);

        System.out.printf("| %-3s | %-8s | %-15s | %-4s |%n", "No", "ID", "Name", "Age");
        System.out.println(line);

        for (int i = 0; i < stu.size(); i++) {
            Student s = stu.get(i);
            System.out.printf("| %-3d | %-8d | %-15s | %-4d |%n",
                    (i + 1), s.id, s.name, s.age);
        }
        System.out.println(line);
    }
}