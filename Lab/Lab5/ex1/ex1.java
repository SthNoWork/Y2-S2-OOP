package ex1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class ex1 {
    static final DateTimeFormatter DT_FMT = DateTimeFormatter.ofPattern("dd-M-yyyy HH:mm:ss");
    static final DateTimeFormatter D_FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void getCurrentDate() {
        System.out.println("Current datetime is: " + LocalDateTime.now().format(DT_FMT));
    }

    public static void calculateDaysBtwDates(String d1, String d2) {
        long days = ChronoUnit.DAYS.between(LocalDate.parse(d1, D_FMT), LocalDate.parse(d2, D_FMT));
        System.out.println("Difference between two dates is: " + days + " days");
    }

    public static void findDay(String d) {
        String day = LocalDate.parse(d, D_FMT).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("The day is: " + day);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("1. Current date and time");
            System.out.println("2. Calculate days btw two dates");
            System.out.println("3. Find the day of the week");
            System.out.println("4. Quit");
            System.out.print("Choose an opt: ");

            int opt = Integer.parseInt(input.nextLine());

            if (opt == 1) {
                getCurrentDate();
            } else if (opt == 2) {
                System.out.print("First date (dd/mm/yyyy): ");
                String d1 = input.nextLine();
                System.out.print("Second date (dd/mm/yyyy): ");
                String d2 = input.nextLine();
                calculateDaysBtwDates(d1, d2);
            } else if (opt == 3) {
                System.out.print("Input a date: ");
                findDay(input.nextLine());
            } else {
                break;
            }
        }
    }
}