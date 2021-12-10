package com.aymen.models;

import com.aymen.enums.AvionType;

import java.util.Date;
import java.util.Objects;

public class Avion extends Vehicule {

    protected AvionType type;
    protected int nbreHeureVol;

    public Avion(String marque, Date dateAchat, float prixAchat, AvionType type, int nbreHeureVol) {
        super(marque, dateAchat, prixAchat);
        this.type = type;
        this.nbreHeureVol = nbreHeureVol;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Avion{" +
                "type=" + type +
                ", nbreHeureVol=" + nbreHeureVol +
                '}');
    }


    public AvionType getType() {
        return type;
    }

    public void setType(AvionType type) {
        this.type = type;
    }

    public int getNbreHeureVol() {
        return nbreHeureVol;
    }

    public void setNbreHeureVol(int nbreHeureVol) {
        this.nbreHeureVol = nbreHeureVol;
    }
    @Override
    public void calculePrix() {
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
