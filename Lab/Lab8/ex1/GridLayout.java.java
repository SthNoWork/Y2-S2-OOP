package ex1;

interface GridLayout {
    void insertAtRow(int rowNumber, int[] values);
    void insertAtColumn(int columnNumber, int[] values[]);
    void clearAtRow(int rowNumber);
    void clearAtColumn(int columnNumber);
    void updateCell(int rowNumber, int columnNumber, int value);
    void displayGrid();
    void clear();
}