package com.aymen.models;

public class Cercle extends Figure {
    protected double rayon;

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("rayon :" + rayon);
    }
    public float surface() {
       return (float) (Math.PI * Math.pow(rayon, 2));
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public boolean estInterieur(double x, double y) {
        //Todo faite le chez vous
        return true;
    }
}
