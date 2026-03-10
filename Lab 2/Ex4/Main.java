package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of seconds: ");
        int totalSeconds = input.nextInt();

        int hours = (totalSeconds % 86400) / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.print("Time Corresponding to " + totalSeconds + "seconds is:: ");
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
