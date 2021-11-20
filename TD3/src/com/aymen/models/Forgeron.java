package com.aymen.models;

public class Forgeron extends Personne {
    public Forgeron(String name) {
        super(name);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(" Le Forgeron");
    }
}
