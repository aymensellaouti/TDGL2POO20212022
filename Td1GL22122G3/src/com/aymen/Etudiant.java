package com.aymen;

public class Etudiant {
    private String name;
    private int[] notes;

    public Etudiant(String name, int[] notes) {
        this.name = name;
        this.notes = notes;
    }
    public void afficheNotes() {
        for (int note : notes) {
            System.out.println(note);
        }
//        for(int i = 0; i < notes.length; i++) {
//            System.out.println(notes[i]);
//        }
    }

    public float moyenne() {
        float somme = 0;
        for (int note : notes) {
            somme+= note;
        }
        if (notes.length > 0) {
            return somme/notes.length;
        }
        return 0;
    }

    public void result() {
        float moy = moyenne();
        if ( moy >= 10) {
            System.out.println(name + " Votre moyenne est : " + moy + " vous êtes Admis");
        } else {
            System.out.println(name + " Votre moyenne est : " + moy + " vous n'êtes pas Admis");
        }
    }
}
