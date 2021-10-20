package com.aymen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] t = new int[0];
        //Exercice 3
        //            -  Ali, 11, 13, 18, 7
        //            -  Faten, 15, 9, 8, 16
        Etudiant ali = new Etudiant("Ali", new int[]{11, 13, 18, 7});
        Etudiant faten = new Etudiant("Faten", new int[]{15, 9, 8, 16});
        ali.estAdmis();
        faten.estAdmis();
        //Exercice 2
//        Vecteur v1 = new Vecteur(3);
//        Vecteur v2 = new Vecteur(7,9);
//        //  afficher les deux vecteurs
//        v1.afficher();
//        v2.afficher();
//        // Todo : calculer et afficher le produit scalaire
//        System.out.println("Le produit scalaire est égale à : " + v1.produitScalaire(v2));
        //        Scanner scanner = new Scanner(System.in);
//        int longeur = scanner.nextInt();
//        int largeur = scanner.nextInt();
//
//        Rectangle rectangle = new Rectangle(largeur,longeur);
//        System.out.println("Perimetre = " + rectangle.perimetre());
//        System.out.println("Surface = " + rectangle.surface());
        //        First.nombreInstance();
//        First a = getFirst();
//        First.nombreInstance();
//        First b = getFirst();
//        First.nombreInstance();
//        String s = a.toString();
////        a.equals("cc");
//        System.out.println(s);
    }

//    public static First getFirst() {
//        First newFirst = new First();
//        return newFirst;
//    }
}
