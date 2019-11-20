package com.ocr.personnagesMagiWorld;

public class Rodeur extends Personnages {
    //Constructeurs par défaut
    public Rodeur() {
        super();
    }
    //Constructeur avec paramètres
    public Rodeur(int vie, int niveau, int force, int intelligence, int agilite) {
        super(vie, niveau, force, intelligence, agilite);
    }
    @Override
    public void attaqueBasique(Personnages victime) {
        victime.vie = victime.vie - this.agilite;
        super.attaqueBasique(victime);
    }
    @Override
    public void attaqueSpeciale(Personnages victime) {
        this.agilite = this.agilite + (this.niveau / 2);
        super.attaqueSpeciale(victime);
    }
}
