package com.ocr.appsMagiWorld;

public class Guerrier extends Personnages{
    public Guerrier() {
        super();
    }
    //Constructeur avec paramètres
    public Guerrier(int jNiveau, int jForce, int jIntelligence, int jAgilite) {
        super(jNiveau, jForce, jIntelligence, jAgilite);
        // a virer
        System.out.println("Je suis un guerrier (" + getVie() + " de vitalité), de niveau " + jNiveau + ", de force " + jForce + ", d'intelligence " + jIntelligence + ", d'agilité " + jAgilite + ".");
    }
}
