package com.aymen.models;

import java.util.Date;

public class Vehicule {
    String marque;
    Date dateAchat;
    float prixAchat;
    float prixCourant;

//    public Vehicule() {}
    public Vehicule(String marque, Date dateAchat, float prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }

    public void afficher() {
        System.out.println("Vehicule{" +
                "marque='" + marque + '\'' +
                ", dateAchat=" + dateAchat +
                ", prixAchat=" + prixAchat +
                ", prixCourant=" + prixCourant +
                '}');
    }
    public void calculPrix() {
        prixCourant = prixAchat;
    }
}
