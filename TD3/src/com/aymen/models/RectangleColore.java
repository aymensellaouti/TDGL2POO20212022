package com.aymen.models;

public class RectangleColore extends Rectangle {
    protected int couleur;
    RectangleColore(int couleur) {
        this.couleur = couleur;
    }
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("couleur : " + couleur);
    }
}
