package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "Я люблю Java!";
        System.out.printf(idea);
        int year = 2020;
        idea = "Я люблю Java! Но я новичок." + year;
        System.out.printf(idea);

    }

}
