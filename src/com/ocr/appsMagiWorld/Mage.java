package com.ocr.appsMagiWorld;

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
}
