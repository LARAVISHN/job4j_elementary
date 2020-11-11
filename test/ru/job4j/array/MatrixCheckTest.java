package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {

    @Test
    public void monoHorisontal() {
        char[][] input = {{' ', ' ', ' '}, {'X', 'X', 'X'}, {' ', ' ', ' '}};
        boolean res = MatrixCheck.monoHorisontal(input, 1);
        assertThat(res, is(true));
    }

    @Test
    public void monoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }
}
