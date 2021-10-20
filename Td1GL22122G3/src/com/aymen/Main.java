package com.aymen;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Exercice 4
        * -  Ali, 11, 13, 18, 7
          -  Faten, 15, 9, 8, 16
        * */
        Etudiant ali = new Etudiant("Ali", new int[] {11, 13, 18, 7});
        Etudiant faten = new Etudiant("Faten", new int[] {15, 9, 8, 16});
        ali.result();
        faten.result();
        /*
        Exercice 3
        * */
//        Vecteur vecteur1 = new Vecteur(4);
//        Vecteur vecteur2 = new Vecteur(7,23);
//        vecteur1.afficher();
//        vecteur2.afficher();
//        System.out.println("le produit scalaire est :" + vecteur1.produitScalaire(vecteur2));
        //        First a =  new First(1);
//        First b = a;
//        System.out.println(a.equals(b));
//        b =  new First(1);
//        System.out.println(a.equals(b));
//        String s = a.toString();
//
//        System.out.println(s);
//        Scanner scanner = new Scanner(System.in);
//        int largeur = scanner.nextInt();
//        int longeur = scanner.nextInt();
//        Rectangle r = new Rectangle(largeur, longeur );
//        System.out.println(r.surface());
//        System.out.println(r.perimetre());
    }
}
