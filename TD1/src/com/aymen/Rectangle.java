package com.aymen;

public class Rectangle {
    private int largeur;
    private int longeur;

    public Rectangle(int largeur, int longeur) {
        this.largeur = largeur;
        this.longeur = longeur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int perimetre() {
        return (this.largeur + this.longeur) * 2;
    }

    public int surface() {
        return this.largeur * this.longeur;
    }
}
