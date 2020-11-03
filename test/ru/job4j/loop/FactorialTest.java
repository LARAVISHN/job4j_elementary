package ru.job4j.loop;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int res = Factorial.calc(5);
        assertThat(res, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int res = Factorial.calc(0);
        assertThat(res, is(1));
    }
}