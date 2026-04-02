package Ex4;

import utils.InputUtils;

public class Main {
    private static final int MAX_VIDEOS = 100;

    public static void main(String[] args) {
        Video[] videos = new Video[MAX_VIDEOS];
        int size = 0;

        while (true) {
            printMenu();
            int option = InputUtils.getOption("Choose an option: ", 4);

            switch (option) {
                case 1:
                    searchVideos(videos, size);
                    break;
                case 2:
                    viewAllVideos(videos, size);
                    break;
                case 3:
                    size = addNewVideo(videos, size);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("==== Menu ===");
        System.out.println("1. Search ");
        System.out.println("2. View all videos");
        System.out.println("3. Add a new video");
        System.out.println("4. Quit");
    }

    private static void searchVideos(Video[] videos, int size) {
        System.out.println("==== Video Search ====");

        if (size == 0) {
            System.out.println("No videos available.");
            return;
        }

        while (true) {
            String query = InputUtils.getString("Input title: ").toLowerCase();
            int found = 0;

            for (int i = 0; i < size; i++) {
                if (videos[i].title.toLowerCase().contains(query)) {
                    found++;
                }
            }

            if (found == 0) {
                System.out.println("0 video found. Try again");
                continue;
            }

            System.out.println(found + " videos found:");
            int index = 1;
            for (int i = 0; i < size; i++) {
                if (videos[i].title.toLowerCase().contains(query)) {
                    System.out.println(index + ". " + videos[i].title + " - " + videos[i].uploader);
                    index++;
                }
            }
            System.out.println();
            return;
        }
    }

    private static void viewAllVideos(Video[] videos, int size) {
        System.out.println("==== View all videos ====");

        if (size == 0) {
            System.out.println("No videos available.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Video #" + (i + 1));
            System.out.println("Title: " + videos[i].title);
            System.out.println("Uploader: " + videos[i].uploader);
            System.out.println("Length (minutes): " + videos[i].lengthMinutes);
            System.out.println("Type: " + videos[i].type);
            System.out.println();
        }
    }

    private static int addNewVideo(Video[] videos, int size) {
        System.out.println("==== Add a new video ====");

        if (size >= videos.length) {
            System.out.println("Video list is full. Cannot add more videos.");
            return size;
        }

        String title = InputUtils.getString("Title: ");
        String uploader = InputUtils.getString("Uploader: ");
        double lengthMinutes = InputUtils.getDouble("Length (minutes): ");
        String type = InputUtils.getString("Type: ");

        videos[size] = new Video(title, uploader, lengthMinutes, type);
        System.out.println("Added new video successfully.");
        return size + 1;
    }
}

