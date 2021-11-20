package com.aymen.models;

import com.aymen.enums.TypeAvion;

import java.util.Date;
import java.util.Objects;


public class Avion extends Vehicule {
    TypeAvion type;
    float nbreHeureVol;

    public Avion(String marque, Date dateAchat, float prixAchat, TypeAvion type, float nbreHeureVol) {
        super(marque, dateAchat, prixAchat);
        this.type = type;
        this.nbreHeureVol = nbreHeureVol;
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Avion {" +
                "type=" + type +
                ", nbre Heures de Vol=" + nbreHeureVol +
                '}');
    }

    @Override
    public void calculPrix() {
        int divNb10;
        if (Objects.equals(type, TypeAvion.HELICE.name()) ) {
            divNb10 = 100;
        } else {
            divNb10 = 1000;
        }
        int nb10Pourcents = (int) Math.ceil(nbreHeureVol / divNb10);
        prixCourant = prixAchat * ( 100 - (nb10Pourcents * 10) ) / 100;
        if (prixCourant < 0) {
            prixCourant = 0;
        }
        System.out.println(prixCourant);
    }
}
