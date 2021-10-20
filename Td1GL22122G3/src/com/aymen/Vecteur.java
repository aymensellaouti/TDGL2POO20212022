package com.aymen;

public class Vecteur {
    private float x;
    private float y;

    public Vecteur(float x) {
        this.x = this.y = x;
    }
    public Vecteur(float x, float y) {
            this.x = x;
            this.y = y;
        }

    public void afficher() {
        System.out.println("Les coordonnées du vecteur sont" + x + " , " +  y);
    }
    public float produitScalaire(Vecteur v) {
        return (x * v.x) + (y * v.y);
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
