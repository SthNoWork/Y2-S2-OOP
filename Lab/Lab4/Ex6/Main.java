package Ex6;

public class Main {
    public static void main(String[] args) {
        StudentList list = new StudentList();

        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("Diana");
        list.display();

        list.remove(1);
        list.display();

        list.removeLast();
        list.display();

        list.clear();
        list.display();
    }
}
