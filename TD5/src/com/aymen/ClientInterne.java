package com.aymen;

public class ClientInterne extends Salarie implements IClient{
    private Compte compte;
    public ClientInterne(float salaire) {
        this.setSalaire(salaire);
    }
    @Override
    public void creerCompte() {
        this.compte = new Compte();
    }

    @Override
    public void verserSalaire() {
        this.compte.crediter(this.getSalaire());
    }
}
