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

    @Override
    public void attaqueBasique(Personnages victime) {
        super.attaqueBasique(victime);
        victime.vie = victime.vie - this.agilite;
    }
    @Override
    public void attaqueSpeciale(Personnages victime) {
        this.agilite = this.niveau / 2;
    }
}
