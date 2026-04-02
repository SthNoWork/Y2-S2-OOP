package Ex6;

class Student {
    String id, name, gender, major, email;
    Student next;

    public Student(String name) {
        this.name = name;
        this.next = null;
    }
}
