package com.aymen;

public class Vecteur {
    private int x;
    private int y;

    public Vecteur(int x) {
        this.x = this.y = x;
    }
    public Vecteur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void afficher() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    public int produitScalaire(Vecteur v) {
        return (x * v.x) + (y * v.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
