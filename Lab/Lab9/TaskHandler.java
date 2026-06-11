import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskHandler {
    private List<Task> taskList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int nextNo = 1;

    public TaskHandler() {
        taskList.add(new ConcreteTask(nextNo++, "Format hard disk", 1000));
        taskList.add(new ConcreteTask(nextNo++, "Download video", 6000));
        taskList.add(new ConcreteTask(nextNo++, "Develop an app", 8000));
    }

    private void displayTasks() {
        System.out.println("::: Task Handler :::");
        System.out.println("===============================================");
        System.out.printf("| %-3s| %-22s| %-15s|%n", "No", "Name", "Duration");
        System.out.println("===============================================");
        for (Task t : taskList) {
            System.out.println(t);
        }
        System.out.println("===============================================");
    }

    private void displayMenu() {
        System.out.println("1. Add new task");
        System.out.println("2. Delete a task");
        System.out.println("3. Proceed tasks");
        System.out.print("Choose an opt: ");
    }

    private void addTask() {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter duration (mills): ");
        int duration = Integer.parseInt(scanner.nextLine().trim());
        taskList.add(new ConcreteTask(nextNo++, name, duration));
        System.out.println("Task added successfully.");
    }

    private void deleteTask() {
        System.out.print("Enter task No to delete: ");
        int no = Integer.parseInt(scanner.nextLine().trim());
        boolean removed = taskList.removeIf(t -> t.getNo() == no);
        if (removed) {
            System.out.println("Task No." + no + " deleted.");
        } else {
            System.out.println("Task not found.");
        }
    }

    private void proceedTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }

        List<Task> selected = new ArrayList<>();
        System.out.println("Select tasks to perform parallel process:");

        while (true) {
            System.out.print("Input task No: ");
            int no = Integer.parseInt(scanner.nextLine().trim());

            Task found = null;
            for (Task t : taskList) {
                if (t.getNo() == no) {
                    found = t;
                    break;
                }
            }

            if (found != null) {
                selected.add(found);
            } else {
                System.out.println("Task No." + no + " not found, skipping.");
            }

            System.out.print("Do you want to add more task (y/n)?: ");
            String more = scanner.nextLine().trim();
            if (!more.equalsIgnoreCase("y"))
                break;
        }

        if (selected.isEmpty()) {
            System.out.println("No valid tasks selected.");
            return;
        }

        List<Thread> threads = new ArrayList<>();
        for (Task t : selected) {
            Thread thread = new Thread(new TaskThread(t));
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("All selected tasks completed.");
    }

    public void run() {
        while (true) {
            displayTasks();
            displayMenu();

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    addTask();
                    break;
                case "2":
                    deleteTask();
                    break;
                case "3":
                    proceedTasks();
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new TaskHandler().run();
    }
}
