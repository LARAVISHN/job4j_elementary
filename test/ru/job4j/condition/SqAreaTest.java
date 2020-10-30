package ru.job4j.condition;

        import org.junit.Assert;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 10;
        int k = 3;
        double expected = 3;
        double out = SqArea.square(10, 3);
        Assert.assertEquals(expected, out, 0.01);
    }
}