package com.aymen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        B b = new B(1, 2, "trois", "quatre");
        b.decritToi();
        ICrieur[] crieurs = {
                new Chat(),
                new Chien(),
                new Chat(),
        };
        for (ICrieur crieur : crieurs
             ) {
            crieur.crier();
        }
    }
}
