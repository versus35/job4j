package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;



public class PointTest {
    @Test
    public void  distans(){
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 003);
    }
}
