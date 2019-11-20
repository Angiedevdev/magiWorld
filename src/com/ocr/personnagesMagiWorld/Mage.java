package com.ocr.personnagesMagiWorld;

public class Mage extends Personnages {

    private final int vieMax = getVie();
    //Constructeur par défaut
    public Mage() {
        super();
    }
    //Constructeur avec paramètres
    public Mage(int vie, int niveau, int force, int intelligence, int agilite) {
        super(vie, niveau, force, intelligence, agilite);
    }
    @Override
    public void attaqueBasique(Personnages victime) {
        victime.vie = victime.vie - this.intelligence;
        super.attaqueBasique(victime);
    }
    @Override
    public void attaqueSpeciale(Personnages victime) {
        this.vie = this.intelligence * 2;
            if (this.vie > this.getVie())
                this.vie = vieMax;
        super.attaqueSpeciale(victime);
    }
}
