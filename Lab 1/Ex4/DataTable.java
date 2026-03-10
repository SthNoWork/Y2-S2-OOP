package Ex4;

public class DataTable {

    static int rowCounter = 0;
    static int[] columnWidths;

    static void insert(String[][] table, String... values) {
        for (int col = 0; col < values.length; col++) {
            table[rowCounter][col] = values[col];
        }
        rowCounter++;
    }

    static void printSeparator() {
        for (int w : columnWidths) {
            System.out.print("+" + "=".repeat(w + 2));
        }
        System.out.println("+");
    }

    static void printThinSeparator() {
        for (int w : columnWidths) {
            System.out.print("+" + "-".repeat(w + 2));
        }
        System.out.println("+");
    }

    static void printRow(String[] row) {
        for (int i = 0; i < row.length; i++) {
            System.out.printf("| %-" + columnWidths[i] + "s ", row[i]);
        }
        System.out.println("|");
    }

    static void findLargestWidth(String[] headers, String[][] table) {
        columnWidths = new int[headers.length];
        for (int i = 0; i < headers.length; i++) {
            columnWidths[i] = headers[i].length();
            for (String[] row : table) {
                if (row[i] != null) {
                    columnWidths[i] = Math.max(columnWidths[i], row[i].length());
                }
            }
        }
    }

    public static void main(String[] args) {

        String[] headers = { "Country", "Name", "Profession", "Age" };
        String[][] table = new String[4][headers.length];

        insert(table, "Germany", "Michael", "Computer Engineer", "19");
        insert(table, "England", "Robert", "Artist", "34");
        insert(table, "United Kingdom", "Julia", "Designer", "42");
        insert(table, "United States", "Jo", "Actor", "21");

        findLargestWidth(headers, table);

        // Print header
        printSeparator();
        printRow(headers);
        printSeparator();

        // Print rows
        for (String[] row : table) {
            printRow(row);
            printThinSeparator();
        }
    }
}