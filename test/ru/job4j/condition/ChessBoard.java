package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int res = 0;
        if (Math.abs(x1 - y1) == Math.abs(x2 - y2) || (x1 + y1) == (x2 + y2)) {
            res = Math.abs(x2 - x1);

        } else {
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(way(2, 0, 5, 3));
    }

}
