package com.aymen;

import com.aymen.enums.TypeAvion;
import com.aymen.models.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Exo 3
//        Personne[] personnes = new Personne [4];
//        personnes[0] = new Personne ("Salah");
//        personnes[1] = new Forgeron("Ali");
//        personnes[2] = new Menuisier ("Mohamed");
//        personnes[3] = new Forgeron ("Amor");
//        for (int i=0; i < personnes.length;i++) {
//            personnes[i].afficher();
//        }
        Vehicule v = new Avion("Boing", new Date(2005, 7, 25), 500000, TypeAvion.HELICE, 500);
//        v.
//        Avion v1 =  new Vehicule("cc", new Date(2005, 11, 11), 1234);
	// Ex 1 et 2
//        E1 x = new E1();
//        E2 y = new E2();
//        E3 z = new E3();
//        E4 v = new E4();
//        E5 w = new E5();
//        System.out.println(x.a);  // Correct ou faux ?
////        System.out.println(y.c);  // Correct ou faux ?
//        System.out.println(z.b);  // Correct ou faux ?
////        System.out.println(v.c);  // Correct ou faux ?
//        System.out.println(w.a);
        Voiture[] garage = {
                new Voiture("Renault", new Date(2011, 7, 25), 5000, 4, 4, 5, 30000),
                new Voiture("Peugeot", new Date(2020, 7, 25), 20000, 4, 4, 5, 10000),
                new Voiture("Fiat", new Date(2015, 7, 25), 10000, 4, 4, 5, 100000),
        };
        Avion[] hangar = {
                new Avion("Boing", new Date(2005, 7, 25), 500000, TypeAvion.HELICE, 500),
                new Avion("Boing", new Date(2005, 7, 25), 500000, TypeAvion.REACTION, 70000),
        };
        Vehicule[] vehicules = {
                new Voiture("Renault", new Date(2011, 7, 25), 5000, 4, 4, 5, 30000),
                new Voiture("Peugeot", new Date(2020, 7, 25), 20000, 4, 4, 5, 10000),
                new Voiture("Fiat", new Date(2015, 7, 25), 10000, 4, 4, 5, 100000),
                new Avion("Boing", new Date(2005, 7, 25), 500000, TypeAvion.HELICE, 500),
                new Avion("Boing", new Date(2005, 7, 25), 500000, TypeAvion.REACTION, 70000),
        };
        for (Vehicule vehicule: vehicules) {
            vehicule.afficher();
            vehicule.calculPrix();
        }
    }
}
