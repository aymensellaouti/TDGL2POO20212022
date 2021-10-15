package com.aymen;

public class First {
    static int number = 0;
    First() {
        number++;
    }
    int x;

    @Override
    public String toString() {
        return "First{" +
                "x=" + x +
                '}';
    }

    public static void nombreInstance() {
        System.out.println("Le nombre d instance est" + number);
    }
}
