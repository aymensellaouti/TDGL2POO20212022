package com.aymen;

public class Etudiant {
    private String name;
    private int[] notes;

    public Etudiant(String name, int[] notes) {
        this.name = name;
        this.notes = notes;
    }
//            3)  Ecrire une méthode qui affiche les notes de chaque étudiant,
    public void afficherNotes() {
        for (int i = 0; i< notes.length; i++) {
            System.out.println("note " + i + " = " + notes[i] );
        }
    }
//4)  Ecrire une méthode qui calcule la moyenne,
    public float moyenne() {
        if (notes.length != 0) {
            int somme = 0;
            for (int i = 0; i < notes.length; i++) {
                somme += notes[i];
            }
            float moyenne = somme / notes.length;
            System.out.println("La moyenne de " + this.name + " = " + moyenne);
            return moyenne;
        }
        System.out.println("La moyenne de " + this.name + " = 0");
        return 0;
    }

//            5)  Ecrire une méthode qui affiche si l’étudiant est « admis » ou « non admis ».
    public void estAdmis() {
        if (moyenne() >= 10) {
            System.out.println("Admis");
        } else {
            System.out.println("non admis");
        }
    }
//            6)  Ecrire la méthode main permettant de calculer la moyenne et d’afficher le résultat pour les deux
//    étudiants suivants :
//            -  Ali, 11, 13, 18, 7
//            -  Faten, 15, 9, 8, 16
}
