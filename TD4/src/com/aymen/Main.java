package com.aymen;

public class Main {

    public static void main(String[] args) {
//	 B b = new B(1, 2, "trois", "quatre");
//     b.decritToi();

     ICrier[] crieurs = {
       new Chat(),
       new Chien(),
       new Chat()
     };
        for (ICrier crieur: crieurs
             ) {
            crieur.crier();
        }
    }
}
