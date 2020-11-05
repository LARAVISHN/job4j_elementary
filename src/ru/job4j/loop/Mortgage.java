package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 1;
        double res = (amount + (amount * (percent) / 100)) - salary;

        while (res >= 0) {
            year++;
            res = (res * ((percent) / 100) + res) - salary;
        }
        return year;
    }
}
