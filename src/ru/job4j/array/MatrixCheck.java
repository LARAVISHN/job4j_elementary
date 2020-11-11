package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorisontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
            }
        }
        return result;
    }
}