package com.aymen;

public class ClientExterne implements IClient{
    private Compte compte;
    @Override
    public void creerCompte() {
        this.compte = new Compte();
    }
}
