package edu.phystech.geom;

public class Square extends Figure {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getArea() {
        return a * a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
