package ex1;

public class GridManagement implements GridLayout {
    private int[][] grid = new int[7][7];

    @Override
    public void insertAtRow(int rowNumber, int[] values) {
        for (int i = 0; i < 7; i++)
            grid[rowNumber][i] = values[i];
    }

    @Override
    public void insertAtColumn(int columnNumber, int[] values[]) {
        for (int i = 0; i < 7; i++)
            grid[i][columnNumber] = values[i][0];
    }

    public void insertAtColumnFlat(int columnNumber, int[] values) {
        for (int i = 0; i < 7; i++)
            grid[i][columnNumber] = values[i];
    }

    @Override
    public void clearAtRow(int rowNumber) {
        for (int i = 0; i < 7; i++)
            grid[rowNumber][i] = 0;
    }

    @Override
    public void clearAtColumn(int columnNumber) {
        for (int i = 0; i < 7; i++)
            grid[i][columnNumber] = 0;
    }

    @Override
    public void updateCell(int rowNumber, int columnNumber, int value) {
        grid[rowNumber][columnNumber] = value;
    }

    @Override
    public void displayGrid() {
        System.out.println(":::: The GRID ::::");
        System.out.println("   0 1 2 3 4 5 6");
        System.out.println("   - - - - - - -");
        for (int r = 0; r < 7; r++) {
            System.out.print(r + " - ");
            for (int c = 0; c < 7; c++)
                System.out.print(grid[r][c] + " ");
            System.out.println();
        }
    }

    @Override
    public void clear() {
        for (int r = 0; r < 7; r++)
            for (int c = 0; c < 7; c++)
                grid[r][c] = 0;
    }
}