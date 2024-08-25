class Solution {

    public void solveSudoku(char[][] board) {
        int[][] Sudoku = new int[9][9];
        
        // Convert char board to int board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    Sudoku[i][j] = 0;
                } else {
                    Sudoku[i][j] = board[i][j] - '0';
                }
            }
        }

        Solver(Sudoku, 0, 0);

        // Convert int board back to char board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (Sudoku[i][j] == 0) {
                    board[i][j] = '.';
                } else {
                    board[i][j] = (char) (Sudoku[i][j] + '0');
                }
            }
        }
    }

    public static boolean isSafe(int[][] Sudoku, int row, int col, int digit) {
        // Column
        for (int i = 0; i < 9; i++) {
            if (Sudoku[i][col] == digit) {
                return false;
            }
        }
        // Row
        for (int j = 0; j < 9; j++) {
            if (Sudoku[row][j] == digit) {
                return false;
            }
        }
        // Grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (Sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean Solver(int[][] Sudoku, int row, int col) {
        // Base case
        if (row == 9) {
            return true;
        }
        // Recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (Sudoku[row][col] != 0) {
            return Solver(Sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(Sudoku, row, col, digit)) {
                Sudoku[row][col] = digit;
                if (Solver(Sudoku, nextRow, nextCol)) {
                    return true;
                }
                Sudoku[row][col] = 0;
            }
        }
        return false;
    }
}