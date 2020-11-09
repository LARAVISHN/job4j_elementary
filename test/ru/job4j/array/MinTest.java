package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinTest {

    @Test
    public void whenFirstMin() {
        assertThat(Min.findMin(new int[]{0, 1, 5}), is(0));
    }

    @Test
    public void whenLastMin() {
        assertThat(Min.findMin(new int[]{10, 7, 5}), is(5));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(Min.findMin(new int[]{10, 2, 5}), is(2));
    }
}
