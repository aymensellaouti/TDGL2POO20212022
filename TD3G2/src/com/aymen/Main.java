package com.aymen;

import com.aymen.enums.AvionType;
import com.aymen.models.Voiture;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Voiture renault = new Voiture("Renault", new Date(), 10000, 4, 4, 4, 20000);
        renault.calculePrix();
        renault.affiche();
        if (AvionType.Helices.name() == "HELICES") {
            System.out.println("OK");
        }
	// write your code here
//        E1 x = new E1();
//        E2 y = new E2();
//        E3 z = new E3();
//        E4 v = new E4();
//        E5 w = new E5();
//        System.out.println(x.a);  // Correct ou faux ?
////        System.out.println(y.c);  // Correct ou faux ?
//        System.out.println(z.b);  // Correct ou faux ?
////        System.out.println(v.c);  // Correct ou faux ?
//        System.out.println(w.a);  // Correct ou faux ?
    }
}
