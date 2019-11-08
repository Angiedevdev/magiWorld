package com.ocr.personnagesMagiWorld;

public class Mage extends Personnages {
    public Mage() {
        super();
    }
    //Constructeur avec paramètres
    public Mage(int jNiveau, int jForce, int jIntelligence, int jAgilite) {
        super(jNiveau, jForce, jIntelligence, jAgilite);
        // a virer
        System.out.println("Je suis un mage (" + getVie() + " de vitalité), de niveau " + jNiveau + ", de force " + jForce + ", d'intelligence " + jIntelligence + ", d'agilité " + jAgilite + ".");
    }

    public String AttaqueBasique() {
        // if tour du joueur 1
        //vie.joueur(2) = viejoueur(2) - intelligence.joueur(1);
        //else (tour joueur 2)
        //(vie.joueur(1) = viejoueur(1) - intelligence.joueur(2);
        return "Invocation de l'attaque basique classe fille Mage"; //A retirer après test.
    }
    public String AttaqueSpeciale() {
        // if tour du joueur 1
        //revoir la formule avec Thie car énoncé pas clair pour moi
        //else (tour joueur 2)
        //(vie.joueur(2) = viejoueur(1) - intelligence.joueur(2);
        return "Invocation de l'attaque basique classe fille Mage"; //A retirer après test.
    }
}
