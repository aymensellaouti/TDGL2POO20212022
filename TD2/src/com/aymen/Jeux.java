package com.aymen;

import java.util.Scanner;
import com.aymen.utils.*;

public class Jeux {
    private ParcoursTableau pt;
    Jeux() {
         pt = new ParcoursTableau(10);
         pt.remplir();
    }
    void jouer() {
        Scanner scanner = new Scanner(System.in);
        int tentative = scanner.nextInt();
        if (pt.recherche(tentative) >= 0) {
            System.out.println("Vous avez gangé :D");
        } else {
            System.out.println("Vous avez PERDU :D :D");
        };
    }
}
