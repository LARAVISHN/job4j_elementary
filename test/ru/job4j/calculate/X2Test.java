package ru.job4j.calculate;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void a1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int out = X2.calc(1, 1, 1, 1);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void a0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int out = X2.calc(0, 1, 1, 1);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void a1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int out = X2.calc(1, 1, 0, 1);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void a1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int out = X2.calc(1, 1, 1, 0);
        Assert.assertEquals(expected, out);

    }

}