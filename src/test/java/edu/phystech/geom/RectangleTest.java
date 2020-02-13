package edu.phystech.geom;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    private final double EPS = 1e-8;

    @Test
    public void getArea() {
        Rectangle rectangle = new Rectangle(3, 4);
        Assert.assertEquals(12, rectangle.getArea(), EPS);
    }
}