package edu.phystech.geom;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    private final double EPS = 1e-8;

    @Test
    public void getArea() {
        Circle circle = new Circle(3);
        Assert.assertEquals(Math.PI * 9, circle.getArea(), EPS);
    }
}