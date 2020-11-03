package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void whensumByEven() {
        int res = Counter.sumByEven(10, 20);
        assertThat(res, is(90));
    }
}