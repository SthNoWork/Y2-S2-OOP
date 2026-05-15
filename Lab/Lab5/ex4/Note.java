package ex4;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Note {

    // ── Config ────────────────────────────────────────────────
    private static final String PATH = "ex4/data.txt";

    // ── Helpers ───────────────────────────────────────────────
    private static List<String> load() throws IOException {
        Path p = Paths.get(PATH);
        if (!Files.exists(p))
            return new ArrayList<>();
        return new ArrayList<>(Files.readAllLines(p)); // List<String> to ArrayList
    }

    private static void save(List<String> lines) throws IOException {
        Files.write(Paths.get(PATH), lines);
    }

    private static void printNote(List<String> lines) {
        System.out.println("*****************************");
        int i = 1;
        for (String line : lines)
            System.out.println(i++ + "| " + line);
        System.out.println("*****************************");
    }

    // ── Used in Main ──────────────────────────────────────────
    public static void view() throws IOException {
        System.out.println("==== View note ====");
        printNote(load());
    }

    public static void editMenu(Scanner sc) throws IOException {
        System.out.println("==== Edit following note ====");
        printNote(load());
        System.out.println("(Note: menu handling moved to Main.main())");
    }

    // ── Edit Operations ───────────────────────────────────────
    public static void append(Scanner sc) throws IOException {
        List<String> lines = load();
        int next = lines.size() + 1;
        System.out.println("Input a string for line #" + next + ":");
        lines.add(sc.nextLine());
        save(lines);
        System.out.println("Line #" + next + " is appended to the note.");
    }

    public static void update(Scanner sc) throws IOException {
        List<String> lines = load();
        System.out.print("Update line number: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Input a string for line #" + num + ":");
        lines.set(num - 1, sc.nextLine());
        save(lines);
        System.out.println("Line #" + num + " is updated.");
    }

    public static void delete(Scanner sc) throws IOException {
        List<String> lines = load();
        System.out.print("Delete line number: ");
        int num = sc.nextInt();
        sc.nextLine();
        lines.remove(num - 1);
        save(lines);
        System.out.println("Line #" + num + " is deleted.");
    }
}