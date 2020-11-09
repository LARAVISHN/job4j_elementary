package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinDiapasonTest {

    @Test
    public void findFirstMin() {
        assertThat(MinDiapason.findMin(new int[]{-1, 0, 5, 10}, 1, 3), is(0));
    }

    @Test
    public void findLastMin() {
        assertThat(MinDiapason.findMin(new int[]{10, 5, 3, 1, 7}, 1, 4), is(1));
    }

    @Test
    public void findMin() {
        assertThat(MinDiapason.findMin(new int[]{12, -7, 5, 6}, 0, 2), is(-7));
    }
}
