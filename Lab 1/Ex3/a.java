package Ex3;

public class a {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 0; height >= i ; i++) {
            System.out.println(" ".repeat(i) + "*".repeat(height-i) + (((height-i-1) > 0) ? "*".repeat(height-i-1) : ""));
        }
    }
}
