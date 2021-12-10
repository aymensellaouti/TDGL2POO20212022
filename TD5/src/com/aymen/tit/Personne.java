package com.aymen.tit;

public class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String mail;
    protected String telephone;
    protected double salaire;

    private static int number = 0;
    public Personne(String nom, String prenom, String mail, String telephone, double salaire) {
        this.id = ++number;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public double calculerSalaire() {
        return salaire;
    }

    public void afficher() {
        System.out.println("Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salaire=" + calculerSalaire() +
                '}');
    }

}
