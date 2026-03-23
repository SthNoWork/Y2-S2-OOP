package Ex3;

import utils.InputUtils;

public class Main {
    public static void main(String[] args) {
        int option;
        while (true) {
            option = console();
            switch (option) {
                case 0:
                    System.out.println("Goodbye!");
                    return;
                case 1:
                    generalMenu();
                    break;
                case 2:
                    wifiMenu();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    notAvailable();
                    break;
            }
        }
    }

    static int console() {
        System.out.println();
        System.out.println("Phone Settings:");
        System.out.printf("%-20s %1s %n", "1. General", ">");
        System.out.printf("%-20s %1s %n", "2. WiFi", ">");
        System.out.printf("%-20s %1s %n", "3. Bluetooth", ">");
        System.out.printf("%-20s %1s %n", "4. Mobile Data", ">");
        System.out.printf("%-20s %1s %n", "5. Hotspot", ">");
        System.out.printf("%-20s %1s %n", "6. Notifications", ">");
        System.out.println("0. Quit");
        return InputUtils.getOption("Option: ", 6);
    }

    static void generalMenu() {
        int option;
        while (true) {
            option = general();
            switch (option) {
                case 0:
                    return;
                case 1:
                    about();
                    break;
                case 2:
                    softwareUpdate();
                    break;
                case 3:
                    storage();
                    break;
            }
        }
    }

    static int general() {
        System.out.println();
        System.out.println("General:");
        System.out.printf("%-20s %1s %n", "1. About", ">");
        System.out.printf("%-20s %1s %n", "2. Software update", ">");
        System.out.printf("%-20s %1s %n", "3. Storage", ">");
        System.out.println("0. Back");
        return InputUtils.getOption("Option: ", 3);
    }

    static void about() {
        System.out.println();
        System.out.println("General > About:");
        System.out.printf("%-20s %1s %n", "Name", "iPhone");
        System.out.printf("%-20s %1s %n", "Model", "IXs");
        System.out.printf("%-20s %1s %n", "Version", "18.5");
        System.out.println("0. Back");
        InputUtils.getOption("Option: ", 0);
    }

    static void softwareUpdate() {
        System.out.println();
        System.out.println("General > Software Update:");
        System.out.println("====================");
        System.out.println("Software is up to date");
        System.out.println("====================");
        System.out.println("0. Back");
        InputUtils.getOption("Option: ", 0);
    }

    static void storage() {
        notAvailable("General > Storage");
    }

    static void wifiMenu() {
        int option;
        while (true) {
            option = wifi();
            switch (option) {
                case 0:
                    return;
                case 1:
                    otherNetworks();
                    break;
            }
        }
    }

    static int wifi() {
        System.out.println();
        System.out.println("Wi-Fi:");
        System.out.printf("%-20s %1s %n", "Status", "On");
        System.out.printf("%-20s %1s %n", "Network", "I-Coffee");
        System.out.printf("%-20s %1s %n", "1. Other Networks", ">");
        System.out.println("0. Back");
        return InputUtils.getOption("Option: ", 1);
    }

    static void otherNetworks() {
        System.out.println();
        System.out.println("Wi-Fi > Other networks:");
        System.out.printf("%-20s %1s %n", "Bayon coffee", "*****");
        System.out.printf("%-20s %1s %n", "Angkor coffee", "**");
        System.out.printf("%-20s %1s %n", "Brown coffee", "****");
        System.out.printf("%-20s %1s %n", "Koi", "*");
        System.out.println("0. Back");
        InputUtils.getOption("Option: ", 0);
    }

    static void notAvailable() {
        notAvailable("Title");
    }

    static void notAvailable(String title) {
        System.out.println();
        System.out.println(title + ":");
        System.out.println("============================");
        System.out.println("The Feature is not available");
        System.out.println("============================");
        System.out.println("0. Back");
        InputUtils.getOption("Option: ", 0);
    }
}