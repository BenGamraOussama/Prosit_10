package com.project;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 50);
        Departement d2 = new Departement(2, "Ressources Humaines", 30);
        Departement d3 = new Departement(3, "Marketing", 20);


        gestionDepartements.ajouterDepartement(d1);
        gestionDepartements.ajouterDepartement(d2);
        gestionDepartements.ajouterDepartement(d3);


        System.out.println("Recherche Informatique : " + gestionDepartements.rechercherDepartement("Informatique"));


        System.out.println("Recherche d3 : " + gestionDepartements.rechercherDepartement(d3));


        gestionDepartements.displayDepartement();


        System.out.println("Départements triés par ID : " + gestionDepartements.trierDepartementById());


        gestionDepartements.supprimerDepartement(d2);
        System.out.println("Après suppression : ");
        gestionDepartements.displayDepartement();
    }
}
