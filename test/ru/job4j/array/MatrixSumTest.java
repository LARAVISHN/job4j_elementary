package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MatrixSumTest {

    @Test
    public void whenSingl() {
        int[][] in = {{90}};
        int expect = 90;
        int rsi = MatrixSum.sum(in);
        assertThat(rsi, is(expect));
    }

    @Test
    public void whenTwo() {
        int[][] in = {{1, 2}, {1, 2}};
        int expect = 6;
        int rsi = MatrixSum.sum(in);
        assertThat(rsi, is(expect));
    }

    @Test
    public void whenThree() {
        int[][] in = {{1, 2, 1}, {1, 2, 0}};
        int expect = 7;
        int rsi = MatrixSum.sum(in);
        assertThat(rsi, is(expect));
    }
}
