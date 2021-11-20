package com.aymen.models;

public class Figure {
    private double x;
    private double y;

    public double getX() {
        return x;
    }
    public void affiche() {
        System.out.println("x = " + x + " y = " + y);
    }
    public double getY() {
        return y;
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
