package com.aymen.models;

import com.aymen.enums.TypeAvion;

import java.util.Date;


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
}
