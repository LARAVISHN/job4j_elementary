package ru.job4j.condition;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenFirstMax() {
        int res = MultiMax.multiMax(100, 45, 89);
        assertThat(res, is(100));
    }

    @Test
    public void whenSecondtMax() {
        int res = MultiMax.multiMax(-100, 45, -89);
        assertThat(res, is(45));
    }

    @Test
    public void whenThirdMax() {
        int res = MultiMax.multiMax(100, 45, 989);
        assertThat(res, is(989));
    }
}