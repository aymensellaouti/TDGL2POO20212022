package com.aymen.models;

public class Menuisier extends Personne {
    public Menuisier(String name) {
        super(name);
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(" Le Menuisier");
    }
}
