package com.aymen;

import com.aymen.tit.Profile;
import com.aymen.tit.Utilisateur;

public class Main {

    public static void main(String[] args) {
	 Etudiant etudiant1 = new Etudiant(1, "ben salah", "ahmed", "1234");
	 Etudiant etudiant2 = new Etudiant(2, "chrif", "nouha", "5421");

     Employee employee1 = new Employee(1, "emp1", "emp1", 1000);
     Employee employee2 = new Employee(2, "emp2", "emp2", 1500);

     Professeur professeur1 = new Professeur(1, "prof1", "p1", 10000, "info");
     Professeur professeur2 = new Professeur(2, "prof2", "p2", 15000, "Math");

     Personne[] personnes = {
                etudiant1, etudiant2, employee1, employee2, professeur1, professeur2
        };
        for (Personne personne:personnes
             ) {
            System.out.println(personne);
        }

        Profile cp = new Profile("CP", "Chef de projet");
        Profile mn = new Profile("MN", "Manager");
        Profile dp = new Profile("DP", "Directeur de projet");
        Profile drh = new Profile("DRH", "Directeur des ressources humaines");
        Profile dg = new Profile("DG", "Directeur général");

        Utilisateur u1 = new Utilisateur("user1", "user1", "user1@gmail.com", "123456", 1000, "user1", "user1", "seervice1", cp);
        Utilisateur u2 = new Utilisateur("user2", "user2", "user2@gmail.com", "5555", 15000, "user2", "user2", "seervice2", mn);
        Utilisateur mn2 = new Utilisateur("mn2", "mn2", "mn2@gmail.com", "55551", 17000, "mn2", "mn2", "seervice3", mn);
        Utilisateur u3 = new Utilisateur("user3", "user3", "user3@gmail.com", "55000", 20000, "user3", "user3", "seervice3", dg);

        Utilisateur[] users = {
                u1, u2, mn2, u3
        };

        for (Utilisateur u: users) {
            u.afficher();
        }

        System.out.println("Les managers");
        for (Utilisateur u: users) {
            if(u.getProfile().getCode()== "MN") {
                u.afficher();
            }
        }
    }

}
