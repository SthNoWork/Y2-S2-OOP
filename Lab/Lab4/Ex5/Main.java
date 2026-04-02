package Ex5;

import java.util.Scanner;

public class Main {
    private static MusicStore store;
    private static Scanner scanner;

    public static void main(String[] args) {
        store = new MusicStore();
        scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getIntInput("Choose an option: ");

            switch (choice) {
                case 1:
                    viewMusicStore();
                    break;
                case 2:
                    addSong();
                    break;
                case 3:
                    createAlbum();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using Music Store!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n====== Menu ======");
        System.out.println("1. View a music store");
        System.out.println("2. Add a song");
        System.out.println("3. Create an album");
        System.out.println("4. Quit");
    }

    private static void viewMusicStore() {
        System.out.println();
        store.displayStore();
    }

    private static void addSong() {
        System.out.println("\n===== Add a new song ====");
        
        if (store.getAlbums().isEmpty()) {
            System.out.println("No albums available. Please create an album first.");
            return;
        }

        System.out.println("Select following album:");
        for (int i = 0; i < store.getAlbums().size(); i++) {
            System.out.println((i + 1) + ". " + store.getAlbums().get(i).getTitle());
        }

        int albumChoice = getIntInput("Choose an opt: ");
        if (albumChoice < 1 || albumChoice > store.getAlbums().size()) {
            System.out.println("Invalid album selection.");
            return;
        }

        scanner.nextLine(); // clear buffer
        String title = getStringInput("Song title: ");
        String singer = getStringInput("Signer: ");
        String length = getStringInput("Length: ");
        double price = getDoubleInput("Price: ");

        Song newSong = new Song(title, singer, length, price);
        store.addSongToAlbum(albumChoice - 1, newSong);
        System.out.println("A new song added to the album");
    }

    private static void createAlbum() {
        System.out.println("\n===== Create new album ====");
        scanner.nextLine(); // clear buffer
        String title = getStringInput("Album title: ");
        String genre = getStringInput("Genre: ");

        Album newAlbum = new Album(title, genre);
        store.addAlbum(newAlbum);
        System.out.println("New album created successfully!");
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        int input = scanner.nextInt();
        return input;
    }

    private static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        double input = scanner.nextDouble();
        return input;
    }
}

