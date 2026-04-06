package ex5;

import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ex5 {
    private static final String BASE_DIR = "ex5";

    static void appendToFile(String file, String data) throws IOException {
        Files.write(Path.of(BASE_DIR, file), (data + "\n").getBytes(), StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }

    static void printCategory(String title, String file) throws IOException {
        System.out.println("==== " + title + " ====");
        Path filePath = Path.of(BASE_DIR, file);
        if (Files.exists(filePath)) {
            var lines = Files.readAllLines(filePath);
            IntStream.range(0, lines.size()).forEach(i -> {
                System.out.println((i + 1) + ". " + lines.get(i));
            });
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("==== Menu ===");
            System.out.println("1. View all");
            System.out.println("2. Add new");
            System.out.println("3. Quit");
            System.out.print("Choose an option: ");

            int opt = Integer.parseInt(input.nextLine());

            if (opt == 1) {
                printCategory("Teacher", "teacher.txt");
                System.out.println("=========== Student ===========");
                printCategory("Student", "student.txt");
                System.out.println("=========== Security guard ===========");
                printCategory("Security guard", "securityguard.txt");
            } else if (opt == 2) {
                System.out.println("==== Add new resource ====");
                System.out.println("1. Teacher");
                System.out.println("2. Student");
                System.out.println("3. Security guard");
                System.out.print("Choose an opt: ");

                int resOpt = Integer.parseInt(input.nextLine());

                System.out.print("First Name: ");
                String fn = input.nextLine();
                System.out.print("Last Name: ");
                String ln = input.nextLine();
                System.out.print("Sex: ");
                String sex = input.nextLine();
                System.out.print("Email: ");
                String email = input.nextLine();

                if (resOpt == 1) {
                    System.out.print("Subject: ");
                    String sub = input.nextLine();
                    System.out.print("Salary: ");
                    String sal = input.nextLine();
                    appendToFile("teacher.txt",
                            String.format("[%s %s][%s][%s][%s][%s$]", fn, ln, sex, email, sub, sal));
                } else if (resOpt == 2) {
                    System.out.print("Year: ");
                    String yr = input.nextLine();
                    System.out.print("Major: ");
                    String maj = input.nextLine();
                    appendToFile("student.txt", String.format("[%s %s][%s][%s][%s][%s]", ln, fn, sex, email, yr, maj));
                } else if (resOpt == 3) {
                    System.out.print("Role: ");
                    String role = input.nextLine();
                    appendToFile("securityguard.txt", String.format("[%s %s][%s][%s][%s]", fn, ln, sex, email, role));
                }
            } else {
                break;
            }
        }
    }
}