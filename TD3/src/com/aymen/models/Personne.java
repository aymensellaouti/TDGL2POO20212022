package com.aymen.models;

public class Personne {
    protected String name;

    public Personne(String name) {
        this.name = name;
    }
    public void afficher() {
        System.out.print("Je suis " + name);
    }
}
