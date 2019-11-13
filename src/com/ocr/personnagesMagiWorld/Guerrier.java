package com.ocr.personnagesMagiWorld;

public class Guerrier extends Personnages {
    //Constructeur par défaut
    public Guerrier() {
        super();
    }
    //Constructeur avec paramètres
    public Guerrier(int vie, int niveau, int force, int intelligence, int agilite) {
        super(vie, niveau, force, intelligence, agilite);
    }
    public void description() {
        System.out.println("Je suis un nouveau Guerrier" + "(" + getVie() + " de vitalité), de niveau " + getNiveau() + ", de force " + getForce() + ", d'intelligence " + getIntelligence() + ", d'agilité " + getAgilite() + ".");
    }
    public void attaqueBasique() {
        //si joueur 1 est attaquant
        vie.joueur(2) = viejoueur(2) - force.joueur(1);
    }
    public void attaqueSpeciale() {
        vie.joueur(2) = viejoueur(2) - (force*2).joueur(1);
    }
}
