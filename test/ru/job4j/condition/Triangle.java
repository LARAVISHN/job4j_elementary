package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + bc > ac) && (bc + ac > ab) && (ab + ac > bc);
    }

    public static void main(String[] args) {
        System.out.println(Triangle.exist(2.0, 6.0, 2.0));
    }
}
