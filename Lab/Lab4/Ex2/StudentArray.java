package Ex2;

import utils.InputUtils;

class StudentArray {
    private Student[] students;
    private int count;

    public StudentArray(int capacity) {
        this.students = new Student[capacity];
        this.count = 0;
    }

    public void viewAllStudents() {
        if (count == 0) {
            System.out.println("No students found.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("| " + (i + 1) + " | " + students[i].id + " | " + students[i].name + " | " + students[i].age + " |");
            }
        }
    }

    public void addNewStudent() {
        String id = InputUtils.getString("Input student ID: ");
        String name = InputUtils.getString("Input student Name: ");
        int age = InputUtils.getInteger("Input student Age: ");
        students[count++] = new Student(id, name, age);
    }

    public void deleteStudent() {
        System.out.println("\n==== Delete a student ====");
        String id = InputUtils.getString("Input student ID: ");
        int index = -1;

        for (int i = 0; i < count; i++) {
            if (students[i].id.equals(id)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The following student has been deleted.");
            System.out.println("| " + (index + 1) + " | " + students[index].id + " | " + students[index].name + " | " + students[index].age + " |");

            for (int i = index; i < count - 1; i++) {
                students[i] = students[i + 1];
            }
            students[--count] = null;
        } else {
            System.out.println("Student is not found. Try again");
        }
    }
}