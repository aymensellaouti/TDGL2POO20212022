package com.aymen.models;

public class Rectangle extends Figure {
    private double longeur;
    private double largeur;

    public double surface() {
        return longeur * largeur;
    }


    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Rectangle{" +
            "longeur=" + longeur +
                    ", largeur=" + largeur +
                    '}'
                );

    }

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
}
