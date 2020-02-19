package edu.phystech.geom;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    private final double EPS = 1e-8;

    @Test
    public void getArea() {
        Square square = new Square(4);
        Assert.assertEquals(16, square.getArea(), EPS);
    }
}