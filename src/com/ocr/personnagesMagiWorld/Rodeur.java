package com.ocr.personnagesMagiWorld;

public class Rodeur extends Personnages {

    //Constructeur par defaut
    public Rodeur() {
        super();
    }

    //Constructeur avec paramètres
    public Rodeur(int jNiveau, int jForce, int jIntelligence, int jAgilite) {
        super(jNiveau, jForce, jIntelligence, jAgilite);
        // a virer
        System.out.println("Je suis un rôdeur (" + getVie() + " de vitalité), de niveau " + jNiveau + ", de force " + jForce + ", d'intelligence " + jIntelligence + ", d'agilité " + jAgilite + ".");
    }

    //Mettre ici les attaques
    public String AttaqueBasique() {
        // if tour du joueur 1
        //vie.joueur(2) = viejoueur(2) - agilite.joueur(1);
        //else (tour joueur 2)
        //(vie.joueur(1) = viejoueur(1) - agilite.joueur(2);
        return "Invocation de l'attaque basique classe fille Rodeur"; //A retirer après test.
    }
    public String AttaqueSpeciale() {
        // if tour du joueur 1
        //agilite.joueur(1) = niveaujoueur(1) / 2;
        //else (tour joueur 2)
        //agilite.joueur(2) = niveaujoueur(2) / 2;
        return "Invocation de l'attaque basique classe fille Rodeur"; //A retirer après test.
    }

}
