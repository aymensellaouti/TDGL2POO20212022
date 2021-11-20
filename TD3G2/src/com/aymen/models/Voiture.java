package com.aymen.models;

import java.util.Date;

public class Voiture extends Vehicule {
//    o  sa cylindrée ;
//    o  son nombre de portes ;
//    o  sa puissance ;
//    o  son kilométrage.

    protected int cylindre;
    protected int nbPorte;
    protected int puissance;
    protected int kilometrage;

    public Voiture(String marque, Date dateAchat, float prixAchat, int cylindre, int nbPorte, int puissance, int kilometrage) {
        super(marque, dateAchat, prixAchat);
        this.cylindre = cylindre;
        this.nbPorte = nbPorte;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Voiture{" +
                "cylindre=" + cylindre +
                ", nbPorte=" + nbPorte +
                ", puissance=" + puissance +
                ", kilometrage=" + kilometrage +
                '}');
    }

    public void concatenation() {
        marque = "C" + marque;
        System.out.println(marque);
    }

    public void  calculePrix() {
        int nb5pourcent = (int) Math.ceil(kilometrage/10000);
        int is10pourcent = (marque == "Fiat" || marque == "Renault")? 1 : 0;
        int is20pourcent = (marque == "Ferrari" || marque == "Porsche")? 1 : 0;
        float pourcentage =  (float)(100 - (5 * nb5pourcent + (is10pourcent * 10) - (is20pourcent * 20) )) / 100;
        System.out.println(pourcentage);
        prixCourant = prixAchat * pourcentage;
    }

    public int getCylindre() {
        return cylindre;
    }

    public void setCylindre(int cylindre) {
        this.cylindre = cylindre;
    }

    public int getNbPorte() {
        return nbPorte;
    }

    public void setNbPorte(int nbPorte) {
        this.nbPorte = nbPorte;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(int kilometrage) {
        this.kilometrage = kilometrage;
    }
}
