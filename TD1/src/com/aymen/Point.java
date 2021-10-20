package com.aymen;

public class Point {
    private String name;
    private double abscisse;

    public Point(String name, double abscisse) {
        this.name = name;
        this.abscisse = abscisse;
    }
    public void affiche() {
        System.out.println("Point " + name + "Abscisse : " + abscisse);
    }
    public void translate(double translation) {
        this.abscisse += translation;
    }
}
