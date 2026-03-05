package Ex4;

public class DataTable {

    static int rowCounter = 0;

    static void insert(String[][] table, String... values) {
        for (int col = 0; col < values.length; col++) {
            table[rowCounter][col] = values[col];
        }
        rowCounter++;
    }

    static void printSeparator(int[] widths) {
        for (int w : widths) {
            System.out.print("+" + "=".repeat(w + 2));
        }
        System.out.println("+");
    }

    static void printThinSeparator(int[] widths) {
        for (int w : widths) {
            System.out.print("+" + "-".repeat(w + 2));
        }
        System.out.println("+");
    }

    static void printRow(String[] row, int[] widths) {
        for (int i = 0; i < row.length; i++) {
            System.out.printf("| %-" + widths[i] + "s ", row[i]);
        }
        System.out.println("|");
    }

    static int[] calcWidths(String[] headers, String[][] table) {
        int[] widths = new int[headers.length];
        for (int i = 0; i < headers.length; i++) {
            widths[i] = headers[i].length();
            for (String[] row : table) {
                if (row[i] != null && row[i].length() > widths[i])
                    widths[i] = row[i].length();
            }
        }
        return widths;
    }

    public static void main(String[] args) {

        String[] headers = { "Country", "Name", "Profession", "Age" };
        String[][] table = new String[4][headers.length];

        insert(table, "Germany", "Michael", "Computer Engineer", "19");
        insert(table, "England", "Robert", "Artist", "34");
        insert(table, "United Kingdom", "Julia", "Designer", "42");
        insert(table, "United States", "Jo", "Actor", "21");

        int[] widths = calcWidths(headers, table);

        // Print header
        printSeparator(widths);
        printRow(headers, widths);
        printSeparator(widths);

        // Print rows
        for (String[] row : table) {
            printRow(row, widths);
            printThinSeparator(widths);
        }
    }
}