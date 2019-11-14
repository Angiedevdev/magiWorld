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
    @Override
    public void attaqueBasique(Personnages victime) {
        super.attaqueBasique(victime);
        victime.vie = victime.vie - this.force;
    }
    @Override
    public void attaqueSpeciale(Personnages victime) {
        victime.vie = victime.vie - (this.force*2);
        this.force = this.force / 2;
    }
}
