package ru.job4j.calculate;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double result = Fit.manWeight((short) 170);
        double result1 = Fit.womanWeight((short) 160);
        System.out.println("men 170 is  " + result);
        System.out.println("woman 160 is " + result1);
    }
}
