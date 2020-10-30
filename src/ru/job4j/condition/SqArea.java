package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int h = p / (2 * (k + 1));
        return h * k * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(10, 3);
        System.out.println(" p = 10, k = 3, s = 3, real = " + result1);
    }
}
