package com.aymen.utils;

public class Chaine {
//    Chaine() {
//
//    }
    public static int stats(String chaine) {
        return 0;
    }
    public static int nbVoyelle(String chaine) {
        String voyelles = "aeiuyoAEIOUY";
        int nbre = 0;
        for (int i = 0; i < chaine.length(); i++ ) {
            if (voyelles.contains(String.valueOf(chaine.charAt(i)))) {
                nbre++;
            };
        }
        return nbre;
    }
}
