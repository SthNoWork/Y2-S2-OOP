package Ex4;

public class MultiplicationTable {

    static int rowCounter = 0;

    static void insert(String[][] table, String... values) {
        for (int col = 0; col < values.length; col++) {
            table[rowCounter][col] = values[col];
        }
        rowCounter++;
    }

    public static void main(String[] args) {

        String[] headers = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[][] table = new String[5][headers.length];

        insert(table, "1", "1",  "2",  "3",  "4",  "5",  "6",  "7",  "8",  "9",  "10");
        insert(table, "2", "2",  "4",  "6",  "8",  "10", "12", "14", "16", "18", "20");
        insert(table, "3", "3",  "6",  "9",  "12", "15", "18", "21", "24", "27", "30");
        insert(table, "4", "4",  "8",  "12", "16", "20", "24", "28", "32", "36", "40");
        insert(table, "5", "5",  "10", "15", "20", "25", "30", "35", "40", "45", "50");

        // Print header
        for (String c : headers) System.out.printf("%4s|", c);
        System.out.println();
        System.out.println("-".repeat(headers.length * 5 + 1));

        // Print rows
        for (String[] row : table) {
            for (String cell : row) {
                System.out.printf("%4s|", cell);
            }
            System.out.println();
        }
    }
}