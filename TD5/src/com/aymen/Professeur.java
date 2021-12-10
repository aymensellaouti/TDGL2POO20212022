package com.aymen;

public class Professeur extends Employee {
    private String specialite;
    public Professeur(int id, String nom, String prenom, double salaire, String specialite) {
        super(id, nom, prenom, salaire);
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "salaire=" + salaire +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", specialite='" + specialite + '\'' +
                '}';
    }
}
