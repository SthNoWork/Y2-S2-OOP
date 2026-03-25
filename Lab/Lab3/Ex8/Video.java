package Ex8;

class Video {
    int id;
    String title;
    int views;
    int likes;
    User user;

    void display() {
        System.out.println(title + " | " + user.name);
    }
}