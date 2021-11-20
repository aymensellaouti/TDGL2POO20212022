package com.aymen.models;

import java.util.Date;

public class Vehicule {
    protected String marque;
    protected Date dateAchat;
    protected float prixAchat;
    protected float prixCourant;

//    public Vehicule() {}
    public Vehicule(String marque, Date dateAchat, float prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }

    public void affiche() {
        System.out.println("Vehicule{" +
                "marque='" + marque + '\'' +
                ", dateAchat=" + dateAchat +
                ", prixAchat=" + prixAchat +
                ", prixCourant=" + prixCourant +
                '}');
    }

    void  calculePrix() {
        prixCourant = prixAchat;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public float getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(float prixAchat) {
        this.prixAchat = prixAchat;
    }

    public float getPrixCourant() {
        return prixCourant;
    }

    public void setPrixCourant(float prixCourant) {
        if (prixCourant >= 0) {
            this.prixCourant = prixCourant;
        }
    }
}
