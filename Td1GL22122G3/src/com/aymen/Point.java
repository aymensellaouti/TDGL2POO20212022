package com.aymen;

public class Point {
    private char name;
    private double abscisse;

    public Point(char name, double abscisse) {
        this.name = name;
        this.abscisse = abscisse;
    }
    public void affiche() {
        System.out.println("Point " + name + "d'abscisse " + abscisse);
    }
    public void translate(double translation) {
        this.abscisse += translation;
    }
    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }
}
