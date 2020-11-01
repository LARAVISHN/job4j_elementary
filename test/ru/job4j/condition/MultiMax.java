package ru.job4j.condition;

public class MultiMax {
    public static int multiMax(int first, int second, int third) {
        int max = first > second ? first : second;
        return max > third ? max : third;
    }

    public static void main(String[] args) {
        System.out.println(multiMax(10, 45, 190));
        System.out.println(multiMax(-90, -10, 0));
    }
}
