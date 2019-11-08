package com.ocr.personnagesMagiWorld;

public class Guerrier extends Personnages {
    public Guerrier() {
        super();
    }
    //Constructeur avec paramètres
    public Guerrier(int jNiveau, int jForce, int jIntelligence, int jAgilite) {
        super(jNiveau, jForce, jIntelligence, jAgilite);
        // a virer
        System.out.println("Je suis un guerrier (" + getVie() + " de vitalité), de niveau " + jNiveau + ", de force " + jForce + ", d'intelligence " + jIntelligence + ", d'agilité " + jAgilite + ".");
    }

    public String AttaqueBasique() {
        //if tour du joueur 1
        //vie.joueur(2) = viejoueur(2) - force.joueur(1);
        //else (tour joueur 2)
        //(vie.joueur(1) = viejoueur(1) - force.joueur(2);
        return "Invocation de l'attaque basique classe fille Guerrier"; //A retirer après test.
    }
    public String AttaqueSpeciale() {
        // if tour du joueur 1
        //vie.joueur(2) = viejoueur(2) - (force*2).joueur(1);
        //else (tour joueur 2)
        //(vie.joueur(1) = viejoueur(1) - (force*2).joueur(2);
        return "Invocation de l'attaque basique classe fille Guerrier"; //A retirer après test.
    }
}
