package com.ocr.personnagesMagiWorld;

public class Rodeur extends Personnages {
    public Rodeur() {
        super();
    }
    //Constructeur avec paramètres
    public Rodeur(int vie, int niveau, int force, int intelligence, int agilite) {
        super(vie, niveau, force, intelligence, agilite);
    }
    public void description() {
        System.out.println("Je suis un nouveau rodeur" + "(" + getVie() + " de vitalité), de niveau " + getNiveau() + ", de force " + getForce() + ", d'intelligence " + getIntelligence() + ", d'agilité " + getAgilite() + ".");
    }
    public void attaqueBasique() {
        //si joueur 1 est attaquant
        vie.joueur(2) = viejoueur(2) - agilite.joueur(1);
    }
    public void attaqueSpeciale() {
        agilite = niveau/2;
    }
}
