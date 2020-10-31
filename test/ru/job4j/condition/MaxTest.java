package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;




/** @noinspection checkstyle:EmptyLineSeparator*/
public class MaxTest {

    @Test
    public void whenMax10ToThen3() {
        int result = Max.max(10, 3);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax3ToThen3() {
        int result = Max.max(1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax10ToThen10() {
        int result = Max.max(10, 10);
        assertThat(result, is(10));
    }
}