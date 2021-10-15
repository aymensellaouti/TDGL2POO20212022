package com.aymen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longeur = scanner.nextInt();
        int largeur = scanner.nextInt();
        Rectangle rectangle = new Rectangle(largeur,longeur);
        System.out.println("Perimetre = " + rectangle.perimetre());
        System.out.println("Surface = " + rectangle.surface());
        //        First.nombreInstance();
//        First a = getFirst();
//        First.nombreInstance();
//        First b = getFirst();
//        First.nombreInstance();
//        String s = a.toString();
////        a.equals("cc");
//        System.out.println(s);
    }

    public static First getFirst() {
        First newFirst = new First();
        return newFirst;
    }
}
