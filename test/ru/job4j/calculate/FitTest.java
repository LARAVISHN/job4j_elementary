package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan170Then80() {
        short in = 170;
        double expected = 80.50;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWoman160Then57() {
        short in = 160;
        double expected = 57.50;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}