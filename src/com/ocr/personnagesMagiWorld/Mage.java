package com.ocr.personnagesMagiWorld;

public class Mage extends Personnages {
    //Constructeur par défaut
    public Mage() {
        super();
    }
    //Constructeur avec paramètres
    public Mage(int vie, int niveau, int force, int intelligence, int agilite) {
        super(vie, niveau, force, intelligence, agilite);
    }
    public void description() {
        System.out.println("Je suis un nouveau mage" + "(" + getVie() + " de vitalité), de niveau " + getNiveau() + ", de force " + getForce() + ", d'intelligence " + getIntelligence() + ", d'agilité " + getAgilite() + ".");
    }
    public void attaqueBasique() {
        //si joueur 1 est attaquant
        vie.joueur2 = joueur2.vie - joueur1.vie;
    }
    public void attaqueSpeciale() {
        vie= intelligence*2;
    }
}
