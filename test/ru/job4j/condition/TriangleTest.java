package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void exist() {
        boolean rsl = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(rsl, is(true));
    }

    @Test
    public void notExist() {
        boolean rsl = Triangle.exist(2.0, 6.0, 2.0);
        assertThat(rsl, is(false));
    }
}