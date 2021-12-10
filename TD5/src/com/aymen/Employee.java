package com.aymen;

public class Employee extends Personne{
    protected double salaire;

    public Employee(int id, String nom, String prenom, double salaire) {
        super(id, nom, prenom);
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salaire=" + salaire +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
