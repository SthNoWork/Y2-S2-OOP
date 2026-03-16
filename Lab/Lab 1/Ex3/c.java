package Ex3;

public class c {
    public static void main(String[] args) {
        int height = 5;
        int width = 5;
        for (int i = 1; height >= i; i++) {
            for (int j = 0; width > j; j++) {
                System.out.print(i + j);
            }
            System.out.println();
        }
    }
}
