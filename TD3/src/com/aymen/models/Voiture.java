package com.aymen.models;

import java.util.Date;
import java.util.Objects;

public class Voiture extends Vehicule {
    int nbreCylindre;
    int nbreporte;
    int puissance;
    int kilometrage;

    public Voiture(String marque, Date dateAchat, float prixAchat, int nbreCylindre, int nbreporte, int puissance, int kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.nbreCylindre = nbreCylindre;
        this.nbreporte = nbreporte;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Voiture{" +
                "nbreCylindre=" + nbreCylindre +
                ", nbreporte=" + nbreporte +
                ", puissance=" + puissance +
                ", kilometrage=" + kilometrage +
                '}');
    }
    @Override
    public void calculPrix() {
        float percent5Number = (float) Math.ceil(kilometrage / 10000);
        int isMoins10 = marque == "Renault" || marque == "Fiat" ? 1 : 0;
        int isPlus20 = (Objects.equals(marque, "Ferrari") || Objects.equals(marque, "Porsche")) ? 1 : 0;
        prixCourant = prixAchat * ( 100 - (percent5Number * 5) - (isMoins10 * 10) + (isPlus20 * 20) ) / 100;
        System.out.println(prixCourant);
    }

}
