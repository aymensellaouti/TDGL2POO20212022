package com.aymen.utils;

public class ParcoursTableau {

    private int [] tab;

    public ParcoursTableau(int n) {
        this.tab = new int[n];
    }

    public int [] remplir() {
        for (int i=0; i < tab.length; i++ ) {
            tab[i] = (int) (Math.random() * 100);
        }
        return tab;
    }

    public int[] getTab() {
        return tab;
    }

    public int somme() {
        int somme = 0;
        for (int element : tab) {
            somme += element;
        }
        return somme;
    }
    public float moyenne() {
        if (tab.length == 0) {
            return 0;
        }
        return (float) somme() / tab.length;
    }

    public int min() {
        int min = tab[0];
        for (int element : tab) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }
    public int max() {
        int max = tab[0];
        for (int element : tab) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    public int recherche(int x) {
        for (int i=0; i < tab.length; i++ ) {
            if ( tab[i] == x ) {
                return i;
            }
        }
        return -1;
    }
    public void afficher() {

        for (int element : tab) {
            System.out.println(element);
        }
    }

}
