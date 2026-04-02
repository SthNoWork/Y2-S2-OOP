package Ex6;

class StudentList {
    private Student head;

    public void add(String name) {
        Student newStudent = new Student(name);
        if (head == null) {
            head = newStudent;
        } else {
            Student temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newStudent;
        }
    }

    public void remove(int index) {
        if (head == null) {
            System.out.println("Index is out of range");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Student temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) temp = temp.next;
        if (temp == null || temp.next == null) {
            System.out.println("Index is out of range");
            return;
        }
        temp.next = temp.next.next;
    }

    public void removeLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
        } else {
            Student temp = head;
            while (temp.next.next != null) temp = temp.next;
            temp.next = null;
        }
    }

    public void clear() {
        head = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("Array is empty");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.print(temp.name + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}