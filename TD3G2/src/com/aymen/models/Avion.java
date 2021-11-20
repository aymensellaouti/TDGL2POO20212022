package com.aymen.models;

import com.aymen.enums.AvionType;

import java.util.Date;

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
}
