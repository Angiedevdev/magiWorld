package com.ocr.personnagesMagiWorld;

public class Mage extends Personnages {
    //Constructeur par défaut
    private final int vieMax = getVie();
    public Mage() {
        super();
        final int vieMax;
    }
    //Constructeur avec paramètres
    public Mage(int vie, int niveau, int force, int intelligence, int agilite) {
        super(vie, niveau, force, intelligence, agilite);
        final int vieMax = vie;
    }
    public void description() {
        System.out.println("Je suis un nouveau mage" + "(" + getVie() + " de vitalité), de niveau " + getNiveau() + ", de force " + getForce() + ", d'intelligence " + getIntelligence() + ", d'agilité " + getAgilite() + ".");
    }
    @Override
    public void attaqueBasique(Personnages victime) {
        super.attaqueBasique(victime);
        victime.vie = victime.vie - this.intelligence;
    }
    @Override
    public void attaqueSpeciale(Personnages victime) {
        this.vie= this.intelligence * 2;
        if (this.vie > this.vieMax)
            this.vie = vieMax;
    }

}
