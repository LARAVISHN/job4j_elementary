package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenEl1() {

        int result = FindLoop.indexOf(new int[]{9, 80, 6, 5, 3}, 80);
        assertThat(result, is(1));
    }

    @Test
    public void whenEl3() {
        int[] input = {2, 98, 78, 56};
        int result = FindLoop.indexOf(input, 56);
        assertThat(result, is(3));
    }
}
