package com.ocr.personnagesMagiWorld;

public class Mage extends Personnages {

    private final int vieMax = getVie();
    /** Constructeur par défaut de l'objet mage.
     */
    public Mage() {
        super();
    }
    /** Constructeur avec paramètres de l'objet mage.
     * @param agilite
     * @param force
     * @param intelligence
     * @param niveau
     */
    public Mage(int niveau, int force, int intelligence, int agilite) {
        super(niveau, force, intelligence, agilite);
    }
    /** Le joueur attaque sa victime avec attaque de base.
     * @param victime
     */
    @Override
    public void attaqueBasique(Personnages victime) {
        victime.vie = victime.vie - this.intelligence;
        super.attaqueBasique(victime);
    }
    /** Le joueur attaque sa victime avec attaque spécifique.
     * @param victime
     */
    @Override
    public void attaqueSpeciale(Personnages victime) {
        this.vie = this.vie + (this.intelligence * 2);
            if (this.vie > this.getVie())
                this.vie = vieMax;
        super.attaqueSpeciale(victime);
    }
}
