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
    @Override
    public void attaqueBasique(Personnages victime) {
        victime.vie = victime.vie - this.force;
        super.attaqueBasique(victime);
    }
    @Override
    public void attaqueSpeciale(Personnages victime) {
        victime.vie = victime.vie - (this.force*2);
        this.force = this.force / 2;
        super.attaqueSpeciale(victime);
    }
}
