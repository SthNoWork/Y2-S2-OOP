package Ex3;

public class b {
    public static void main(String[] args) {
        int height = 3;
        int width = 3;

        for (int i = 0; height > i ; i++) {
            if (i == 0 || i == height-1) {
                System.out.println("*".repeat(width));
            } else {
                System.out.println("*" + " ".repeat(width-2) + "*");
            }
        }
    }
}
