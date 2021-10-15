package com.aymen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        First a =  new First(1);
//        First b = a;
//        System.out.println(a.equals(b));
//        b =  new First(1);
//        System.out.println(a.equals(b));
//        String s = a.toString();
//
//        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        int largeur = scanner.nextInt();
        int longeur = scanner.nextInt();
        Rectangle r = new Rectangle(largeur, longeur );
        System.out.println(r.surface());
        System.out.println(r.perimetre());
    }
}
