package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when02to22then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(0, 2, 2, 2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when12to11then1() {
        int expected = 1;
        int x1 = 1;
        int y1 = 2;
        int x2 = 1;
        int y2 = 1;
        double out = Point.distance(1, 2, 1, 1);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when11to45then1() {
        int expected = 5;
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 5;
        double out = Point.distance(1, 1, 4, 5);
        Assert.assertEquals(expected, out, 0.01);

    }
}