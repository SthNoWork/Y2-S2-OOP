package ex6;

class User {
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String email;
    private final String password;

    User(String firstName, String lastName, String username, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getUsername() {
        return username;
    }

    String getEmail() {
        return email;
    }

    String getPassword() {
        return password;
    }

    String toRecord() {
        return firstName + "," + lastName + "," + username + "," + email + "," + password;
    }

    static User fromRecord(String record) {
        String[] parts = record.split(",", 5);
        return new User(parts[0], parts[1], parts[2], parts[3], parts[4]);
    }
}
