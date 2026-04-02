package Ex7;

class ITStudent {
    String studentID;
    String name;
}

class ProgrammingStudent extends ITStudent {
    void study() {
        System.out.println("Coding in Java...");
    }
}

class TelecomStudent extends ITStudent {
    void study() {
        System.out.println("Turing it off and on...");
    }
}
