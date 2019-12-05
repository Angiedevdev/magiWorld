package com.ocr.personnagesMagiWorld;

public class Guerrier extends Personnages {
    /** Constructeur par défaut de l'objet guerrier.
     */
    public Guerrier() {
        super();
    }
    /** Constructeur avec paramètres de l'objet guerrier.
     * @param agilite
     * @param force
     * @param intelligence
     * @param niveau
     */
    public Guerrier(int niveau, int force, int intelligence, int agilite) {
        super(niveau, force, intelligence, agilite);
    }
    /** Le joueur attaque sa victime avec attaque de base.
     * @param victime
     */
    @Override
    public void attaqueBasique(Personnages victime) {
        victime.vie = victime.vie - this.force;
        super.attaqueBasique(victime);
    }
    /** Le joueur attaque sa victime avec attaque spécifique.
     * @param victime
     */
    @Override
    public void attaqueSpeciale(Personnages victime) {
        victime.vie = victime.vie - (this.force * 2);
        this.force = this.force / 2;
        super.attaqueSpeciale(victime);
    }
}
