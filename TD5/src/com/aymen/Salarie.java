package com.aymen;

abstract public class Salarie {
    private float salaire;

    public float getSalaire() {
        return this.salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    abstract public void verserSalaire();
}
